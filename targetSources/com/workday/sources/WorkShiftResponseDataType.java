
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element that includes Work Shift reference instance and Work Shift data.
 * 
 * <p>Java class for Work_Shift_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work_Shift_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Work_Shift" type="{urn:com.workday/bsvc}Work_ShiftType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Work_Shift_Response_DataType", propOrder = {
    "workShift"
})
public class WorkShiftResponseDataType {

    @XmlElement(name = "Work_Shift")
    protected List<WorkShiftType> workShift;

    /**
     * Gets the value of the workShift property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workShift property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkShift().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkShiftType }
     * 
     * 
     */
    public List<WorkShiftType> getWorkShift() {
        if (workShift == null) {
            workShift = new ArrayList<WorkShiftType>();
        }
        return this.workShift;
    }

}
