
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing work shift reference and data.
 * 
 * <p>Java class for Work_ShiftType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work_ShiftType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Work_Shift_Reference" type="{urn:com.workday/bsvc}Work_ShiftObjectType" minOccurs="0"/>
 *         &lt;element name="Work_Shift_Data" type="{urn:com.workday/bsvc}Work_Shift_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Work_ShiftType", propOrder = {
    "workShiftReference",
    "workShiftData"
})
public class WorkShiftType {

    @XmlElement(name = "Work_Shift_Reference")
    protected WorkShiftObjectType workShiftReference;
    @XmlElement(name = "Work_Shift_Data")
    protected List<WorkShiftDataType> workShiftData;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workShiftData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkShiftData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkShiftDataType }
     * 
     * 
     */
    public List<WorkShiftDataType> getWorkShiftData() {
        if (workShiftData == null) {
            workShiftData = new ArrayList<WorkShiftDataType>();
        }
        return this.workShiftData;
    }

}
