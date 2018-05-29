
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element containing Transaction Types.
 * 
 * <p>Java class for Transaction_Type_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction_Type_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transaction_Type_Reference" type="{urn:com.workday/bsvc}Transaction_Log_TypeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction_Type_ReferencesType", propOrder = {
    "transactionTypeReference"
})
public class TransactionTypeReferencesType {

    @XmlElement(name = "Transaction_Type_Reference")
    protected List<TransactionLogTypeObjectType> transactionTypeReference;

    /**
     * Gets the value of the transactionTypeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionTypeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionLogTypeObjectType }
     * 
     * 
     */
    public List<TransactionLogTypeObjectType> getTransactionTypeReference() {
        if (transactionTypeReference == null) {
            transactionTypeReference = new ArrayList<TransactionLogTypeObjectType>();
        }
        return this.transactionTypeReference;
    }

}
