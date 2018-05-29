
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Assign Employee Collective Agreement element that has the Worker data, Position data, effective date and also contains the Collective Agreement data
 * 
 * <p>Java class for Assign_Employee_Collective_Agreement_Event_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assign_Employee_Collective_Agreement_Event_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" minOccurs="0"/>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Collective_Agreement_Data" type="{urn:com.workday/bsvc}Assign_Employee_Collective_Agreement_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assign_Employee_Collective_Agreement_Event_DataType", propOrder = {
    "workerReference",
    "effectiveDate",
    "collectiveAgreementData"
})
public class AssignEmployeeCollectiveAgreementEventDataType {

    @XmlElement(name = "Worker_Reference")
    protected WorkerObjectType workerReference;
    @XmlElement(name = "Effective_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Collective_Agreement_Data", required = true)
    protected AssignEmployeeCollectiveAgreementDataType collectiveAgreementData;

    /**
     * Gets the value of the workerReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerObjectType }
     *     
     */
    public WorkerObjectType getWorkerReference() {
        return workerReference;
    }

    /**
     * Sets the value of the workerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerObjectType }
     *     
     */
    public void setWorkerReference(WorkerObjectType value) {
        this.workerReference = value;
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
     * Gets the value of the collectiveAgreementData property.
     * 
     * @return
     *     possible object is
     *     {@link AssignEmployeeCollectiveAgreementDataType }
     *     
     */
    public AssignEmployeeCollectiveAgreementDataType getCollectiveAgreementData() {
        return collectiveAgreementData;
    }

    /**
     * Sets the value of the collectiveAgreementData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignEmployeeCollectiveAgreementDataType }
     *     
     */
    public void setCollectiveAgreementData(AssignEmployeeCollectiveAgreementDataType value) {
        this.collectiveAgreementData = value;
    }

}
