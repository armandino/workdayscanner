
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains data for adding or updating a Workers' Compensation Code.
 * 
 * <p>Java class for Put_Workers_Compensation_Code_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Workers_Compensation_Code_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Workers_Compensation_Code_Reference" type="{urn:com.workday/bsvc}Workers_Compensation_CodeObjectType" minOccurs="0"/>
 *         &lt;element name="Workers_Compensation_Code_Data" type="{urn:com.workday/bsvc}Workers_Compensation_Code_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Workers_Compensation_Code_RequestType", propOrder = {
    "workersCompensationCodeReference",
    "workersCompensationCodeData"
})
public class PutWorkersCompensationCodeRequestType {

    @XmlElement(name = "Workers_Compensation_Code_Reference")
    protected WorkersCompensationCodeObjectType workersCompensationCodeReference;
    @XmlElement(name = "Workers_Compensation_Code_Data", required = true)
    protected WorkersCompensationCodeDataType workersCompensationCodeData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the workersCompensationCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkersCompensationCodeObjectType }
     *     
     */
    public WorkersCompensationCodeObjectType getWorkersCompensationCodeReference() {
        return workersCompensationCodeReference;
    }

    /**
     * Sets the value of the workersCompensationCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkersCompensationCodeObjectType }
     *     
     */
    public void setWorkersCompensationCodeReference(WorkersCompensationCodeObjectType value) {
        this.workersCompensationCodeReference = value;
    }

    /**
     * Gets the value of the workersCompensationCodeData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkersCompensationCodeDataType }
     *     
     */
    public WorkersCompensationCodeDataType getWorkersCompensationCodeData() {
        return workersCompensationCodeData;
    }

    /**
     * Sets the value of the workersCompensationCodeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkersCompensationCodeDataType }
     *     
     */
    public void setWorkersCompensationCodeData(WorkersCompensationCodeDataType value) {
        this.workersCompensationCodeData = value;
    }

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
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
