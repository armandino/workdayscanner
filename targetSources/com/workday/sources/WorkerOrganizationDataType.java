
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the worker's organizations that they are a member of.
 * 
 * <p>Java class for Worker_Organization_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Organization_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Organization_Data" type="{urn:com.workday/bsvc}Worker_Organization_Membership_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Organization_DataType", propOrder = {
    "workerOrganizationData"
})
public class WorkerOrganizationDataType {

    @XmlElement(name = "Worker_Organization_Data")
    protected List<WorkerOrganizationMembershipDataType> workerOrganizationData;

    /**
     * Gets the value of the workerOrganizationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerOrganizationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerOrganizationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerOrganizationMembershipDataType }
     * 
     * 
     */
    public List<WorkerOrganizationMembershipDataType> getWorkerOrganizationData() {
        if (workerOrganizationData == null) {
            workerOrganizationData = new ArrayList<WorkerOrganizationMembershipDataType>();
        }
        return this.workerOrganizationData;
    }

}
