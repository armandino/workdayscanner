
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the Request Criteria element to search for provisioning group assignments to specific workers or persons.
 * 
 * <p>Java class for Provisioning_Group_Assignment_Request_CriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Provisioning_Group_Assignment_Request_CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Provisioning_Group_Assignment_Request_CriteriaType", propOrder = {
    "personReference",
    "workerReference"
})
public class ProvisioningGroupAssignmentRequestCriteriaType {

    @XmlElement(name = "Person_Reference")
    protected List<UniqueIdentifierObjectType> personReference;
    @XmlElement(name = "Worker_Reference")
    protected List<WorkerObjectType> workerReference;

    /**
     * Gets the value of the personReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIdentifierObjectType }
     * 
     * 
     */
    public List<UniqueIdentifierObjectType> getPersonReference() {
        if (personReference == null) {
            personReference = new ArrayList<UniqueIdentifierObjectType>();
        }
        return this.personReference;
    }

    /**
     * Gets the value of the workerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerObjectType }
     * 
     * 
     */
    public List<WorkerObjectType> getWorkerReference() {
        if (workerReference == null) {
            workerReference = new ArrayList<WorkerObjectType>();
        }
        return this.workerReference;
    }

}
