
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Profile within the Compensation Grade to assign.   Does not default for Request Compensation Change.
 * 
 * <p>Java class for Compensation_Grade_Profile_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compensation_Grade_Profile_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compensation_Profile_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Compensation_Grade_Reference" type="{urn:com.workday/bsvc}Compensation_Grade_ReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compensation_Grade_Profile_ReferenceType", propOrder = {
    "compensationProfileName",
    "compensationGradeReference"
})
public class CompensationGradeProfileReferenceType {

    @XmlElement(name = "Compensation_Profile_Name", required = true)
    protected String compensationProfileName;
    @XmlElement(name = "Compensation_Grade_Reference", required = true)
    protected CompensationGradeReferenceType compensationGradeReference;

    /**
     * Gets the value of the compensationProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompensationProfileName() {
        return compensationProfileName;
    }

    /**
     * Sets the value of the compensationProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompensationProfileName(String value) {
        this.compensationProfileName = value;
    }

    /**
     * Gets the value of the compensationGradeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationGradeReferenceType }
     *     
     */
    public CompensationGradeReferenceType getCompensationGradeReference() {
        return compensationGradeReference;
    }

    /**
     * Sets the value of the compensationGradeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationGradeReferenceType }
     *     
     */
    public void setCompensationGradeReference(CompensationGradeReferenceType value) {
        this.compensationGradeReference = value;
    }

}
