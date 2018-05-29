
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Employee photographic image data for a specified employee reference
 * 
 * <p>Java class for Employee_ImageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_ImageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Employee_Reference" type="{urn:com.workday/bsvc}Employee_ReferenceType"/>
 *         &lt;element name="Employee_Image_Data" type="{urn:com.workday/bsvc}Employee_Image_DataType" minOccurs="0"/>
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
@XmlType(name = "Employee_ImageType", propOrder = {
    "employeeReference",
    "employeeImageData"
})
public class EmployeeImageType {

    @XmlElement(name = "Employee_Reference", required = true)
    protected EmployeeReferenceType employeeReference;
    @XmlElement(name = "Employee_Image_Data")
    protected EmployeeImageDataType employeeImageData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the employeeReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeReferenceType }
     *     
     */
    public EmployeeReferenceType getEmployeeReference() {
        return employeeReference;
    }

    /**
     * Sets the value of the employeeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeReferenceType }
     *     
     */
    public void setEmployeeReference(EmployeeReferenceType value) {
        this.employeeReference = value;
    }

    /**
     * Gets the value of the employeeImageData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeImageDataType }
     *     
     */
    public EmployeeImageDataType getEmployeeImageData() {
        return employeeImageData;
    }

    /**
     * Sets the value of the employeeImageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeImageDataType }
     *     
     */
    public void setEmployeeImageData(EmployeeImageDataType value) {
        this.employeeImageData = value;
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
