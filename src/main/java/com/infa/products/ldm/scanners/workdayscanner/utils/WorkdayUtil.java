package com.infa.products.ldm.scanners.workdayscanner.utils;


import com.ibm.wsdl.PortTypeImpl;
import com.ibm.wsdl.xml.WSDLReaderImpl;
import com.sun.codemodel.internal.JCodeModel;
import com.sun.tools.internal.xjc.api.ErrorListener;
import com.sun.tools.internal.xjc.api.S2JJAXBModel;
import com.sun.tools.internal.xjc.api.SchemaCompiler;
import com.sun.tools.internal.xjc.api.XJC;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.wsdl.Definition;
import javax.wsdl.Operation;
import javax.wsdl.WSDLException;
import javax.wsdl.xml.WSDLReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;

public class WorkdayUtil {

    private final String SERVICE_URL = "https://%s/ccx/service/%s/%s/%s";

    public String buildServiceEndPoint(String domain, String tenant, String service, String version) {

        return String.format(SERVICE_URL, domain, tenant, service, version);
    }

    public String buildWSDLEndPoint(String domain, String tenant, String service, String version) {

        return buildServiceEndPoint(domain, tenant, service, version) + "?wsdl";
    }

    public String buildXSDEndPoint(String domain, String tenant, String service, String version) {

        return buildServiceEndPoint(domain, tenant, service, version) + "?xsd";
    }

    public boolean isAnySpecialWrapperClass(Class clazz) {
        return String.class.equals(clazz) || BigDecimal.class.equals(clazz) ||
                BigInteger.class.equals(clazz);
    }


    public String sanitizeEntityName(String entityName) {

        if (entityName == null) {
            return entityName;
        }

        if (entityName.endsWith("ResponseDataType")) {
            return entityName.substring(0, entityName.length() - "ResponseDataType".length());
        }

        return entityName;
    }

    public String capitalize(String entityName) {

        if(entityName == null){
            return entityName;
        }

        return String.valueOf(entityName.charAt(0)).toUpperCase() + entityName.substring(1);
    }

    public List<Operation> getPortTypeOperations(String wsdlUrl) {
        List<Operation> operationList = new ArrayList();
        try {
            WSDLReader reader = new WSDLReaderImpl();
            reader.setFeature("javax.wsdl.verbose", false);
            Definition definition = reader.readWSDL(wsdlUrl.toString());
            Map<String, PortTypeImpl> defMap = definition.getAllPortTypes();
            Collection<PortTypeImpl> collection = defMap.values();
            for (PortTypeImpl portType : collection) {
                operationList.addAll(portType.getOperations());
            }
        } catch (WSDLException e) {
            e.printStackTrace();
        }
        return operationList;
    }

    public ClassLoader compileSourcesAndLoadClasses(String outputDirectory, String packageName) throws ClassNotFoundException, IllegalAccessException, InstantiationException, MalformedURLException {

        String packagePath = Arrays.stream(packageName.split("\\.")).collect(Collectors.joining("/"));
        File file = new File(outputDirectory + "/" + packagePath);
        URLClassLoader classLoader = null;

        JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();

        StandardJavaFileManager fileManager = javaCompiler.getStandardFileManager(null, null, null);

        Iterable<? extends JavaFileObject> compilationUnit
                = fileManager.getJavaFileObjectsFromFiles(Arrays.asList(file.listFiles()));

        JavaCompiler.CompilationTask task = javaCompiler.getTask(
                null,
                fileManager,
                null,
                null,
                null,
                compilationUnit);

        if (task.call()) {
            System.out.println("success");
            classLoader = new URLClassLoader(new URL[]{new File(outputDirectory).toURI().toURL()});
        }

        return classLoader;
    }

    public List<String> getEntityClassesFromXSD(String xsdFile, List<String> elementNames) {

        try {
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(new File(xsdFile));
            NodeList list = doc.getElementsByTagName("xs:element");

            for (int i = 0; i < list.getLength(); i++) {
                Element first = (Element) list.item(i);
                if (first.hasAttributes()) {
                    String nm = first.getAttribute("name");
                    System.out.println(nm);
                    String nm1 = first.getAttribute("type");
                    System.out.println(nm1);
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException ed) {
            ed.printStackTrace();
        }

        return null;
    }


    public boolean deleteDirectory(File directoryToBeDeleted) {
        File[] allContents = directoryToBeDeleted.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteDirectory(file);
            }
        }
        return directoryToBeDeleted.delete();
    }

    public String generateSourcesFromXSD(String serviceName, File f, String packageName) throws IOException {

        String outputDirectory = f.getPath() + "/Sources";

            File sourcesDirectory = new File(outputDirectory);
            if (sourcesDirectory.exists()) {
                deleteDirectory(sourcesDirectory);
            }

            sourcesDirectory.mkdir();

            SchemaCompiler sc = XJC.createSchemaCompiler();
            sc.forcePackageName(packageName);

            File schemaFile = new File(f.getPath() + "/" + serviceName + ".xsd");
            InputSource is = new InputSource(schemaFile.toURI().toString());

            sc.parseSchema(is);
            S2JJAXBModel model = sc.bind();
            JCodeModel jCodeModel = model.generateCode(null, null);
            jCodeModel.build(new File(outputDirectory));


        return outputDirectory;
    }


    public File createFile(String path) throws IOException {


        File file = new File(path);

        if (file.exists()) {
            file.delete();
        }

        file.createNewFile();

        return file;
    }

    public void fetchFile(String urlStr, File file) throws IOException {
        URL url = new URL(urlStr);
        ReadableByteChannel rbc = Channels.newChannel(url.openStream());
        FileOutputStream fos = new FileOutputStream(file);

        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
        rbc.close();
    }

    public void waitForExecutorService(ExecutorService executorService) {
        executorService.shutdown();
        while (!executorService.isTerminated()) {

        }
    }

}