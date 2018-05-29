
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing all Dependent data.
 * 
 * <p>Java class for Dependent_Data_WWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dependent_Data_WWSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Integration_ID_Data" type="{urn:com.workday/bsvc}External_Integration_ID_DataType" minOccurs="0"/>
 *         &lt;element name="Dependent_Educational_Institution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Full-time_Student" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Student_Status_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Student_Status_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Dependent_Date_of_Death" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Court_Order_Replacement_Data" type="{urn:com.workday/bsvc}Qualified_Domestic_Relations_Order_Replacement_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dependent_Data_WWSType", propOrder = {
    "integrationIDData",
    "dependentEducationalInstitution",
    "fullTimeStudent",
    "studentStatusStartDate",
    "studentStatusEndDate",
    "dependentDateOfDeath",
    "disabled",
    "courtOrderReplacementData"
})
public class DependentDataWWSType {

    @XmlElement(name = "Integration_ID_Data")
    protected ExternalIntegrationIDDataType integrationIDData;
    @XmlElement(name = "Dependent_Educational_Institution")
    protected String dependentEducationalInstitution;
    @XmlElement(name = "Full-time_Student")
    protected Boolean fullTimeStudent;
    @XmlElement(name = "Student_Status_Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar studentStatusStartDate;
    @XmlElement(name = "Student_Status_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar studentStatusEndDate;
    @XmlElement(name = "Dependent_Date_of_Death")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dependentDateOfDeath;
    @XmlElement(name = "Disabled")
    protected Boolean disabled;
    @XmlElement(name = "Court_Order_Replacement_Data")
    protected List<QualifiedDomesticRelationsOrderReplacementDataType> courtOrderReplacementData;

    /**
     * Gets the value of the integrationIDData property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public ExternalIntegrationIDDataType getIntegrationIDData() {
        return integrationIDData;
    }

    /**
     * Sets the value of the integrationIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public void setIntegrationIDData(ExternalIntegrationIDDataType value) {
        this.integrationIDData = value;
    }

    /**
     * Gets the value of the dependentEducationalInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentEducationalInstitution() {
        return dependentEducationalInstitution;
    }

    /**
     * Sets the value of the dependentEducationalInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentEducationalInstitution(String value) {
        this.dependentEducationalInstitution = value;
    }

    /**
     * Gets the value of the fullTimeStudent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullTimeStudent() {
        return fullTimeStudent;
    }

    /**
     * Sets the value of the fullTimeStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullTimeStudent(Boolean value) {
        this.fullTimeStudent = value;
    }

    /**
     * Gets the value of the studentStatusStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStudentStatusStartDate() {
        return studentStatusStartDate;
    }

    /**
     * Sets the value of the studentStatusStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStudentStatusStartDate(XMLGregorianCalendar value) {
        this.studentStatusStartDate = value;
    }

    /**
     * Gets the value of the studentStatusEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStudentStatusEndDate() {
        return studentStatusEndDate;
    }

    /**
     * Sets the value of the studentStatusEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStudentStatusEndDate(XMLGregorianCalendar value) {
        this.studentStatusEndDate = value;
    }

    /**
     * Gets the value of the dependentDateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDependentDateOfDeath() {
        return dependentDateOfDeath;
    }

    /**
     * Sets the value of the dependentDateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDependentDateOfDeath(XMLGregorianCalendar value) {
        this.dependentDateOfDeath = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the courtOrderReplacementData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courtOrderReplacementData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourtOrderReplacementData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedDomesticRelationsOrderReplacementDataType }
     * 
     * 
     */
    public List<QualifiedDomesticRelationsOrderReplacementDataType> getCourtOrderReplacementData() {
        if (courtOrderReplacementData == null) {
            courtOrderReplacementData = new ArrayList<QualifiedDomesticRelationsOrderReplacementDataType>();
        }
        return this.courtOrderReplacementData;
    }

}
