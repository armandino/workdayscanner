
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Compensation Package to assign.
 * 
 * <p>Java class for Compensation_Package_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compensation_Package_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compensation_Package_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compensation_Package_ReferenceType", propOrder = {
    "compensationPackageName"
})
public class CompensationPackageReferenceType {

    @XmlElement(name = "Compensation_Package_Name", required = true)
    protected String compensationPackageName;

    /**
     * Gets the value of the compensationPackageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompensationPackageName() {
        return compensationPackageName;
    }

    /**
     * Sets the value of the compensationPackageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompensationPackageName(String value) {
        this.compensationPackageName = value;
    }

}
