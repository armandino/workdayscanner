
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains data for adding or updating a Work Shift.
 * 
 * <p>Java class for Put_Work_Shift_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Work_Shift_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Work_Shift_Reference" type="{urn:com.workday/bsvc}Work_ShiftObjectType" minOccurs="0"/>
 *         &lt;element name="Work_Shift_Data" type="{urn:com.workday/bsvc}Work_Shift_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Work_Shift_RequestType", propOrder = {
    "workShiftReference",
    "workShiftData"
})
public class PutWorkShiftRequestType {

    @XmlElement(name = "Work_Shift_Reference")
    protected WorkShiftObjectType workShiftReference;
    @XmlElement(name = "Work_Shift_Data", required = true)
    protected WorkShiftDataType workShiftData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the workShiftReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkShiftObjectType }
     *     
     */
    public WorkShiftObjectType getWorkShiftReference() {
        return workShiftReference;
    }

    /**
     * Sets the value of the workShiftReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkShiftObjectType }
     *     
     */
    public void setWorkShiftReference(WorkShiftObjectType value) {
        this.workShiftReference = value;
    }

    /**
     * Gets the value of the workShiftData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkShiftDataType }
     *     
     */
    public WorkShiftDataType getWorkShiftData() {
        return workShiftData;
    }

    /**
     * Sets the value of the workShiftData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkShiftDataType }
     *     
     */
    public void setWorkShiftData(WorkShiftDataType value) {
        this.workShiftData = value;
    }

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
