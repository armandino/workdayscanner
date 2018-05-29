
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Future payment plan assignment data submitted by the put future payment plan assignment request.
 * 
 * <p>Java class for Future_Payment_Plan_Assignment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Future_Payment_Plan_Assignment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compensation_Plan_Reference" type="{urn:com.workday/bsvc}Future_Payment_PlanObjectType" minOccurs="0"/>
 *         &lt;element name="Individual_Target_Amount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="26"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Individual_Target_Currency_Reference" type="{urn:com.workday/bsvc}CurrencyObjectType" minOccurs="0"/>
 *         &lt;element name="Individual_Target_Payment_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Future_Payment_Plan_Assignment_DataType", propOrder = {
    "compensationPlanReference",
    "individualTargetAmount",
    "individualTargetCurrencyReference",
    "individualTargetPaymentDate",
    "comment"
})
public class FuturePaymentPlanAssignmentDataType {

    @XmlElement(name = "Compensation_Plan_Reference")
    protected FuturePaymentPlanObjectType compensationPlanReference;
    @XmlElement(name = "Individual_Target_Amount")
    protected BigDecimal individualTargetAmount;
    @XmlElement(name = "Individual_Target_Currency_Reference")
    protected CurrencyObjectType individualTargetCurrencyReference;
    @XmlElement(name = "Individual_Target_Payment_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar individualTargetPaymentDate;
    @XmlElement(name = "Comment")
    protected String comment;

    /**
     * Gets the value of the compensationPlanReference property.
     * 
     * @return
     *     possible object is
     *     {@link FuturePaymentPlanObjectType }
     *     
     */
    public FuturePaymentPlanObjectType getCompensationPlanReference() {
        return compensationPlanReference;
    }

    /**
     * Sets the value of the compensationPlanReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuturePaymentPlanObjectType }
     *     
     */
    public void setCompensationPlanReference(FuturePaymentPlanObjectType value) {
        this.compensationPlanReference = value;
    }

    /**
     * Gets the value of the individualTargetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndividualTargetAmount() {
        return individualTargetAmount;
    }

    /**
     * Sets the value of the individualTargetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndividualTargetAmount(BigDecimal value) {
        this.individualTargetAmount = value;
    }

    /**
     * Gets the value of the individualTargetCurrencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyObjectType }
     *     
     */
    public CurrencyObjectType getIndividualTargetCurrencyReference() {
        return individualTargetCurrencyReference;
    }

    /**
     * Sets the value of the individualTargetCurrencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyObjectType }
     *     
     */
    public void setIndividualTargetCurrencyReference(CurrencyObjectType value) {
        this.individualTargetCurrencyReference = value;
    }

    /**
     * Gets the value of the individualTargetPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIndividualTargetPaymentDate() {
        return individualTargetPaymentDate;
    }

    /**
     * Sets the value of the individualTargetPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIndividualTargetPaymentDate(XMLGregorianCalendar value) {
        this.individualTargetPaymentDate = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
