
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains the organzation role information.
 * 
 * <p>Java class for Organization_Role_Assignment_for_Worker_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Role_Assignment_for_Worker_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Role_Assigner_Reference" type="{urn:com.workday/bsvc}Role_AssignerObjectType" minOccurs="0"/>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Assignment_From" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Role_Assignment_for_Worker_DataType", propOrder = {
    "roleAssignerReference",
    "effectiveDate",
    "assignmentFrom"
})
public class OrganizationRoleAssignmentForWorkerDataType {

    @XmlElement(name = "Role_Assigner_Reference")
    protected RoleAssignerObjectType roleAssignerReference;
    @XmlElement(name = "Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Assignment_From")
    protected String assignmentFrom;

    /**
     * Gets the value of the roleAssignerReference property.
     * 
     * @return
     *     possible object is
     *     {@link RoleAssignerObjectType }
     *     
     */
    public RoleAssignerObjectType getRoleAssignerReference() {
        return roleAssignerReference;
    }

    /**
     * Sets the value of the roleAssignerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleAssignerObjectType }
     *     
     */
    public void setRoleAssignerReference(RoleAssignerObjectType value) {
        this.roleAssignerReference = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the assignmentFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignmentFrom() {
        return assignmentFrom;
    }

    /**
     * Sets the value of the assignmentFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentFrom(String value) {
        this.assignmentFrom = value;
    }

}
