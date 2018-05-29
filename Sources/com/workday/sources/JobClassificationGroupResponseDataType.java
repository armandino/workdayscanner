
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing the Job Classification Group response data
 * 
 * <p>Java class for Job_Classification_Group_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Classification_Group_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Classification_Group" type="{urn:com.workday/bsvc}Job_Classification_Group_NewType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Classification_Group_Response_DataType", propOrder = {
    "jobClassificationGroup"
})
public class JobClassificationGroupResponseDataType {

    @XmlElement(name = "Job_Classification_Group")
    protected List<JobClassificationGroupNewType> jobClassificationGroup;

    /**
     * Gets the value of the jobClassificationGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobClassificationGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobClassificationGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobClassificationGroupNewType }
     * 
     * 
     */
    public List<JobClassificationGroupNewType> getJobClassificationGroup() {
        if (jobClassificationGroup == null) {
            jobClassificationGroup = new ArrayList<JobClassificationGroupNewType>();
        }
        return this.jobClassificationGroup;
    }

}
