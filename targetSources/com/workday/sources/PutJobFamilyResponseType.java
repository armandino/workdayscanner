
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element for Put Job Family
 * 
 * <p>Java class for Put_Job_Family_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Job_Family_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Family_Reference" type="{urn:com.workday/bsvc}Job_FamilyObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Job_Family_ResponseType", propOrder = {
    "jobFamilyReference"
})
public class PutJobFamilyResponseType {

    @XmlElement(name = "Job_Family_Reference")
    protected JobFamilyObjectType jobFamilyReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the jobFamilyReference property.
     * 
     * @return
     *     possible object is
     *     {@link JobFamilyObjectType }
     *     
     */
    public JobFamilyObjectType getJobFamilyReference() {
        return jobFamilyReference;
    }

    /**
     * Sets the value of the jobFamilyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobFamilyObjectType }
     *     
     */
    public void setJobFamilyReference(JobFamilyObjectType value) {
        this.jobFamilyReference = value;
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
