
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the information about the employee's  job interests.
 * 
 * <p>Java class for Job_Interests_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Interests_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Profile_Reference" type="{urn:com.workday/bsvc}Job_ProfileObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Interests_DataType", propOrder = {
    "jobProfileReference"
})
public class JobInterestsDataType {

    @XmlElement(name = "Job_Profile_Reference")
    protected List<JobProfileObjectType> jobProfileReference;

    /**
     * Gets the value of the jobProfileReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobProfileReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobProfileReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobProfileObjectType }
     * 
     * 
     */
    public List<JobProfileObjectType> getJobProfileReference() {
        if (jobProfileReference == null) {
            jobProfileReference = new ArrayList<JobProfileObjectType>();
        }
        return this.jobProfileReference;
    }

}
