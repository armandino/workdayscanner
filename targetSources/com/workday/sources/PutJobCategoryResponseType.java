
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing the Put Job Category response data.
 * 
 * <p>Java class for Put_Job_Category_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Job_Category_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Category_Reference" type="{urn:com.workday/bsvc}Job_CategoryObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Job_Category_ResponseType", propOrder = {
    "jobCategoryReference"
})
public class PutJobCategoryResponseType {

    @XmlElement(name = "Job_Category_Reference")
    protected JobCategoryObjectType jobCategoryReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the jobCategoryReference property.
     * 
     * @return
     *     possible object is
     *     {@link JobCategoryObjectType }
     *     
     */
    public JobCategoryObjectType getJobCategoryReference() {
        return jobCategoryReference;
    }

    /**
     * Sets the value of the jobCategoryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobCategoryObjectType }
     *     
     */
    public void setJobCategoryReference(JobCategoryObjectType value) {
        this.jobCategoryReference = value;
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
