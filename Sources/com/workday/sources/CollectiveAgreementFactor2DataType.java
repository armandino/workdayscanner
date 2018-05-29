
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for the collective agreement factor 2 and factor option 2 data.
 * 
 * <p>Java class for Collective_Agreement_Factor_2_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Collective_Agreement_Factor_2_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Collective_Agreement_Factor_2_Reference" type="{urn:com.workday/bsvc}Collective_Agreement_FactorObjectType" minOccurs="0"/>
 *         &lt;element name="Collective_Agreement_Factor_Option_2_Reference" type="{urn:com.workday/bsvc}Collective_Agreement_Factor_OptionObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collective_Agreement_Factor_2_DataType", propOrder = {
    "collectiveAgreementFactor2Reference",
    "collectiveAgreementFactorOption2Reference"
})
public class CollectiveAgreementFactor2DataType {

    @XmlElement(name = "Collective_Agreement_Factor_2_Reference")
    protected CollectiveAgreementFactorObjectType collectiveAgreementFactor2Reference;
    @XmlElement(name = "Collective_Agreement_Factor_Option_2_Reference")
    protected CollectiveAgreementFactorOptionObjectType collectiveAgreementFactorOption2Reference;

    /**
     * Gets the value of the collectiveAgreementFactor2Reference property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementFactorObjectType }
     *     
     */
    public CollectiveAgreementFactorObjectType getCollectiveAgreementFactor2Reference() {
        return collectiveAgreementFactor2Reference;
    }

    /**
     * Sets the value of the collectiveAgreementFactor2Reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementFactorObjectType }
     *     
     */
    public void setCollectiveAgreementFactor2Reference(CollectiveAgreementFactorObjectType value) {
        this.collectiveAgreementFactor2Reference = value;
    }

    /**
     * Gets the value of the collectiveAgreementFactorOption2Reference property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementFactorOptionObjectType }
     *     
     */
    public CollectiveAgreementFactorOptionObjectType getCollectiveAgreementFactorOption2Reference() {
        return collectiveAgreementFactorOption2Reference;
    }

    /**
     * Sets the value of the collectiveAgreementFactorOption2Reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementFactorOptionObjectType }
     *     
     */
    public void setCollectiveAgreementFactorOption2Reference(CollectiveAgreementFactorOptionObjectType value) {
        this.collectiveAgreementFactorOption2Reference = value;
    }

}
