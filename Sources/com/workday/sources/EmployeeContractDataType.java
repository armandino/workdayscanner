
package com.workday.sources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains data for an Employee Contract.
 * 
 * <p>Java class for Employee_Contract_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Contract_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Employee_Contract_Reference" type="{urn:com.workday/bsvc}Employee_ContractObjectType" minOccurs="0"/>
 *         &lt;element name="Employee_Contract_Reason_Reference" type="{urn:com.workday/bsvc}Employee_Contract_ReasonObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Employee_Contract_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contract_Type_Reference" type="{urn:com.workday/bsvc}Employee_Contract_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Contract_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Contract_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Employee_Contract_Collective_Agreement_Reference" type="{urn:com.workday/bsvc}Collective_AgreementObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Maximum_Weekly_Hours" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="14"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Minimum_Weekly_Hours" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="14"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Contract_Status_Reference" type="{urn:com.workday/bsvc}Employee_Contract_StatusObjectType"/>
 *         &lt;element name="Position_Reference" type="{urn:com.workday/bsvc}Position_ElementObjectType" minOccurs="0"/>
 *         &lt;element name="Contract_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date_Employee_Signed" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Date_Employer_Signed" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Worker_Document_Reference" type="{urn:com.workday/bsvc}Worker_DocumentObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Contract_DataType", propOrder = {
    "employeeContractReference",
    "employeeContractReasonReference",
    "employeeContractID",
    "effectiveDate",
    "contractID",
    "contractTypeReference",
    "contractStartDate",
    "contractEndDate",
    "employeeContractCollectiveAgreementReference",
    "maximumWeeklyHours",
    "minimumWeeklyHours",
    "contractStatusReference",
    "positionReference",
    "contractDescription",
    "dateEmployeeSigned",
    "dateEmployerSigned",
    "workerDocumentReference"
})
public class EmployeeContractDataType {

    @XmlElement(name = "Employee_Contract_Reference")
    protected EmployeeContractObjectType employeeContractReference;
    @XmlElement(name = "Employee_Contract_Reason_Reference")
    protected List<EmployeeContractReasonObjectType> employeeContractReasonReference;
    @XmlElement(name = "Employee_Contract_ID")
    protected String employeeContractID;
    @XmlElement(name = "Effective_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Contract_ID")
    protected String contractID;
    @XmlElement(name = "Contract_Type_Reference")
    protected EmployeeContractTypeObjectType contractTypeReference;
    @XmlElement(name = "Contract_Start_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractStartDate;
    @XmlElement(name = "Contract_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractEndDate;
    @XmlElement(name = "Employee_Contract_Collective_Agreement_Reference")
    protected List<CollectiveAgreementObjectType> employeeContractCollectiveAgreementReference;
    @XmlElement(name = "Maximum_Weekly_Hours")
    protected BigDecimal maximumWeeklyHours;
    @XmlElement(name = "Minimum_Weekly_Hours")
    protected BigDecimal minimumWeeklyHours;
    @XmlElement(name = "Contract_Status_Reference", required = true)
    protected EmployeeContractStatusObjectType contractStatusReference;
    @XmlElement(name = "Position_Reference")
    protected PositionElementObjectType positionReference;
    @XmlElement(name = "Contract_Description")
    protected String contractDescription;
    @XmlElement(name = "Date_Employee_Signed")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateEmployeeSigned;
    @XmlElement(name = "Date_Employer_Signed")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateEmployerSigned;
    @XmlElement(name = "Worker_Document_Reference")
    protected List<WorkerDocumentObjectType> workerDocumentReference;

    /**
     * Gets the value of the employeeContractReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeContractObjectType }
     *     
     */
    public EmployeeContractObjectType getEmployeeContractReference() {
        return employeeContractReference;
    }

    /**
     * Sets the value of the employeeContractReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeContractObjectType }
     *     
     */
    public void setEmployeeContractReference(EmployeeContractObjectType value) {
        this.employeeContractReference = value;
    }

    /**
     * Gets the value of the employeeContractReasonReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeContractReasonReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeContractReasonReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeContractReasonObjectType }
     * 
     * 
     */
    public List<EmployeeContractReasonObjectType> getEmployeeContractReasonReference() {
        if (employeeContractReasonReference == null) {
            employeeContractReasonReference = new ArrayList<EmployeeContractReasonObjectType>();
        }
        return this.employeeContractReasonReference;
    }

    /**
     * Gets the value of the employeeContractID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeContractID() {
        return employeeContractID;
    }

    /**
     * Sets the value of the employeeContractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeContractID(String value) {
        this.employeeContractID = value;
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
     * Gets the value of the contractID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractID() {
        return contractID;
    }

    /**
     * Sets the value of the contractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractID(String value) {
        this.contractID = value;
    }

    /**
     * Gets the value of the contractTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeContractTypeObjectType }
     *     
     */
    public EmployeeContractTypeObjectType getContractTypeReference() {
        return contractTypeReference;
    }

    /**
     * Sets the value of the contractTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeContractTypeObjectType }
     *     
     */
    public void setContractTypeReference(EmployeeContractTypeObjectType value) {
        this.contractTypeReference = value;
    }

    /**
     * Gets the value of the contractStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractStartDate() {
        return contractStartDate;
    }

    /**
     * Sets the value of the contractStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractStartDate(XMLGregorianCalendar value) {
        this.contractStartDate = value;
    }

    /**
     * Gets the value of the contractEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractEndDate() {
        return contractEndDate;
    }

    /**
     * Sets the value of the contractEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractEndDate(XMLGregorianCalendar value) {
        this.contractEndDate = value;
    }

    /**
     * Gets the value of the employeeContractCollectiveAgreementReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeContractCollectiveAgreementReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeContractCollectiveAgreementReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectiveAgreementObjectType }
     * 
     * 
     */
    public List<CollectiveAgreementObjectType> getEmployeeContractCollectiveAgreementReference() {
        if (employeeContractCollectiveAgreementReference == null) {
            employeeContractCollectiveAgreementReference = new ArrayList<CollectiveAgreementObjectType>();
        }
        return this.employeeContractCollectiveAgreementReference;
    }

    /**
     * Gets the value of the maximumWeeklyHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumWeeklyHours() {
        return maximumWeeklyHours;
    }

    /**
     * Sets the value of the maximumWeeklyHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumWeeklyHours(BigDecimal value) {
        this.maximumWeeklyHours = value;
    }

    /**
     * Gets the value of the minimumWeeklyHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumWeeklyHours() {
        return minimumWeeklyHours;
    }

    /**
     * Sets the value of the minimumWeeklyHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumWeeklyHours(BigDecimal value) {
        this.minimumWeeklyHours = value;
    }

    /**
     * Gets the value of the contractStatusReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeContractStatusObjectType }
     *     
     */
    public EmployeeContractStatusObjectType getContractStatusReference() {
        return contractStatusReference;
    }

    /**
     * Sets the value of the contractStatusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeContractStatusObjectType }
     *     
     */
    public void setContractStatusReference(EmployeeContractStatusObjectType value) {
        this.contractStatusReference = value;
    }

    /**
     * Gets the value of the positionReference property.
     * 
     * @return
     *     possible object is
     *     {@link PositionElementObjectType }
     *     
     */
    public PositionElementObjectType getPositionReference() {
        return positionReference;
    }

    /**
     * Sets the value of the positionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionElementObjectType }
     *     
     */
    public void setPositionReference(PositionElementObjectType value) {
        this.positionReference = value;
    }

    /**
     * Gets the value of the contractDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractDescription() {
        return contractDescription;
    }

    /**
     * Sets the value of the contractDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractDescription(String value) {
        this.contractDescription = value;
    }

    /**
     * Gets the value of the dateEmployeeSigned property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEmployeeSigned() {
        return dateEmployeeSigned;
    }

    /**
     * Sets the value of the dateEmployeeSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEmployeeSigned(XMLGregorianCalendar value) {
        this.dateEmployeeSigned = value;
    }

    /**
     * Gets the value of the dateEmployerSigned property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEmployerSigned() {
        return dateEmployerSigned;
    }

    /**
     * Sets the value of the dateEmployerSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEmployerSigned(XMLGregorianCalendar value) {
        this.dateEmployerSigned = value;
    }

    /**
     * Gets the value of the workerDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerDocumentObjectType }
     * 
     * 
     */
    public List<WorkerDocumentObjectType> getWorkerDocumentReference() {
        if (workerDocumentReference == null) {
            workerDocumentReference = new ArrayList<WorkerDocumentObjectType>();
        }
        return this.workerDocumentReference;
    }

}
