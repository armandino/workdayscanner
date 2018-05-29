
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for the collective agreement factor 4 and factor option 4 data.
 * 
 * <p>Java class for Collective_Agreement_Factor_4_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Collective_Agreement_Factor_4_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Collective_Agreement_Factor_4_Reference" type="{urn:com.workday/bsvc}Collective_Agreement_FactorObjectType" minOccurs="0"/>
 *         &lt;element name="Collective_Agreement_Factor_Option_4_Reference" type="{urn:com.workday/bsvc}Collective_Agreement_Factor_OptionObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collective_Agreement_Factor_4_DataType", propOrder = {
    "collectiveAgreementFactor4Reference",
    "collectiveAgreementFactorOption4Reference"
})
public class CollectiveAgreementFactor4DataType {

    @XmlElement(name = "Collective_Agreement_Factor_4_Reference")
    protected CollectiveAgreementFactorObjectType collectiveAgreementFactor4Reference;
    @XmlElement(name = "Collective_Agreement_Factor_Option_4_Reference")
    protected CollectiveAgreementFactorOptionObjectType collectiveAgreementFactorOption4Reference;

    /**
     * Gets the value of the collectiveAgreementFactor4Reference property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementFactorObjectType }
     *     
     */
    public CollectiveAgreementFactorObjectType getCollectiveAgreementFactor4Reference() {
        return collectiveAgreementFactor4Reference;
    }

    /**
     * Sets the value of the collectiveAgreementFactor4Reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementFactorObjectType }
     *     
     */
    public void setCollectiveAgreementFactor4Reference(CollectiveAgreementFactorObjectType value) {
        this.collectiveAgreementFactor4Reference = value;
    }

    /**
     * Gets the value of the collectiveAgreementFactorOption4Reference property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementFactorOptionObjectType }
     *     
     */
    public CollectiveAgreementFactorOptionObjectType getCollectiveAgreementFactorOption4Reference() {
        return collectiveAgreementFactorOption4Reference;
    }

    /**
     * Sets the value of the collectiveAgreementFactorOption4Reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementFactorOptionObjectType }
     *     
     */
    public void setCollectiveAgreementFactorOption4Reference(CollectiveAgreementFactorOptionObjectType value) {
        this.collectiveAgreementFactorOption4Reference = value;
    }

}
