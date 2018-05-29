
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Collective Agreement data. Including Corrected data.
 * 
 * <p>Java class for Collective_Agreement_Summary_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Collective_Agreement_Summary_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Collective_Agreement_Data" type="{urn:com.workday/bsvc}Collective_Agreement_Detail_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collective_Agreement_Summary_DataType", propOrder = {
    "collectiveAgreementData"
})
public class CollectiveAgreementSummaryDataType {

    @XmlElement(name = "Collective_Agreement_Data")
    protected CollectiveAgreementDetailDataType collectiveAgreementData;

    /**
     * Gets the value of the collectiveAgreementData property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementDetailDataType }
     *     
     */
    public CollectiveAgreementDetailDataType getCollectiveAgreementData() {
        return collectiveAgreementData;
    }

    /**
     * Sets the value of the collectiveAgreementData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementDetailDataType }
     *     
     */
    public void setCollectiveAgreementData(CollectiveAgreementDetailDataType value) {
        this.collectiveAgreementData = value;
    }

}
