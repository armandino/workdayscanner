
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element that encapsulates the Job Category Data
 * 
 * <p>Java class for Job_Category_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Category_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Category_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Category_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Category_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Category_DataType", propOrder = {
    "jobCategoryID",
    "jobCategoryName",
    "jobCategoryDescription",
    "inactive"
})
public class JobCategoryDataType {

    @XmlElement(name = "Job_Category_ID")
    protected String jobCategoryID;
    @XmlElement(name = "Job_Category_Name")
    protected String jobCategoryName;
    @XmlElement(name = "Job_Category_Description")
    protected String jobCategoryDescription;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;

    /**
     * Gets the value of the jobCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCategoryID() {
        return jobCategoryID;
    }

    /**
     * Sets the value of the jobCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCategoryID(String value) {
        this.jobCategoryID = value;
    }

    /**
     * Gets the value of the jobCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCategoryName() {
        return jobCategoryName;
    }

    /**
     * Sets the value of the jobCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCategoryName(String value) {
        this.jobCategoryName = value;
    }

    /**
     * Gets the value of the jobCategoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCategoryDescription() {
        return jobCategoryDescription;
    }

    /**
     * Sets the value of the jobCategoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCategoryDescription(String value) {
        this.jobCategoryDescription = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

}
