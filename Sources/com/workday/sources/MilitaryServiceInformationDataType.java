
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for each Military Service entry.
 * 
 * <p>Java class for Military_Service_Information_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Military_Service_Information_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Military_Service_Reference" type="{urn:com.workday/bsvc}Military_Service_ReferenceObjectType" minOccurs="0"/>
 *         &lt;element name="Military_Service_Data" type="{urn:com.workday/bsvc}Military_Service_Sub_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Military_Service_Information_DataType", propOrder = {
    "militaryServiceReference",
    "militaryServiceData"
})
public class MilitaryServiceInformationDataType {

    @XmlElement(name = "Military_Service_Reference")
    protected MilitaryServiceReferenceObjectType militaryServiceReference;
    @XmlElement(name = "Military_Service_Data")
    protected MilitaryServiceSubDataType militaryServiceData;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the militaryServiceReference property.
     * 
     * @return
     *     possible object is
     *     {@link MilitaryServiceReferenceObjectType }
     *     
     */
    public MilitaryServiceReferenceObjectType getMilitaryServiceReference() {
        return militaryServiceReference;
    }

    /**
     * Sets the value of the militaryServiceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MilitaryServiceReferenceObjectType }
     *     
     */
    public void setMilitaryServiceReference(MilitaryServiceReferenceObjectType value) {
        this.militaryServiceReference = value;
    }

    /**
     * Gets the value of the militaryServiceData property.
     * 
     * @return
     *     possible object is
     *     {@link MilitaryServiceSubDataType }
     *     
     */
    public MilitaryServiceSubDataType getMilitaryServiceData() {
        return militaryServiceData;
    }

    /**
     * Sets the value of the militaryServiceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MilitaryServiceSubDataType }
     *     
     */
    public void setMilitaryServiceData(MilitaryServiceSubDataType value) {
        this.militaryServiceData = value;
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

}
