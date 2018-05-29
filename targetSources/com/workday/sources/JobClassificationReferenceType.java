
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Job Classification.
 * 
 * <p>Java class for Job_Classification_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Classification_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Classification_Group_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Classification_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Classification_ReferenceType", propOrder = {
    "jobClassificationGroupName",
    "jobClassificationName"
})
public class JobClassificationReferenceType {

    @XmlElement(name = "Job_Classification_Group_Name")
    protected String jobClassificationGroupName;
    @XmlElement(name = "Job_Classification_Name")
    protected String jobClassificationName;

    /**
     * Gets the value of the jobClassificationGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobClassificationGroupName() {
        return jobClassificationGroupName;
    }

    /**
     * Sets the value of the jobClassificationGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobClassificationGroupName(String value) {
        this.jobClassificationGroupName = value;
    }

    /**
     * Gets the value of the jobClassificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobClassificationName() {
        return jobClassificationName;
    }

    /**
     * Sets the value of the jobClassificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobClassificationName(String value) {
        this.jobClassificationName = value;
    }

}
