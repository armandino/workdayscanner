
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the Request References element to retrieve a specific instance(s) of Job Family Group and its associated data.
 * 
 * <p>Java class for Job_Family_Group_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Family_Group_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Family_Group_Reference" type="{urn:com.workday/bsvc}Job_FamilyObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Skip_Non_Existing_Instances" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Family_Group_Request_ReferencesType", propOrder = {
    "jobFamilyGroupReference"
})
public class JobFamilyGroupRequestReferencesType {

    @XmlElement(name = "Job_Family_Group_Reference", required = true)
    protected List<JobFamilyObjectType> jobFamilyGroupReference;
    @XmlAttribute(name = "Skip_Non_Existing_Instances", namespace = "urn:com.workday/bsvc")
    protected Boolean skipNonExistingInstances;

    /**
     * Gets the value of the jobFamilyGroupReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobFamilyGroupReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobFamilyGroupReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobFamilyObjectType }
     * 
     * 
     */
    public List<JobFamilyObjectType> getJobFamilyGroupReference() {
        if (jobFamilyGroupReference == null) {
            jobFamilyGroupReference = new ArrayList<JobFamilyObjectType>();
        }
        return this.jobFamilyGroupReference;
    }

    /**
     * Gets the value of the skipNonExistingInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipNonExistingInstances() {
        return skipNonExistingInstances;
    }

    /**
     * Sets the value of the skipNonExistingInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipNonExistingInstances(Boolean value) {
        this.skipNonExistingInstances = value;
    }

}
