
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Searches the transaction log for business processes and event lites to find specific events that occurred during a period of time.
 * 
 * <p>Java class for Transaction_Log_CriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction_Log_CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transaction_Date_Range_Data" type="{urn:com.workday/bsvc}Effective_And_Updated_DateTime_DataType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="Transaction_Type_References" type="{urn:com.workday/bsvc}Transaction_Type_ReferencesType" minOccurs="0"/>
 *           &lt;element name="Subscriber_Reference" type="{urn:com.workday/bsvc}SubscriberObjectType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction_Log_CriteriaType", propOrder = {
    "transactionDateRangeData",
    "transactionTypeReferences",
    "subscriberReference"
})
public class TransactionLogCriteriaType {

    @XmlElement(name = "Transaction_Date_Range_Data")
    protected EffectiveAndUpdatedDateTimeDataType transactionDateRangeData;
    @XmlElement(name = "Transaction_Type_References")
    protected TransactionTypeReferencesType transactionTypeReferences;
    @XmlElement(name = "Subscriber_Reference")
    protected SubscriberObjectType subscriberReference;

    /**
     * Gets the value of the transactionDateRangeData property.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveAndUpdatedDateTimeDataType }
     *     
     */
    public EffectiveAndUpdatedDateTimeDataType getTransactionDateRangeData() {
        return transactionDateRangeData;
    }

    /**
     * Sets the value of the transactionDateRangeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveAndUpdatedDateTimeDataType }
     *     
     */
    public void setTransactionDateRangeData(EffectiveAndUpdatedDateTimeDataType value) {
        this.transactionDateRangeData = value;
    }

    /**
     * Gets the value of the transactionTypeReferences property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTypeReferencesType }
     *     
     */
    public TransactionTypeReferencesType getTransactionTypeReferences() {
        return transactionTypeReferences;
    }

    /**
     * Sets the value of the transactionTypeReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTypeReferencesType }
     *     
     */
    public void setTransactionTypeReferences(TransactionTypeReferencesType value) {
        this.transactionTypeReferences = value;
    }

    /**
     * Gets the value of the subscriberReference property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberObjectType }
     *     
     */
    public SubscriberObjectType getSubscriberReference() {
        return subscriberReference;
    }

    /**
     * Sets the value of the subscriberReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberObjectType }
     *     
     */
    public void setSubscriberReference(SubscriberObjectType value) {
        this.subscriberReference = value;
    }

}
