
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for each disability status entry.
 * 
 * <p>Java class for Disability_Status_Information_Data_for_Related_PersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Disability_Status_Information_Data_for_Related_PersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Disability_Status_Reference" type="{urn:com.workday/bsvc}Disability_Status_ReferenceObjectType" minOccurs="0"/>
 *         &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Disability_Status_Data" type="{urn:com.workday/bsvc}Disability_Status_Sub_Data_for_Related_PersonType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Disability_Status_Information_Data_for_Related_PersonType", propOrder = {
    "disabilityStatusReference",
    "delete",
    "disabilityStatusData"
})
public class DisabilityStatusInformationDataForRelatedPersonType {

    @XmlElement(name = "Disability_Status_Reference")
    protected DisabilityStatusReferenceObjectType disabilityStatusReference;
    @XmlElement(name = "Delete")
    protected Boolean delete;
    @XmlElement(name = "Disability_Status_Data")
    protected DisabilityStatusSubDataForRelatedPersonType disabilityStatusData;

    /**
     * Gets the value of the disabilityStatusReference property.
     * 
     * @return
     *     possible object is
     *     {@link DisabilityStatusReferenceObjectType }
     *     
     */
    public DisabilityStatusReferenceObjectType getDisabilityStatusReference() {
        return disabilityStatusReference;
    }

    /**
     * Sets the value of the disabilityStatusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityStatusReferenceObjectType }
     *     
     */
    public void setDisabilityStatusReference(DisabilityStatusReferenceObjectType value) {
        this.disabilityStatusReference = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

    /**
     * Gets the value of the disabilityStatusData property.
     * 
     * @return
     *     possible object is
     *     {@link DisabilityStatusSubDataForRelatedPersonType }
     *     
     */
    public DisabilityStatusSubDataForRelatedPersonType getDisabilityStatusData() {
        return disabilityStatusData;
    }

    /**
     * Sets the value of the disabilityStatusData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityStatusSubDataForRelatedPersonType }
     *     
     */
    public void setDisabilityStatusData(DisabilityStatusSubDataForRelatedPersonType value) {
        this.disabilityStatusData = value;
    }

}
