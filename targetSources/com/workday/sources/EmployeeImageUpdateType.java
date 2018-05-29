
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the following elements to update the Image (e.g. picture) for an existing Employee within the Workday system.
 * 
 * <p>Java class for Employee_Image_UpdateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Image_UpdateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Employee_Reference" type="{urn:com.workday/bsvc}EmployeeObjectType"/>
 *           &lt;element name="Employee_External_ID_Reference" type="{urn:com.workday/bsvc}Employee_ReferenceType"/>
 *         &lt;/choice>
 *         &lt;element name="Employee_Image_Data" type="{urn:com.workday/bsvc}Employee_Image_DataType" maxOccurs="unbounded"/>
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
@XmlType(name = "Employee_Image_UpdateType", propOrder = {
    "employeeReference",
    "employeeExternalIDReference",
    "employeeImageData"
})
public class EmployeeImageUpdateType {

    @XmlElement(name = "Employee_Reference")
    protected EmployeeObjectType employeeReference;
    @XmlElement(name = "Employee_External_ID_Reference")
    protected EmployeeReferenceType employeeExternalIDReference;
    @XmlElement(name = "Employee_Image_Data", required = true)
    protected List<EmployeeImageDataType> employeeImageData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the employeeReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeObjectType }
     *     
     */
    public EmployeeObjectType getEmployeeReference() {
        return employeeReference;
    }

    /**
     * Sets the value of the employeeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeObjectType }
     *     
     */
    public void setEmployeeReference(EmployeeObjectType value) {
        this.employeeReference = value;
    }

    /**
     * Gets the value of the employeeExternalIDReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeReferenceType }
     *     
     */
    public EmployeeReferenceType getEmployeeExternalIDReference() {
        return employeeExternalIDReference;
    }

    /**
     * Sets the value of the employeeExternalIDReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeReferenceType }
     *     
     */
    public void setEmployeeExternalIDReference(EmployeeReferenceType value) {
        this.employeeExternalIDReference = value;
    }

    /**
     * Gets the value of the employeeImageData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeImageData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeImageData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeImageDataType }
     * 
     * 
     */
    public List<EmployeeImageDataType> getEmployeeImageData() {
        if (employeeImageData == null) {
            employeeImageData = new ArrayList<EmployeeImageDataType>();
        }
        return this.employeeImageData;
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
