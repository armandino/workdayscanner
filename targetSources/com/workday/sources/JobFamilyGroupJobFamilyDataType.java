
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Info only data about a Job Family
 * 
 * <p>Java class for Job_Family_Group_Job_Family_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Family_Group_Job_Family_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Family_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Family_Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Job_Profile_Info_Data" type="{urn:com.workday/bsvc}Job_Profile_Summary_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Family_Group_Job_Family_DataType", propOrder = {
    "jobFamilyName",
    "jobFamilySummary",
    "inactive",
    "jobProfileInfoData"
})
public class JobFamilyGroupJobFamilyDataType {

    @XmlElement(name = "Job_Family_Name")
    protected String jobFamilyName;
    @XmlElement(name = "Job_Family_Summary")
    protected String jobFamilySummary;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;
    @XmlElement(name = "Job_Profile_Info_Data")
    protected List<JobProfileSummaryDataType> jobProfileInfoData;

    /**
     * Gets the value of the jobFamilyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobFamilyName() {
        return jobFamilyName;
    }

    /**
     * Sets the value of the jobFamilyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobFamilyName(String value) {
        this.jobFamilyName = value;
    }

    /**
     * Gets the value of the jobFamilySummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobFamilySummary() {
        return jobFamilySummary;
    }

    /**
     * Sets the value of the jobFamilySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobFamilySummary(String value) {
        this.jobFamilySummary = value;
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

    /**
     * Gets the value of the jobProfileInfoData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobProfileInfoData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobProfileInfoData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobProfileSummaryDataType }
     * 
     * 
     */
    public List<JobProfileSummaryDataType> getJobProfileInfoData() {
        if (jobProfileInfoData == null) {
            jobProfileInfoData = new ArrayList<JobProfileSummaryDataType>();
        }
        return this.jobProfileInfoData;
    }

}
