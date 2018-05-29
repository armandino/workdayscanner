
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for all Disability Status data for the Dependent.
 * 
 * <p>Java class for Disability_Information_Data_for_Related_PersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Disability_Information_Data_for_Related_PersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Replace_All" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Disability_Status_Information_Data" type="{urn:com.workday/bsvc}Disability_Status_Information_Data_for_Related_PersonType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Disability_Information_Data_for_Related_PersonType", propOrder = {
    "replaceAll",
    "disabilityStatusInformationData"
})
public class DisabilityInformationDataForRelatedPersonType {

    @XmlElement(name = "Replace_All")
    protected Boolean replaceAll;
    @XmlElement(name = "Disability_Status_Information_Data")
    protected List<DisabilityStatusInformationDataForRelatedPersonType> disabilityStatusInformationData;

    /**
     * Gets the value of the replaceAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplaceAll() {
        return replaceAll;
    }

    /**
     * Sets the value of the replaceAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplaceAll(Boolean value) {
        this.replaceAll = value;
    }

    /**
     * Gets the value of the disabilityStatusInformationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabilityStatusInformationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisabilityStatusInformationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisabilityStatusInformationDataForRelatedPersonType }
     * 
     * 
     */
    public List<DisabilityStatusInformationDataForRelatedPersonType> getDisabilityStatusInformationData() {
        if (disabilityStatusInformationData == null) {
            disabilityStatusInformationData = new ArrayList<DisabilityStatusInformationDataForRelatedPersonType>();
        }
        return this.disabilityStatusInformationData;
    }

}
