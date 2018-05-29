
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains a single Goal Detail (Review Goal or Worker Goal Detail) and the Notes and History.
 * 
 * <p>Java class for Goal_Detail_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Goal_Detail_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Goal_Reference_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Goal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organization_Goal_Reference" type="{urn:com.workday/bsvc}Organization_GoalObjectType" minOccurs="0"/>
 *         &lt;element name="Due_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Completion_Status_Reference" type="{urn:com.workday/bsvc}Component_CompletionObjectType" minOccurs="0"/>
 *         &lt;element name="Completion_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Goal_Detail_DataType", propOrder = {
    "goalReferenceID",
    "goal",
    "description",
    "organizationGoalReference",
    "dueDate",
    "completionStatusReference",
    "completionDate"
})
public class GoalDetailDataType {

    @XmlElement(name = "Goal_Reference_ID")
    protected String goalReferenceID;
    @XmlElement(name = "Goal")
    protected String goal;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Organization_Goal_Reference")
    protected OrganizationGoalObjectType organizationGoalReference;
    @XmlElement(name = "Due_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "Completion_Status_Reference")
    protected ComponentCompletionObjectType completionStatusReference;
    @XmlElement(name = "Completion_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar completionDate;

    /**
     * Gets the value of the goalReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalReferenceID() {
        return goalReferenceID;
    }

    /**
     * Sets the value of the goalReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalReferenceID(String value) {
        this.goalReferenceID = value;
    }

    /**
     * Gets the value of the goal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoal() {
        return goal;
    }

    /**
     * Sets the value of the goal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoal(String value) {
        this.goal = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the organizationGoalReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationGoalObjectType }
     *     
     */
    public OrganizationGoalObjectType getOrganizationGoalReference() {
        return organizationGoalReference;
    }

    /**
     * Sets the value of the organizationGoalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationGoalObjectType }
     *     
     */
    public void setOrganizationGoalReference(OrganizationGoalObjectType value) {
        this.organizationGoalReference = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the completionStatusReference property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentCompletionObjectType }
     *     
     */
    public ComponentCompletionObjectType getCompletionStatusReference() {
        return completionStatusReference;
    }

    /**
     * Sets the value of the completionStatusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentCompletionObjectType }
     *     
     */
    public void setCompletionStatusReference(ComponentCompletionObjectType value) {
        this.completionStatusReference = value;
    }

    /**
     * Gets the value of the completionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletionDate() {
        return completionDate;
    }

    /**
     * Sets the value of the completionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletionDate(XMLGregorianCalendar value) {
        this.completionDate = value;
    }

}
