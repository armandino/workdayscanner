
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains each Job Profile based on the Request References or Request Criteria.  The data returned is the current information as of the dates in the response filter, and does not include all historical information about the job profile.
 * 
 * <p>Java class for Job_Profile_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Profile_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Profile" type="{urn:com.workday/bsvc}Job_Profile_Get_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Profile_Response_DataType", propOrder = {
    "jobProfile"
})
public class JobProfileResponseDataType {

    @XmlElement(name = "Job_Profile")
    protected List<JobProfileGetDataType> jobProfile;

    /**
     * Gets the value of the jobProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobProfileGetDataType }
     * 
     * 
     */
    public List<JobProfileGetDataType> getJobProfile() {
        if (jobProfile == null) {
            jobProfile = new ArrayList<JobProfileGetDataType>();
        }
        return this.jobProfile;
    }

}
