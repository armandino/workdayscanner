
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing reference instance for a Job Category.
 * 
 * <p>Java class for Job_Category_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Category_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Category_Reference" type="{urn:com.workday/bsvc}Job_CategoryObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Category_Request_ReferencesType", propOrder = {
    "jobCategoryReference"
})
public class JobCategoryRequestReferencesType {

    @XmlElement(name = "Job_Category_Reference", required = true)
    protected List<JobCategoryObjectType> jobCategoryReference;

    /**
     * Gets the value of the jobCategoryReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobCategoryReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobCategoryReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobCategoryObjectType }
     * 
     * 
     */
    public List<JobCategoryObjectType> getJobCategoryReference() {
        if (jobCategoryReference == null) {
            jobCategoryReference = new ArrayList<JobCategoryObjectType>();
        }
        return this.jobCategoryReference;
    }

}
