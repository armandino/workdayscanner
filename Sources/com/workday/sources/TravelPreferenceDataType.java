
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the information about the employees willingness to travel as part of their job.
 * 
 * <p>Java class for Travel_Preference_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Travel_Preference_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Willing_to_Travel_Reference" type="{urn:com.workday/bsvc}Mobility_ChoiceObjectType"/>
 *         &lt;element name="Travel_Amount_Reference" type="{urn:com.workday/bsvc}Travel_AmountObjectType" minOccurs="0"/>
 *         &lt;element name="Travel_Additional_Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Travel_Preference_DataType", propOrder = {
    "willingToTravelReference",
    "travelAmountReference",
    "travelAdditionalInformation"
})
public class TravelPreferenceDataType {

    @XmlElement(name = "Willing_to_Travel_Reference", required = true)
    protected MobilityChoiceObjectType willingToTravelReference;
    @XmlElement(name = "Travel_Amount_Reference")
    protected TravelAmountObjectType travelAmountReference;
    @XmlElement(name = "Travel_Additional_Information")
    protected String travelAdditionalInformation;

    /**
     * Gets the value of the willingToTravelReference property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityChoiceObjectType }
     *     
     */
    public MobilityChoiceObjectType getWillingToTravelReference() {
        return willingToTravelReference;
    }

    /**
     * Sets the value of the willingToTravelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityChoiceObjectType }
     *     
     */
    public void setWillingToTravelReference(MobilityChoiceObjectType value) {
        this.willingToTravelReference = value;
    }

    /**
     * Gets the value of the travelAmountReference property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAmountObjectType }
     *     
     */
    public TravelAmountObjectType getTravelAmountReference() {
        return travelAmountReference;
    }

    /**
     * Sets the value of the travelAmountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAmountObjectType }
     *     
     */
    public void setTravelAmountReference(TravelAmountObjectType value) {
        this.travelAmountReference = value;
    }

    /**
     * Gets the value of the travelAdditionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelAdditionalInformation() {
        return travelAdditionalInformation;
    }

    /**
     * Sets the value of the travelAdditionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelAdditionalInformation(String value) {
        this.travelAdditionalInformation = value;
    }

}
