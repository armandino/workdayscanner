
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the latest completed disciplinary action for the employee.
 * 
 * <p>Java class for Disciplinary_Action_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Disciplinary_Action_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Disciplinary_Action_Reference" type="{urn:com.workday/bsvc}Disciplinary_ActionObjectType" minOccurs="0"/>
 *         &lt;element name="Disciplinary_Action_Reason_Reference" type="{urn:com.workday/bsvc}Disciplinary_Action_ReasonObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Disciplinary_Action_Related_To_Reference" type="{urn:com.workday/bsvc}Disciplinary_ActionObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Review_Data" type="{urn:com.workday/bsvc}Employee_Review_Details_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Disciplinary_Action_DataType", propOrder = {
    "disciplinaryActionReference",
    "disciplinaryActionReasonReference",
    "disciplinaryActionRelatedToReference",
    "reviewData"
})
public class DisciplinaryActionDataType {

    @XmlElement(name = "Disciplinary_Action_Reference")
    protected DisciplinaryActionObjectType disciplinaryActionReference;
    @XmlElement(name = "Disciplinary_Action_Reason_Reference")
    protected List<DisciplinaryActionReasonObjectType> disciplinaryActionReasonReference;
    @XmlElement(name = "Disciplinary_Action_Related_To_Reference")
    protected List<DisciplinaryActionObjectType> disciplinaryActionRelatedToReference;
    @XmlElement(name = "Review_Data")
    protected EmployeeReviewDetailsDataType reviewData;

    /**
     * Gets the value of the disciplinaryActionReference property.
     * 
     * @return
     *     possible object is
     *     {@link DisciplinaryActionObjectType }
     *     
     */
    public DisciplinaryActionObjectType getDisciplinaryActionReference() {
        return disciplinaryActionReference;
    }

    /**
     * Sets the value of the disciplinaryActionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisciplinaryActionObjectType }
     *     
     */
    public void setDisciplinaryActionReference(DisciplinaryActionObjectType value) {
        this.disciplinaryActionReference = value;
    }

    /**
     * Gets the value of the disciplinaryActionReasonReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disciplinaryActionReasonReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisciplinaryActionReasonReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisciplinaryActionReasonObjectType }
     * 
     * 
     */
    public List<DisciplinaryActionReasonObjectType> getDisciplinaryActionReasonReference() {
        if (disciplinaryActionReasonReference == null) {
            disciplinaryActionReasonReference = new ArrayList<DisciplinaryActionReasonObjectType>();
        }
        return this.disciplinaryActionReasonReference;
    }

    /**
     * Gets the value of the disciplinaryActionRelatedToReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disciplinaryActionRelatedToReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisciplinaryActionRelatedToReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisciplinaryActionObjectType }
     * 
     * 
     */
    public List<DisciplinaryActionObjectType> getDisciplinaryActionRelatedToReference() {
        if (disciplinaryActionRelatedToReference == null) {
            disciplinaryActionRelatedToReference = new ArrayList<DisciplinaryActionObjectType>();
        }
        return this.disciplinaryActionRelatedToReference;
    }

    /**
     * Gets the value of the reviewData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeReviewDetailsDataType }
     *     
     */
    public EmployeeReviewDetailsDataType getReviewData() {
        return reviewData;
    }

    /**
     * Sets the value of the reviewData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeReviewDetailsDataType }
     *     
     */
    public void setReviewData(EmployeeReviewDetailsDataType value) {
        this.reviewData = value;
    }

}
