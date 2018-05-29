
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper for collective agreement factors and factor options.
 * 
 * <p>Java class for Collective_Agreement_Factor_Options_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Collective_Agreement_Factor_Options_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Collective_Agreement_Factor_1_Data" type="{urn:com.workday/bsvc}Collective_Agreement_Factor_1_DataType" minOccurs="0"/>
 *         &lt;element name="Collective_Agreement_Factor_2_Data" type="{urn:com.workday/bsvc}Collective_Agreement_Factor_2_DataType" minOccurs="0"/>
 *         &lt;element name="Collective_Agreement_Factor_3_Data" type="{urn:com.workday/bsvc}Collective_Agreement_Factor_3_DataType" minOccurs="0"/>
 *         &lt;element name="Collective_Agreement_Factor_4_Data" type="{urn:com.workday/bsvc}Collective_Agreement_Factor_4_DataType" minOccurs="0"/>
 *         &lt;element name="Collective_Agreement_Factor_5_Data" type="{urn:com.workday/bsvc}Collective_Agreement_Factor_5_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collective_Agreement_Factor_Options_DataType", propOrder = {
    "collectiveAgreementFactor1Data",
    "collectiveAgreementFactor2Data",
    "collectiveAgreementFactor3Data",
    "collectiveAgreementFactor4Data",
    "collectiveAgreementFactor5Data"
})
public class CollectiveAgreementFactorOptionsDataType {

    @XmlElement(name = "Collective_Agreement_Factor_1_Data")
    protected CollectiveAgreementFactor1DataType collectiveAgreementFactor1Data;
    @XmlElement(name = "Collective_Agreement_Factor_2_Data")
    protected CollectiveAgreementFactor2DataType collectiveAgreementFactor2Data;
    @XmlElement(name = "Collective_Agreement_Factor_3_Data")
    protected CollectiveAgreementFactor3DataType collectiveAgreementFactor3Data;
    @XmlElement(name = "Collective_Agreement_Factor_4_Data")
    protected CollectiveAgreementFactor4DataType collectiveAgreementFactor4Data;
    @XmlElement(name = "Collective_Agreement_Factor_5_Data")
    protected CollectiveAgreementFactor5DataType collectiveAgreementFactor5Data;

    /**
     * Gets the value of the collectiveAgreementFactor1Data property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementFactor1DataType }
     *     
     */
    public CollectiveAgreementFactor1DataType getCollectiveAgreementFactor1Data() {
        return collectiveAgreementFactor1Data;
    }

    /**
     * Sets the value of the collectiveAgreementFactor1Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementFactor1DataType }
     *     
     */
    public void setCollectiveAgreementFactor1Data(CollectiveAgreementFactor1DataType value) {
        this.collectiveAgreementFactor1Data = value;
    }

    /**
     * Gets the value of the collectiveAgreementFactor2Data property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementFactor2DataType }
     *     
     */
    public CollectiveAgreementFactor2DataType getCollectiveAgreementFactor2Data() {
        return collectiveAgreementFactor2Data;
    }

    /**
     * Sets the value of the collectiveAgreementFactor2Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementFactor2DataType }
     *     
     */
    public void setCollectiveAgreementFactor2Data(CollectiveAgreementFactor2DataType value) {
        this.collectiveAgreementFactor2Data = value;
    }

    /**
     * Gets the value of the collectiveAgreementFactor3Data property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementFactor3DataType }
     *     
     */
    public CollectiveAgreementFactor3DataType getCollectiveAgreementFactor3Data() {
        return collectiveAgreementFactor3Data;
    }

    /**
     * Sets the value of the collectiveAgreementFactor3Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementFactor3DataType }
     *     
     */
    public void setCollectiveAgreementFactor3Data(CollectiveAgreementFactor3DataType value) {
        this.collectiveAgreementFactor3Data = value;
    }

    /**
     * Gets the value of the collectiveAgreementFactor4Data property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementFactor4DataType }
     *     
     */
    public CollectiveAgreementFactor4DataType getCollectiveAgreementFactor4Data() {
        return collectiveAgreementFactor4Data;
    }

    /**
     * Sets the value of the collectiveAgreementFactor4Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementFactor4DataType }
     *     
     */
    public void setCollectiveAgreementFactor4Data(CollectiveAgreementFactor4DataType value) {
        this.collectiveAgreementFactor4Data = value;
    }

    /**
     * Gets the value of the collectiveAgreementFactor5Data property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementFactor5DataType }
     *     
     */
    public CollectiveAgreementFactor5DataType getCollectiveAgreementFactor5Data() {
        return collectiveAgreementFactor5Data;
    }

    /**
     * Sets the value of the collectiveAgreementFactor5Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementFactor5DataType }
     *     
     */
    public void setCollectiveAgreementFactor5Data(CollectiveAgreementFactor5DataType value) {
        this.collectiveAgreementFactor5Data = value;
    }

}
