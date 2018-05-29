
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the Request References element to retrieve a specific instance(s) of Job Classification Group and its associated data.
 * 
 * <p>Java class for Job_Classification_Group_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Classification_Group_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Classification_Group_Reference" type="{urn:com.workday/bsvc}Job_Classification_GroupObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Classification_Group_Request_ReferencesType", propOrder = {
    "jobClassificationGroupReference"
})
public class JobClassificationGroupRequestReferencesType {

    @XmlElement(name = "Job_Classification_Group_Reference", required = true)
    protected List<JobClassificationGroupObjectType> jobClassificationGroupReference;

    /**
     * Gets the value of the jobClassificationGroupReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobClassificationGroupReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobClassificationGroupReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobClassificationGroupObjectType }
     * 
     * 
     */
    public List<JobClassificationGroupObjectType> getJobClassificationGroupReference() {
        if (jobClassificationGroupReference == null) {
            jobClassificationGroupReference = new ArrayList<JobClassificationGroupObjectType>();
        }
        return this.jobClassificationGroupReference;
    }

}
