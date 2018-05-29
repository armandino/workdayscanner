
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the information about the employee's willingness to relocate as part of their job.
 * 
 * <p>Java class for Relocation_Preference_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Relocation_Preference_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Short_Term_Relocation_Reference" type="{urn:com.workday/bsvc}Common_Boolean_EnumerationObjectType" minOccurs="0"/>
 *         &lt;element name="Short_Term_Relocation_Area__Reference" type="{urn:com.workday/bsvc}Relocation_AreaObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Long_Term_Relocation_Reference" type="{urn:com.workday/bsvc}Common_Boolean_EnumerationObjectType" minOccurs="0"/>
 *         &lt;element name="Long_Term_Relocation_Area__Reference" type="{urn:com.workday/bsvc}Relocation_AreaObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Additional_Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relocation_Preference_DataType", propOrder = {
    "shortTermRelocationReference",
    "shortTermRelocationAreaReference",
    "longTermRelocationReference",
    "longTermRelocationAreaReference",
    "additionalInformation"
})
public class RelocationPreferenceDataType {

    @XmlElement(name = "Short_Term_Relocation_Reference")
    protected CommonBooleanEnumerationObjectType shortTermRelocationReference;
    @XmlElement(name = "Short_Term_Relocation_Area__Reference")
    protected List<RelocationAreaObjectType> shortTermRelocationAreaReference;
    @XmlElement(name = "Long_Term_Relocation_Reference")
    protected CommonBooleanEnumerationObjectType longTermRelocationReference;
    @XmlElement(name = "Long_Term_Relocation_Area__Reference")
    protected List<RelocationAreaObjectType> longTermRelocationAreaReference;
    @XmlElement(name = "Additional_Information")
    protected String additionalInformation;

    /**
     * Gets the value of the shortTermRelocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommonBooleanEnumerationObjectType }
     *     
     */
    public CommonBooleanEnumerationObjectType getShortTermRelocationReference() {
        return shortTermRelocationReference;
    }

    /**
     * Sets the value of the shortTermRelocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonBooleanEnumerationObjectType }
     *     
     */
    public void setShortTermRelocationReference(CommonBooleanEnumerationObjectType value) {
        this.shortTermRelocationReference = value;
    }

    /**
     * Gets the value of the shortTermRelocationAreaReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortTermRelocationAreaReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortTermRelocationAreaReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelocationAreaObjectType }
     * 
     * 
     */
    public List<RelocationAreaObjectType> getShortTermRelocationAreaReference() {
        if (shortTermRelocationAreaReference == null) {
            shortTermRelocationAreaReference = new ArrayList<RelocationAreaObjectType>();
        }
        return this.shortTermRelocationAreaReference;
    }

    /**
     * Gets the value of the longTermRelocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommonBooleanEnumerationObjectType }
     *     
     */
    public CommonBooleanEnumerationObjectType getLongTermRelocationReference() {
        return longTermRelocationReference;
    }

    /**
     * Sets the value of the longTermRelocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonBooleanEnumerationObjectType }
     *     
     */
    public void setLongTermRelocationReference(CommonBooleanEnumerationObjectType value) {
        this.longTermRelocationReference = value;
    }

    /**
     * Gets the value of the longTermRelocationAreaReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the longTermRelocationAreaReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongTermRelocationAreaReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelocationAreaObjectType }
     * 
     * 
     */
    public List<RelocationAreaObjectType> getLongTermRelocationAreaReference() {
        if (longTermRelocationAreaReference == null) {
            longTermRelocationAreaReference = new ArrayList<RelocationAreaObjectType>();
        }
        return this.longTermRelocationAreaReference;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

}
