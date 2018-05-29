
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing reference instance for a Work Shift.
 * 
 * <p>Java class for Work_Shift_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work_Shift_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Work_Shift_Reference" type="{urn:com.workday/bsvc}Work_ShiftObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Work_Shift_Request_ReferencesType", propOrder = {
    "workShiftReference"
})
public class WorkShiftRequestReferencesType {

    @XmlElement(name = "Work_Shift_Reference")
    protected List<WorkShiftObjectType> workShiftReference;

    /**
     * Gets the value of the workShiftReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workShiftReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkShiftReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkShiftObjectType }
     * 
     * 
     */
    public List<WorkShiftObjectType> getWorkShiftReference() {
        if (workShiftReference == null) {
            workShiftReference = new ArrayList<WorkShiftObjectType>();
        }
        return this.workShiftReference;
    }

}
