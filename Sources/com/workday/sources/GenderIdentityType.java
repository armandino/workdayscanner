
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The gender identity for a worker.
 * 
 * <p>Java class for Gender_IdentityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Gender_IdentityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Gender_Identity_Reference" type="{urn:com.workday/bsvc}Gender_IdentityObjectType" minOccurs="0"/>
 *         &lt;element name="Gender_Identity_Data" type="{urn:com.workday/bsvc}Gender_Identity_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gender_IdentityType", propOrder = {
    "genderIdentityReference",
    "genderIdentityData"
})
public class GenderIdentityType {

    @XmlElement(name = "Gender_Identity_Reference")
    protected GenderIdentityObjectType genderIdentityReference;
    @XmlElement(name = "Gender_Identity_Data")
    protected List<GenderIdentityDataType> genderIdentityData;

    /**
     * Gets the value of the genderIdentityReference property.
     * 
     * @return
     *     possible object is
     *     {@link GenderIdentityObjectType }
     *     
     */
    public GenderIdentityObjectType getGenderIdentityReference() {
        return genderIdentityReference;
    }

    /**
     * Sets the value of the genderIdentityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderIdentityObjectType }
     *     
     */
    public void setGenderIdentityReference(GenderIdentityObjectType value) {
        this.genderIdentityReference = value;
    }

    /**
     * Gets the value of the genderIdentityData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genderIdentityData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenderIdentityData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenderIdentityDataType }
     * 
     * 
     */
    public List<GenderIdentityDataType> getGenderIdentityData() {
        if (genderIdentityData == null) {
            genderIdentityData = new ArrayList<GenderIdentityDataType>();
        }
        return this.genderIdentityData;
    }

}
