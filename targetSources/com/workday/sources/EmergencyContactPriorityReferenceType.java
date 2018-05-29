
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Emergency Contact Priority.
 * 
 * <p>Java class for Emergency_Contact_Priority_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Emergency_Contact_Priority_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Emergency_Contact_Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Emergency_Contact_Priority_ReferenceType", propOrder = {
    "emergencyContactPriority"
})
public class EmergencyContactPriorityReferenceType {

    @XmlElement(name = "Emergency_Contact_Priority")
    protected String emergencyContactPriority;

    /**
     * Gets the value of the emergencyContactPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactPriority() {
        return emergencyContactPriority;
    }

    /**
     * Sets the value of the emergencyContactPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactPriority(String value) {
        this.emergencyContactPriority = value;
    }

}
