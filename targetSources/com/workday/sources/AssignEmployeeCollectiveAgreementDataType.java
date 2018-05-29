
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for Assign Employee Collective Agreement event.
 * 
 * <p>Java class for Assign_Employee_Collective_Agreement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assign_Employee_Collective_Agreement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Position_Reference" type="{urn:com.workday/bsvc}Position_ElementObjectType" minOccurs="0"/>
 *         &lt;element name="Collective_Agreement_Reference" type="{urn:com.workday/bsvc}Collective_AgreementObjectType"/>
 *         &lt;element name="Factor_Options" type="{urn:com.workday/bsvc}Collective_Agreement_Factor_Options_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assign_Employee_Collective_Agreement_DataType", propOrder = {
    "positionReference",
    "collectiveAgreementReference",
    "factorOptions"
})
public class AssignEmployeeCollectiveAgreementDataType {

    @XmlElement(name = "Position_Reference")
    protected PositionElementObjectType positionReference;
    @XmlElement(name = "Collective_Agreement_Reference", required = true)
    protected CollectiveAgreementObjectType collectiveAgreementReference;
    @XmlElement(name = "Factor_Options")
    protected CollectiveAgreementFactorOptionsDataType factorOptions;

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
     * Gets the value of the collectiveAgreementReference property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementObjectType }
     *     
     */
    public CollectiveAgreementObjectType getCollectiveAgreementReference() {
        return collectiveAgreementReference;
    }

    /**
     * Sets the value of the collectiveAgreementReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementObjectType }
     *     
     */
    public void setCollectiveAgreementReference(CollectiveAgreementObjectType value) {
        this.collectiveAgreementReference = value;
    }

    /**
     * Gets the value of the factorOptions property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementFactorOptionsDataType }
     *     
     */
    public CollectiveAgreementFactorOptionsDataType getFactorOptions() {
        return factorOptions;
    }

    /**
     * Sets the value of the factorOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementFactorOptionsDataType }
     *     
     */
    public void setFactorOptions(CollectiveAgreementFactorOptionsDataType value) {
        this.factorOptions = value;
    }

}
