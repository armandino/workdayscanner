
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the organization reference and details about an organization.
 * 
 * <p>Java class for Management_Chain_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Management_Chain_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType" minOccurs="0"/>
 *         &lt;element name="Manager_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Manager" type="{urn:com.workday/bsvc}Worker_Basic_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Management_Chain_DataType", propOrder = {
    "organizationReference",
    "managerReference",
    "manager"
})
public class ManagementChainDataType {

    @XmlElement(name = "Organization_Reference")
    protected OrganizationObjectType organizationReference;
    @XmlElement(name = "Manager_Reference")
    protected List<WorkerObjectType> managerReference;
    @XmlElement(name = "Manager")
    protected List<WorkerBasicDataType> manager;

    /**
     * Gets the value of the organizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationObjectType }
     *     
     */
    public OrganizationObjectType getOrganizationReference() {
        return organizationReference;
    }

    /**
     * Sets the value of the organizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationObjectType }
     *     
     */
    public void setOrganizationReference(OrganizationObjectType value) {
        this.organizationReference = value;
    }

    /**
     * Gets the value of the managerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagerReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerObjectType }
     * 
     * 
     */
    public List<WorkerObjectType> getManagerReference() {
        if (managerReference == null) {
            managerReference = new ArrayList<WorkerObjectType>();
        }
        return this.managerReference;
    }

    /**
     * Gets the value of the manager property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manager property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManager().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerBasicDataType }
     * 
     * 
     */
    public List<WorkerBasicDataType> getManager() {
        if (manager == null) {
            manager = new ArrayList<WorkerBasicDataType>();
        }
        return this.manager;
    }

}
