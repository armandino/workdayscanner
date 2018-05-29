
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This section holds the employee's election and the maximum the employee can elect when the benefit plan uses percentages as elections.
 * 
 * <p>Java class for Employee_Contribution_Percentage_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Contribution_Percentage_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Election_Percentage">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Contribution_Percentage_Maximum">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
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
@XmlType(name = "Employee_Contribution_Percentage_DataType", propOrder = {
    "electionPercentage",
    "contributionPercentageMaximum"
})
public class EmployeeContributionPercentageDataType {

    @XmlElement(name = "Election_Percentage", required = true)
    protected BigDecimal electionPercentage;
    @XmlElement(name = "Contribution_Percentage_Maximum", required = true)
    protected BigDecimal contributionPercentageMaximum;

    /**
     * Gets the value of the electionPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElectionPercentage() {
        return electionPercentage;
    }

    /**
     * Sets the value of the electionPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setElectionPercentage(BigDecimal value) {
        this.electionPercentage = value;
    }

    /**
     * Gets the value of the contributionPercentageMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContributionPercentageMaximum() {
        return contributionPercentageMaximum;
    }

    /**
     * Sets the value of the contributionPercentageMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContributionPercentageMaximum(BigDecimal value) {
        this.contributionPercentageMaximum = value;
    }

}
