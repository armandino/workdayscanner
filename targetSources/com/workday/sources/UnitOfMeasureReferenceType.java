
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Unit of Measure.
 * 
 * <p>Java class for Unit_of_Measure_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Unit_of_Measure_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Unit_of_Measure_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Unit_of_Measure_ReferenceType", propOrder = {
    "unitOfMeasureName"
})
public class UnitOfMeasureReferenceType {

    @XmlElement(name = "Unit_of_Measure_Name")
    protected String unitOfMeasureName;

    /**
     * Gets the value of the unitOfMeasureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureName() {
        return unitOfMeasureName;
    }

    /**
     * Sets the value of the unitOfMeasureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureName(String value) {
        this.unitOfMeasureName = value;
    }

}
