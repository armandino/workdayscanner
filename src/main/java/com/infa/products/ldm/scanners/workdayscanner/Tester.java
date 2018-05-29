package com.infa.products.ldm.scanners.workdayscanner;

import com.infa.products.ldm.scanners.workdayscanner.model.ReportType;
import report.workday.com.all_custom_reports.CustomReportDataType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {

    public static void main(String args[]) throws ClassNotFoundException, IOException, JAXBException {

        System.out.println(ReportType.ADVANCED.getReportType());

    }


}

class Test {
    public List<String> l = new ArrayList<>();

    void method() {

        URLClassLoader urlClassLoader = (URLClassLoader) getClass().getClassLoader();

        System.out.println(urlClassLoader.getURLs());
        System.out.println(Arrays.toString(urlClassLoader.getURLs()));

    }
}
