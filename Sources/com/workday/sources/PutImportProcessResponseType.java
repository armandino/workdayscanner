
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Import Process Response element
 * 
 * <p>Java class for Put_Import_Process_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Import_Process_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Import_Process_Reference" type="{urn:com.workday/bsvc}Web_Service_Background_Process_RuntimeObjectType" minOccurs="0"/>
 *         &lt;element name="Header_Instance_Reference" type="{urn:com.workday/bsvc}InstanceObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Import_Process_ResponseType", propOrder = {
    "importProcessReference",
    "headerInstanceReference"
})
public class PutImportProcessResponseType {

    @XmlElement(name = "Import_Process_Reference")
    protected WebServiceBackgroundProcessRuntimeObjectType importProcessReference;
    @XmlElement(name = "Header_Instance_Reference")
    protected InstanceObjectType headerInstanceReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the importProcessReference property.
     * 
     * @return
     *     possible object is
     *     {@link WebServiceBackgroundProcessRuntimeObjectType }
     *     
     */
    public WebServiceBackgroundProcessRuntimeObjectType getImportProcessReference() {
        return importProcessReference;
    }

    /**
     * Sets the value of the importProcessReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceBackgroundProcessRuntimeObjectType }
     *     
     */
    public void setImportProcessReference(WebServiceBackgroundProcessRuntimeObjectType value) {
        this.importProcessReference = value;
    }

    /**
     * Gets the value of the headerInstanceReference property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceObjectType }
     *     
     */
    public InstanceObjectType getHeaderInstanceReference() {
        return headerInstanceReference;
    }

    /**
     * Sets the value of the headerInstanceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceObjectType }
     *     
     */
    public void setHeaderInstanceReference(InstanceObjectType value) {
        this.headerInstanceReference = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
