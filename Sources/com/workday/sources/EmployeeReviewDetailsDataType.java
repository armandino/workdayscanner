
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains the information about the review for the employee.
 * 
 * <p>Java class for Employee_Review_Details_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Review_Details_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Manager_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" minOccurs="0"/>
 *         &lt;element name="Multiple_Manager_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Review_Type_Reference" type="{urn:com.workday/bsvc}Review_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Review_Template_Reference" type="{urn:com.workday/bsvc}Employee_Review_TemplateObjectType" minOccurs="0"/>
 *         &lt;element name="Review_Initiated_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Period_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Period_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Self_Evaluation_Data" type="{urn:com.workday/bsvc}Self_Evaluation_Detail_DataType" minOccurs="0"/>
 *         &lt;element name="Manager_Evaluation_Data" type="{urn:com.workday/bsvc}Manager_Evaluation_Detail_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Review_Details_DataType", propOrder = {
    "managerReference",
    "multipleManagerReference",
    "reviewTypeReference",
    "reviewTemplateReference",
    "reviewInitiatedDate",
    "periodStartDate",
    "periodEndDate",
    "selfEvaluationData",
    "managerEvaluationData"
})
public class EmployeeReviewDetailsDataType {

    @XmlElement(name = "Manager_Reference")
    protected WorkerObjectType managerReference;
    @XmlElement(name = "Multiple_Manager_Reference")
    protected List<WorkerObjectType> multipleManagerReference;
    @XmlElement(name = "Review_Type_Reference")
    protected ReviewTypeObjectType reviewTypeReference;
    @XmlElement(name = "Review_Template_Reference")
    protected EmployeeReviewTemplateObjectType reviewTemplateReference;
    @XmlElement(name = "Review_Initiated_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reviewInitiatedDate;
    @XmlElement(name = "Period_Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodStartDate;
    @XmlElement(name = "Period_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodEndDate;
    @XmlElement(name = "Self_Evaluation_Data")
    protected SelfEvaluationDetailDataType selfEvaluationData;
    @XmlElement(name = "Manager_Evaluation_Data")
    protected ManagerEvaluationDetailDataType managerEvaluationData;

    /**
     * Gets the value of the managerReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerObjectType }
     *     
     */
    public WorkerObjectType getManagerReference() {
        return managerReference;
    }

    /**
     * Sets the value of the managerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerObjectType }
     *     
     */
    public void setManagerReference(WorkerObjectType value) {
        this.managerReference = value;
    }

    /**
     * Gets the value of the multipleManagerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multipleManagerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultipleManagerReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerObjectType }
     * 
     * 
     */
    public List<WorkerObjectType> getMultipleManagerReference() {
        if (multipleManagerReference == null) {
            multipleManagerReference = new ArrayList<WorkerObjectType>();
        }
        return this.multipleManagerReference;
    }

    /**
     * Gets the value of the reviewTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReviewTypeObjectType }
     *     
     */
    public ReviewTypeObjectType getReviewTypeReference() {
        return reviewTypeReference;
    }

    /**
     * Sets the value of the reviewTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewTypeObjectType }
     *     
     */
    public void setReviewTypeReference(ReviewTypeObjectType value) {
        this.reviewTypeReference = value;
    }

    /**
     * Gets the value of the reviewTemplateReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeReviewTemplateObjectType }
     *     
     */
    public EmployeeReviewTemplateObjectType getReviewTemplateReference() {
        return reviewTemplateReference;
    }

    /**
     * Sets the value of the reviewTemplateReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeReviewTemplateObjectType }
     *     
     */
    public void setReviewTemplateReference(EmployeeReviewTemplateObjectType value) {
        this.reviewTemplateReference = value;
    }

    /**
     * Gets the value of the reviewInitiatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReviewInitiatedDate() {
        return reviewInitiatedDate;
    }

    /**
     * Sets the value of the reviewInitiatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReviewInitiatedDate(XMLGregorianCalendar value) {
        this.reviewInitiatedDate = value;
    }

    /**
     * Gets the value of the periodStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodStartDate() {
        return periodStartDate;
    }

    /**
     * Sets the value of the periodStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodStartDate(XMLGregorianCalendar value) {
        this.periodStartDate = value;
    }

    /**
     * Gets the value of the periodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodEndDate() {
        return periodEndDate;
    }

    /**
     * Sets the value of the periodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodEndDate(XMLGregorianCalendar value) {
        this.periodEndDate = value;
    }

    /**
     * Gets the value of the selfEvaluationData property.
     * 
     * @return
     *     possible object is
     *     {@link SelfEvaluationDetailDataType }
     *     
     */
    public SelfEvaluationDetailDataType getSelfEvaluationData() {
        return selfEvaluationData;
    }

    /**
     * Sets the value of the selfEvaluationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelfEvaluationDetailDataType }
     *     
     */
    public void setSelfEvaluationData(SelfEvaluationDetailDataType value) {
        this.selfEvaluationData = value;
    }

    /**
     * Gets the value of the managerEvaluationData property.
     * 
     * @return
     *     possible object is
     *     {@link ManagerEvaluationDetailDataType }
     *     
     */
    public ManagerEvaluationDetailDataType getManagerEvaluationData() {
        return managerEvaluationData;
    }

    /**
     * Sets the value of the managerEvaluationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagerEvaluationDetailDataType }
     *     
     */
    public void setManagerEvaluationData(ManagerEvaluationDetailDataType value) {
        this.managerEvaluationData = value;
    }

}
