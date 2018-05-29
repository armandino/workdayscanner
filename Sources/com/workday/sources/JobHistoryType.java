
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for Job History information.
 * 
 * <p>Java class for Job_HistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_HistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_History_Reference" type="{urn:com.workday/bsvc}Job_History_SkillObjectType" minOccurs="0"/>
 *         &lt;element name="Job_History_Data" type="{urn:com.workday/bsvc}Job_History_Achievement_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_HistoryType", propOrder = {
    "jobHistoryReference",
    "jobHistoryData"
})
public class JobHistoryType {

    @XmlElement(name = "Job_History_Reference")
    protected JobHistorySkillObjectType jobHistoryReference;
    @XmlElement(name = "Job_History_Data")
    protected List<JobHistoryAchievementDataType> jobHistoryData;

    /**
     * Gets the value of the jobHistoryReference property.
     * 
     * @return
     *     possible object is
     *     {@link JobHistorySkillObjectType }
     *     
     */
    public JobHistorySkillObjectType getJobHistoryReference() {
        return jobHistoryReference;
    }

    /**
     * Sets the value of the jobHistoryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobHistorySkillObjectType }
     *     
     */
    public void setJobHistoryReference(JobHistorySkillObjectType value) {
        this.jobHistoryReference = value;
    }

    /**
     * Gets the value of the jobHistoryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobHistoryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobHistoryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobHistoryAchievementDataType }
     * 
     * 
     */
    public List<JobHistoryAchievementDataType> getJobHistoryData() {
        if (jobHistoryData == null) {
            jobHistoryData = new ArrayList<JobHistoryAchievementDataType>();
        }
        return this.jobHistoryData;
    }

}
