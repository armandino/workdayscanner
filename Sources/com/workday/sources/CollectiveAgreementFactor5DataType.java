
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for the collective agreement factor 5 and factor option 5 data.
 * 
 * <p>Java class for Collective_Agreement_Factor_5_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Collective_Agreement_Factor_5_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Collective_Agreement_Factor_5_Reference" type="{urn:com.workday/bsvc}Collective_Agreement_FactorObjectType" minOccurs="0"/>
 *         &lt;element name="Collective_Agreement_Factor_Option_5_Reference" type="{urn:com.workday/bsvc}Collective_Agreement_Factor_OptionObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collective_Agreement_Factor_5_DataType", propOrder = {
    "collectiveAgreementFactor5Reference",
    "collectiveAgreementFactorOption5Reference"
})
public class CollectiveAgreementFactor5DataType {

    @XmlElement(name = "Collective_Agreement_Factor_5_Reference")
    protected CollectiveAgreementFactorObjectType collectiveAgreementFactor5Reference;
    @XmlElement(name = "Collective_Agreement_Factor_Option_5_Reference")
    protected CollectiveAgreementFactorOptionObjectType collectiveAgreementFactorOption5Reference;

    /**
     * Gets the value of the collectiveAgreementFactor5Reference property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementFactorObjectType }
     *     
     */
    public CollectiveAgreementFactorObjectType getCollectiveAgreementFactor5Reference() {
        return collectiveAgreementFactor5Reference;
    }

    /**
     * Sets the value of the collectiveAgreementFactor5Reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementFactorObjectType }
     *     
     */
    public void setCollectiveAgreementFactor5Reference(CollectiveAgreementFactorObjectType value) {
        this.collectiveAgreementFactor5Reference = value;
    }

    /**
     * Gets the value of the collectiveAgreementFactorOption5Reference property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementFactorOptionObjectType }
     *     
     */
    public CollectiveAgreementFactorOptionObjectType getCollectiveAgreementFactorOption5Reference() {
        return collectiveAgreementFactorOption5Reference;
    }

    /**
     * Sets the value of the collectiveAgreementFactorOption5Reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementFactorOptionObjectType }
     *     
     */
    public void setCollectiveAgreementFactorOption5Reference(CollectiveAgreementFactorOptionObjectType value) {
        this.collectiveAgreementFactorOption5Reference = value;
    }

}
