
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the preferred name for a person.  If no preferred name is returned then the legal name is assumed to be the preferred name.  If a preferred name is not provided in a request then the legal name is assumed to be the preferred name.
 * 
 * <p>Java class for Preferred_Name_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Preferred_Name_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name_Detail_Data" type="{urn:com.workday/bsvc}Person_Name_Detail_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Preferred_Name_DataType", propOrder = {
    "nameDetailData"
})
public class PreferredNameDataType {

    @XmlElement(name = "Name_Detail_Data", required = true)
    protected PersonNameDetailDataType nameDetailData;

    /**
     * Gets the value of the nameDetailData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameDetailDataType }
     *     
     */
    public PersonNameDetailDataType getNameDetailData() {
        return nameDetailData;
    }

    /**
     * Sets the value of the nameDetailData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameDetailDataType }
     *     
     */
    public void setNameDetailData(PersonNameDetailDataType value) {
        this.nameDetailData = value;
    }

}
