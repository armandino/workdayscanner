
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing all Work Shift data.
 * 
 * <p>Java class for Work_Shift_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work_Shift_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Work_Shift_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Work_Shift_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Work_Shift_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_Reference" type="{urn:com.workday/bsvc}Location_ContextObjectType" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Work_Shift_DataType", propOrder = {
    "workShiftID",
    "workShiftName",
    "workShiftDescription",
    "locationReference",
    "inactive"
})
public class WorkShiftDataType {

    @XmlElement(name = "Work_Shift_ID")
    protected String workShiftID;
    @XmlElement(name = "Work_Shift_Name")
    protected String workShiftName;
    @XmlElement(name = "Work_Shift_Description")
    protected String workShiftDescription;
    @XmlElement(name = "Location_Reference")
    protected LocationContextObjectType locationReference;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;

    /**
     * Gets the value of the workShiftID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkShiftID() {
        return workShiftID;
    }

    /**
     * Sets the value of the workShiftID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkShiftID(String value) {
        this.workShiftID = value;
    }

    /**
     * Gets the value of the workShiftName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkShiftName() {
        return workShiftName;
    }

    /**
     * Sets the value of the workShiftName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkShiftName(String value) {
        this.workShiftName = value;
    }

    /**
     * Gets the value of the workShiftDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkShiftDescription() {
        return workShiftDescription;
    }

    /**
     * Sets the value of the workShiftDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkShiftDescription(String value) {
        this.workShiftDescription = value;
    }

    /**
     * Gets the value of the locationReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationContextObjectType }
     *     
     */
    public LocationContextObjectType getLocationReference() {
        return locationReference;
    }

    /**
     * Sets the value of the locationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationContextObjectType }
     *     
     */
    public void setLocationReference(LocationContextObjectType value) {
        this.locationReference = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

}
