
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Data element containing the compensation guidelines for a compensation change.
 * 
 * <p>Java class for Compensatable_Guidelines_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compensatable_Guidelines_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compensation_Package_Reference" type="{urn:com.workday/bsvc}Compensation_PackageObjectType" minOccurs="0"/>
 *         &lt;element name="Compensation_Grade_Reference" type="{urn:com.workday/bsvc}Compensation_GradeObjectType" minOccurs="0"/>
 *         &lt;element name="Compensation_Grade_Profile_Reference" type="{urn:com.workday/bsvc}Compensation_Grade_ProfileObjectType" minOccurs="0"/>
 *         &lt;element name="Compensation_Step_Reference" type="{urn:com.workday/bsvc}Compensation_StepObjectType" minOccurs="0"/>
 *         &lt;element name="Progression_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compensatable_Guidelines_DataType", propOrder = {
    "compensationPackageReference",
    "compensationGradeReference",
    "compensationGradeProfileReference",
    "compensationStepReference",
    "progressionStartDate"
})
public class CompensatableGuidelinesDataType {

    @XmlElement(name = "Compensation_Package_Reference")
    protected CompensationPackageObjectType compensationPackageReference;
    @XmlElement(name = "Compensation_Grade_Reference")
    protected CompensationGradeObjectType compensationGradeReference;
    @XmlElement(name = "Compensation_Grade_Profile_Reference")
    protected CompensationGradeProfileObjectType compensationGradeProfileReference;
    @XmlElement(name = "Compensation_Step_Reference")
    protected CompensationStepObjectType compensationStepReference;
    @XmlElement(name = "Progression_Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar progressionStartDate;

    /**
     * Gets the value of the compensationPackageReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationPackageObjectType }
     *     
     */
    public CompensationPackageObjectType getCompensationPackageReference() {
        return compensationPackageReference;
    }

    /**
     * Sets the value of the compensationPackageReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationPackageObjectType }
     *     
     */
    public void setCompensationPackageReference(CompensationPackageObjectType value) {
        this.compensationPackageReference = value;
    }

    /**
     * Gets the value of the compensationGradeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationGradeObjectType }
     *     
     */
    public CompensationGradeObjectType getCompensationGradeReference() {
        return compensationGradeReference;
    }

    /**
     * Sets the value of the compensationGradeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationGradeObjectType }
     *     
     */
    public void setCompensationGradeReference(CompensationGradeObjectType value) {
        this.compensationGradeReference = value;
    }

    /**
     * Gets the value of the compensationGradeProfileReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationGradeProfileObjectType }
     *     
     */
    public CompensationGradeProfileObjectType getCompensationGradeProfileReference() {
        return compensationGradeProfileReference;
    }

    /**
     * Sets the value of the compensationGradeProfileReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationGradeProfileObjectType }
     *     
     */
    public void setCompensationGradeProfileReference(CompensationGradeProfileObjectType value) {
        this.compensationGradeProfileReference = value;
    }

    /**
     * Gets the value of the compensationStepReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationStepObjectType }
     *     
     */
    public CompensationStepObjectType getCompensationStepReference() {
        return compensationStepReference;
    }

    /**
     * Sets the value of the compensationStepReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationStepObjectType }
     *     
     */
    public void setCompensationStepReference(CompensationStepObjectType value) {
        this.compensationStepReference = value;
    }

    /**
     * Gets the value of the progressionStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProgressionStartDate() {
        return progressionStartDate;
    }

    /**
     * Sets the value of the progressionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProgressionStartDate(XMLGregorianCalendar value) {
        this.progressionStartDate = value;
    }

}
