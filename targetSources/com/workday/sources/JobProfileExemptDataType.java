
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing the Job Profile Exempt data for a Job Profile.
 * 
 * <p>Java class for Job_Profile_Exempt_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Profile_Exempt_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location_Context_Reference" type="{urn:com.workday/bsvc}Location_ContextObjectType"/>
 *         &lt;element name="Job_Exempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Profile_Exempt_DataType", propOrder = {
    "locationContextReference",
    "jobExempt"
})
public class JobProfileExemptDataType {

    @XmlElement(name = "Location_Context_Reference", required = true)
    protected LocationContextObjectType locationContextReference;
    @XmlElement(name = "Job_Exempt")
    protected Boolean jobExempt;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the locationContextReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationContextObjectType }
     *     
     */
    public LocationContextObjectType getLocationContextReference() {
        return locationContextReference;
    }

    /**
     * Sets the value of the locationContextReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationContextObjectType }
     *     
     */
    public void setLocationContextReference(LocationContextObjectType value) {
        this.locationContextReference = value;
    }

    /**
     * Gets the value of the jobExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJobExempt() {
        return jobExempt;
    }

    /**
     * Sets the value of the jobExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJobExempt(Boolean value) {
        this.jobExempt = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

}
