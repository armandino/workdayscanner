
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Compensation Step within the Compensation Grade Profile.
 * 
 * <p>Java class for Compensation_Step_Reference_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compensation_Step_Reference_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compensation_Step_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Compensation_Step_Reference_DataType", propOrder = {
    "compensationStepName",
    "progressionStartDate"
})
public class CompensationStepReferenceDataType {

    @XmlElement(name = "Compensation_Step_Name", required = true)
    protected String compensationStepName;
    @XmlElement(name = "Progression_Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar progressionStartDate;

    /**
     * Gets the value of the compensationStepName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompensationStepName() {
        return compensationStepName;
    }

    /**
     * Sets the value of the compensationStepName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompensationStepName(String value) {
        this.compensationStepName = value;
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
