
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing the job category reference and data.
 * 
 * <p>Java class for Job_CategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_CategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Category_Reference" type="{urn:com.workday/bsvc}Job_CategoryObjectType" minOccurs="0"/>
 *         &lt;element name="Job_Category_Data" type="{urn:com.workday/bsvc}Job_Category_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_CategoryType", propOrder = {
    "jobCategoryReference",
    "jobCategoryData"
})
public class JobCategoryType {

    @XmlElement(name = "Job_Category_Reference")
    protected JobCategoryObjectType jobCategoryReference;
    @XmlElement(name = "Job_Category_Data")
    protected List<JobCategoryDataType> jobCategoryData;

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
     * Gets the value of the jobCategoryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobCategoryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobCategoryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobCategoryDataType }
     * 
     * 
     */
    public List<JobCategoryDataType> getJobCategoryData() {
        if (jobCategoryData == null) {
            jobCategoryData = new ArrayList<JobCategoryDataType>();
        }
        return this.jobCategoryData;
    }

}
