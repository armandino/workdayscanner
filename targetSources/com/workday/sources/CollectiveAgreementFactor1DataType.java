
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for the collective agreement factor 1 and factor option 1 data.
 * 
 * <p>Java class for Collective_Agreement_Factor_1_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Collective_Agreement_Factor_1_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Collective_Agreement_Factor_1_Reference" type="{urn:com.workday/bsvc}Collective_Agreement_FactorObjectType" minOccurs="0"/>
 *         &lt;element name="Collective_Agreement_Factor_Option_1_Reference" type="{urn:com.workday/bsvc}Collective_Agreement_Factor_OptionObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collective_Agreement_Factor_1_DataType", propOrder = {
    "collectiveAgreementFactor1Reference",
    "collectiveAgreementFactorOption1Reference"
})
public class CollectiveAgreementFactor1DataType {

    @XmlElement(name = "Collective_Agreement_Factor_1_Reference")
    protected CollectiveAgreementFactorObjectType collectiveAgreementFactor1Reference;
    @XmlElement(name = "Collective_Agreement_Factor_Option_1_Reference")
    protected CollectiveAgreementFactorOptionObjectType collectiveAgreementFactorOption1Reference;

    /**
     * Gets the value of the collectiveAgreementFactor1Reference property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementFactorObjectType }
     *     
     */
    public CollectiveAgreementFactorObjectType getCollectiveAgreementFactor1Reference() {
        return collectiveAgreementFactor1Reference;
    }

    /**
     * Sets the value of the collectiveAgreementFactor1Reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementFactorObjectType }
     *     
     */
    public void setCollectiveAgreementFactor1Reference(CollectiveAgreementFactorObjectType value) {
        this.collectiveAgreementFactor1Reference = value;
    }

    /**
     * Gets the value of the collectiveAgreementFactorOption1Reference property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementFactorOptionObjectType }
     *     
     */
    public CollectiveAgreementFactorOptionObjectType getCollectiveAgreementFactorOption1Reference() {
        return collectiveAgreementFactorOption1Reference;
    }

    /**
     * Sets the value of the collectiveAgreementFactorOption1Reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementFactorOptionObjectType }
     *     
     */
    public void setCollectiveAgreementFactorOption1Reference(CollectiveAgreementFactorOptionObjectType value) {
        this.collectiveAgreementFactorOption1Reference = value;
    }

}
