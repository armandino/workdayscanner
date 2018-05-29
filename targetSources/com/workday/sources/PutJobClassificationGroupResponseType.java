
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element for Put Job Classification
 * 
 * <p>Java class for Put_Job_Classification_Group_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Job_Classification_Group_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Classification_Group_Reference" type="{urn:com.workday/bsvc}Job_Classification_GroupObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Job_Classification_Group_ResponseType", propOrder = {
    "jobClassificationGroupReference"
})
public class PutJobClassificationGroupResponseType {

    @XmlElement(name = "Job_Classification_Group_Reference")
    protected JobClassificationGroupObjectType jobClassificationGroupReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the jobClassificationGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link JobClassificationGroupObjectType }
     *     
     */
    public JobClassificationGroupObjectType getJobClassificationGroupReference() {
        return jobClassificationGroupReference;
    }

    /**
     * Sets the value of the jobClassificationGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobClassificationGroupObjectType }
     *     
     */
    public void setJobClassificationGroupReference(JobClassificationGroupObjectType value) {
        this.jobClassificationGroupReference = value;
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
