
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Leave of Absence Type.
 * 
 * <p>Java class for Leave_of_Absence_Type_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Leave_of_Absence_Type_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Leave_Type_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Leave_of_Absence_Type_ReferenceType", propOrder = {
    "leaveTypeName"
})
public class LeaveOfAbsenceTypeReferenceType {

    @XmlElement(name = "Leave_Type_Name", required = true)
    protected String leaveTypeName;

    /**
     * Gets the value of the leaveTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaveTypeName() {
        return leaveTypeName;
    }

    /**
     * Sets the value of the leaveTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaveTypeName(String value) {
        this.leaveTypeName = value;
    }

}
