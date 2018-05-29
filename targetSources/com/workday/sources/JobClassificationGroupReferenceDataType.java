
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A unique identifier used to reference a Job Classification Group.
 * 
 * <p>Java class for Job_Classification_Group_Reference_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Classification_Group_Reference_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Classification_Group_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Classification_Group_Reference_DataType", propOrder = {
    "jobClassificationGroupName"
})
public class JobClassificationGroupReferenceDataType {

    @XmlElement(name = "Job_Classification_Group_Name", required = true)
    protected String jobClassificationGroupName;

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

}
