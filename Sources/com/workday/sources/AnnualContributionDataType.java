
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The annual contribution for the spending account election.
 * 
 * <p>Java class for Annual_Contribution_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Annual_Contribution_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Annual_Contribution_Amount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="21"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Prior_Contribution_Amount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="21"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Remaining_Periods">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Annual_Contribution_DataType", propOrder = {
    "annualContributionAmount",
    "priorContributionAmount",
    "remainingPeriods"
})
public class AnnualContributionDataType {

    @XmlElement(name = "Annual_Contribution_Amount", required = true)
    protected BigDecimal annualContributionAmount;
    @XmlElement(name = "Prior_Contribution_Amount", required = true)
    protected BigDecimal priorContributionAmount;
    @XmlElement(name = "Remaining_Periods", required = true)
    protected BigDecimal remainingPeriods;

    /**
     * Gets the value of the annualContributionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualContributionAmount() {
        return annualContributionAmount;
    }

    /**
     * Sets the value of the annualContributionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualContributionAmount(BigDecimal value) {
        this.annualContributionAmount = value;
    }

    /**
     * Gets the value of the priorContributionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriorContributionAmount() {
        return priorContributionAmount;
    }

    /**
     * Sets the value of the priorContributionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriorContributionAmount(BigDecimal value) {
        this.priorContributionAmount = value;
    }

    /**
     * Gets the value of the remainingPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainingPeriods() {
        return remainingPeriods;
    }

    /**
     * Sets the value of the remainingPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainingPeriods(BigDecimal value) {
        this.remainingPeriods = value;
    }

}
