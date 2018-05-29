
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing all Job Family Group data.
 * 
 * <p>Java class for Job_Family_Group_NewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Family_Group_NewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Family_Group_Reference" type="{urn:com.workday/bsvc}Job_FamilyObjectType" minOccurs="0"/>
 *         &lt;element name="Job_Family_Group_Data" type="{urn:com.workday/bsvc}Job_Family_Group_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="As_Of_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="As_Of_Moment" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Family_Group_NewType", propOrder = {
    "jobFamilyGroupReference",
    "jobFamilyGroupData"
})
public class JobFamilyGroupNewType {

    @XmlElement(name = "Job_Family_Group_Reference")
    protected JobFamilyObjectType jobFamilyGroupReference;
    @XmlElement(name = "Job_Family_Group_Data")
    protected JobFamilyGroupDataType jobFamilyGroupData;
    @XmlAttribute(name = "As_Of_Date", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar asOfDate;
    @XmlAttribute(name = "As_Of_Moment", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asOfMoment;

    /**
     * Gets the value of the jobFamilyGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link JobFamilyObjectType }
     *     
     */
    public JobFamilyObjectType getJobFamilyGroupReference() {
        return jobFamilyGroupReference;
    }

    /**
     * Sets the value of the jobFamilyGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobFamilyObjectType }
     *     
     */
    public void setJobFamilyGroupReference(JobFamilyObjectType value) {
        this.jobFamilyGroupReference = value;
    }

    /**
     * Gets the value of the jobFamilyGroupData property.
     * 
     * @return
     *     possible object is
     *     {@link JobFamilyGroupDataType }
     *     
     */
    public JobFamilyGroupDataType getJobFamilyGroupData() {
        return jobFamilyGroupData;
    }

    /**
     * Sets the value of the jobFamilyGroupData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobFamilyGroupDataType }
     *     
     */
    public void setJobFamilyGroupData(JobFamilyGroupDataType value) {
        this.jobFamilyGroupData = value;
    }

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfDate(XMLGregorianCalendar value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the asOfMoment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfMoment() {
        return asOfMoment;
    }

    /**
     * Sets the value of the asOfMoment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfMoment(XMLGregorianCalendar value) {
        this.asOfMoment = value;
    }

}
