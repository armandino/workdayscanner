
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
 * Encapsulating element containing the data of the transaction log entry.
 * 
 * <p>Java class for Transaction_Log_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction_Log_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transaction_Log_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transaction_Effective_Moment" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Transaction_Entry_Moment" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Transaction_Log_Type_Reference" type="{urn:com.workday/bsvc}Transaction_Log_TypeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Transaction_Target_Reference" type="{urn:com.workday/bsvc}Event_TargetObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Is_Rescind_Or_Rescinded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Is_Correction_Or_Corrected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction_Log_DataType", propOrder = {
    "transactionLogDescription",
    "transactionEffectiveMoment",
    "transactionEntryMoment",
    "transactionLogTypeReference",
    "transactionTargetReference",
    "isRescindOrRescinded",
    "isCorrectionOrCorrected"
})
public class TransactionLogDataType {

    @XmlElement(name = "Transaction_Log_Description")
    protected String transactionLogDescription;
    @XmlElement(name = "Transaction_Effective_Moment")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionEffectiveMoment;
    @XmlElement(name = "Transaction_Entry_Moment")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionEntryMoment;
    @XmlElement(name = "Transaction_Log_Type_Reference")
    protected List<TransactionLogTypeObjectType> transactionLogTypeReference;
    @XmlElement(name = "Transaction_Target_Reference")
    protected List<EventTargetObjectType> transactionTargetReference;
    @XmlElement(name = "Is_Rescind_Or_Rescinded")
    protected Boolean isRescindOrRescinded;
    @XmlElement(name = "Is_Correction_Or_Corrected")
    protected Boolean isCorrectionOrCorrected;

    /**
     * Gets the value of the transactionLogDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionLogDescription() {
        return transactionLogDescription;
    }

    /**
     * Sets the value of the transactionLogDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionLogDescription(String value) {
        this.transactionLogDescription = value;
    }

    /**
     * Gets the value of the transactionEffectiveMoment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionEffectiveMoment() {
        return transactionEffectiveMoment;
    }

    /**
     * Sets the value of the transactionEffectiveMoment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionEffectiveMoment(XMLGregorianCalendar value) {
        this.transactionEffectiveMoment = value;
    }

    /**
     * Gets the value of the transactionEntryMoment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionEntryMoment() {
        return transactionEntryMoment;
    }

    /**
     * Sets the value of the transactionEntryMoment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionEntryMoment(XMLGregorianCalendar value) {
        this.transactionEntryMoment = value;
    }

    /**
     * Gets the value of the transactionLogTypeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionLogTypeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionLogTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionLogTypeObjectType }
     * 
     * 
     */
    public List<TransactionLogTypeObjectType> getTransactionLogTypeReference() {
        if (transactionLogTypeReference == null) {
            transactionLogTypeReference = new ArrayList<TransactionLogTypeObjectType>();
        }
        return this.transactionLogTypeReference;
    }

    /**
     * Gets the value of the transactionTargetReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionTargetReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionTargetReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventTargetObjectType }
     * 
     * 
     */
    public List<EventTargetObjectType> getTransactionTargetReference() {
        if (transactionTargetReference == null) {
            transactionTargetReference = new ArrayList<EventTargetObjectType>();
        }
        return this.transactionTargetReference;
    }

    /**
     * Gets the value of the isRescindOrRescinded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRescindOrRescinded() {
        return isRescindOrRescinded;
    }

    /**
     * Sets the value of the isRescindOrRescinded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRescindOrRescinded(Boolean value) {
        this.isRescindOrRescinded = value;
    }

    /**
     * Gets the value of the isCorrectionOrCorrected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCorrectionOrCorrected() {
        return isCorrectionOrCorrected;
    }

    /**
     * Sets the value of the isCorrectionOrCorrected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCorrectionOrCorrected(Boolean value) {
        this.isCorrectionOrCorrected = value;
    }

}
