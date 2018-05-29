
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Request Criteria
 * 
 * <p>Java class for Academic_Unit_Request_CriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Unit_Request_CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Unit_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Effective_As_Of_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_Unit_Request_CriteriaType", propOrder = {
    "academicUnitName",
    "effectiveAsOfDate"
})
public class AcademicUnitRequestCriteriaType {

    @XmlElement(name = "Academic_Unit_Name", required = true)
    protected String academicUnitName;
    @XmlElement(name = "Effective_As_Of_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveAsOfDate;

    /**
     * Gets the value of the academicUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicUnitName() {
        return academicUnitName;
    }

    /**
     * Sets the value of the academicUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicUnitName(String value) {
        this.academicUnitName = value;
    }

    /**
     * Gets the value of the effectiveAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveAsOfDate() {
        return effectiveAsOfDate;
    }

    /**
     * Sets the value of the effectiveAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveAsOfDate(XMLGregorianCalendar value) {
        this.effectiveAsOfDate = value;
    }

}
