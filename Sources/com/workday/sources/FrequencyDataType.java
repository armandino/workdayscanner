
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for the core frequency data
 * 
 * <p>Java class for Frequency_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Frequency_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Frequency_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Annualization_Factor">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="6"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Frequency_Behavior_Reference" type="{urn:com.workday/bsvc}Frequency_BehaviorObjectType" minOccurs="0"/>
 *         &lt;element name="Use_Weekly_Hours" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Used_in_Payroll_Interface" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Frequency_DataType", propOrder = {
    "frequencyID",
    "name",
    "annualizationFactor",
    "frequencyBehaviorReference",
    "useWeeklyHours",
    "usedInPayrollInterface"
})
public class FrequencyDataType {

    @XmlElement(name = "Frequency_ID")
    protected String frequencyID;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Annualization_Factor", required = true)
    protected BigDecimal annualizationFactor;
    @XmlElement(name = "Frequency_Behavior_Reference")
    protected FrequencyBehaviorObjectType frequencyBehaviorReference;
    @XmlElement(name = "Use_Weekly_Hours")
    protected Boolean useWeeklyHours;
    @XmlElement(name = "Used_in_Payroll_Interface")
    protected Boolean usedInPayrollInterface;

    /**
     * Gets the value of the frequencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyID() {
        return frequencyID;
    }

    /**
     * Sets the value of the frequencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyID(String value) {
        this.frequencyID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the annualizationFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualizationFactor() {
        return annualizationFactor;
    }

    /**
     * Sets the value of the annualizationFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualizationFactor(BigDecimal value) {
        this.annualizationFactor = value;
    }

    /**
     * Gets the value of the frequencyBehaviorReference property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyBehaviorObjectType }
     *     
     */
    public FrequencyBehaviorObjectType getFrequencyBehaviorReference() {
        return frequencyBehaviorReference;
    }

    /**
     * Sets the value of the frequencyBehaviorReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyBehaviorObjectType }
     *     
     */
    public void setFrequencyBehaviorReference(FrequencyBehaviorObjectType value) {
        this.frequencyBehaviorReference = value;
    }

    /**
     * Gets the value of the useWeeklyHours property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseWeeklyHours() {
        return useWeeklyHours;
    }

    /**
     * Sets the value of the useWeeklyHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseWeeklyHours(Boolean value) {
        this.useWeeklyHours = value;
    }

    /**
     * Gets the value of the usedInPayrollInterface property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsedInPayrollInterface() {
        return usedInPayrollInterface;
    }

    /**
     * Sets the value of the usedInPayrollInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsedInPayrollInterface(Boolean value) {
        this.usedInPayrollInterface = value;
    }

}
