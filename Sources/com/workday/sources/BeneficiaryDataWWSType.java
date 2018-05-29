
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Beneficiary data.
 * 
 * <p>Java class for Beneficiary_Data_WWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Beneficiary_Data_WWSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Integration_ID_Data" type="{urn:com.workday/bsvc}External_Integration_ID_DataType" minOccurs="0"/>
 *         &lt;element name="Court_Order_Replacement_Data" type="{urn:com.workday/bsvc}Qualified_Domestic_Relations_Order_Replacement_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Beneficiary_Data_WWSType", propOrder = {
    "integrationIDData",
    "courtOrderReplacementData"
})
public class BeneficiaryDataWWSType {

    @XmlElement(name = "Integration_ID_Data")
    protected ExternalIntegrationIDDataType integrationIDData;
    @XmlElement(name = "Court_Order_Replacement_Data")
    protected List<QualifiedDomesticRelationsOrderReplacementDataType> courtOrderReplacementData;

    /**
     * Gets the value of the integrationIDData property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public ExternalIntegrationIDDataType getIntegrationIDData() {
        return integrationIDData;
    }

    /**
     * Sets the value of the integrationIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public void setIntegrationIDData(ExternalIntegrationIDDataType value) {
        this.integrationIDData = value;
    }

    /**
     * Gets the value of the courtOrderReplacementData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courtOrderReplacementData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourtOrderReplacementData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedDomesticRelationsOrderReplacementDataType }
     * 
     * 
     */
    public List<QualifiedDomesticRelationsOrderReplacementDataType> getCourtOrderReplacementData() {
        if (courtOrderReplacementData == null) {
            courtOrderReplacementData = new ArrayList<QualifiedDomesticRelationsOrderReplacementDataType>();
        }
        return this.courtOrderReplacementData;
    }

}
