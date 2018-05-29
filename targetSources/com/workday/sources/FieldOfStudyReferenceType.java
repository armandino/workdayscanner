
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A unique identifier used to reference a Field Of Study.
 * 
 * <p>Java class for Field_Of_Study_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field_Of_Study_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Field_Of_Study_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field_Of_Study_ReferenceType", propOrder = {
    "fieldOfStudyName"
})
public class FieldOfStudyReferenceType {

    @XmlElement(name = "Field_Of_Study_Name", required = true)
    protected String fieldOfStudyName;

    /**
     * Gets the value of the fieldOfStudyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldOfStudyName() {
        return fieldOfStudyName;
    }

    /**
     * Sets the value of the fieldOfStudyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldOfStudyName(String value) {
        this.fieldOfStudyName = value;
    }

}
