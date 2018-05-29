
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for the collective agreement factor 3 and factor option 3 data.
 * 
 * <p>Java class for Collective_Agreement_Factor_3_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Collective_Agreement_Factor_3_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Collective_Agreement_Factor_3_Reference" type="{urn:com.workday/bsvc}Collective_Agreement_FactorObjectType" minOccurs="0"/>
 *         &lt;element name="Collective_Agreement_Factor_Option_3_Reference" type="{urn:com.workday/bsvc}Collective_Agreement_Factor_OptionObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collective_Agreement_Factor_3_DataType", propOrder = {
    "collectiveAgreementFactor3Reference",
    "collectiveAgreementFactorOption3Reference"
})
public class CollectiveAgreementFactor3DataType {

    @XmlElement(name = "Collective_Agreement_Factor_3_Reference")
    protected CollectiveAgreementFactorObjectType collectiveAgreementFactor3Reference;
    @XmlElement(name = "Collective_Agreement_Factor_Option_3_Reference")
    protected CollectiveAgreementFactorOptionObjectType collectiveAgreementFactorOption3Reference;

    /**
     * Gets the value of the collectiveAgreementFactor3Reference property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementFactorObjectType }
     *     
     */
    public CollectiveAgreementFactorObjectType getCollectiveAgreementFactor3Reference() {
        return collectiveAgreementFactor3Reference;
    }

    /**
     * Sets the value of the collectiveAgreementFactor3Reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementFactorObjectType }
     *     
     */
    public void setCollectiveAgreementFactor3Reference(CollectiveAgreementFactorObjectType value) {
        this.collectiveAgreementFactor3Reference = value;
    }

    /**
     * Gets the value of the collectiveAgreementFactorOption3Reference property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementFactorOptionObjectType }
     *     
     */
    public CollectiveAgreementFactorOptionObjectType getCollectiveAgreementFactorOption3Reference() {
        return collectiveAgreementFactorOption3Reference;
    }

    /**
     * Sets the value of the collectiveAgreementFactorOption3Reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementFactorOptionObjectType }
     *     
     */
    public void setCollectiveAgreementFactorOption3Reference(CollectiveAgreementFactorOptionObjectType value) {
        this.collectiveAgreementFactorOption3Reference = value;
    }

}
