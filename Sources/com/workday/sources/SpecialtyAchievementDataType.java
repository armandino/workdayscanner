
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element contains data about each Specialty-Subspecialty combination associated with the certification achievement
 * 
 * <p>Java class for Specialty_Achievement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Specialty_Achievement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Specialty_Reference" type="{urn:com.workday/bsvc}Specialty_ParentObjectType" minOccurs="0"/>
 *         &lt;element name="Subspecialty_Reference" type="{urn:com.workday/bsvc}Specialty_ChildObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Specialty_Achievement_DataType", propOrder = {
    "specialtyReference",
    "subspecialtyReference"
})
public class SpecialtyAchievementDataType {

    @XmlElement(name = "Specialty_Reference")
    protected SpecialtyParentObjectType specialtyReference;
    @XmlElement(name = "Subspecialty_Reference")
    protected List<SpecialtyChildObjectType> subspecialtyReference;

    /**
     * Gets the value of the specialtyReference property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialtyParentObjectType }
     *     
     */
    public SpecialtyParentObjectType getSpecialtyReference() {
        return specialtyReference;
    }

    /**
     * Sets the value of the specialtyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialtyParentObjectType }
     *     
     */
    public void setSpecialtyReference(SpecialtyParentObjectType value) {
        this.specialtyReference = value;
    }

    /**
     * Gets the value of the subspecialtyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subspecialtyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubspecialtyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialtyChildObjectType }
     * 
     * 
     */
    public List<SpecialtyChildObjectType> getSubspecialtyReference() {
        if (subspecialtyReference == null) {
            subspecialtyReference = new ArrayList<SpecialtyChildObjectType>();
        }
        return this.subspecialtyReference;
    }

}
