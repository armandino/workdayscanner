
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Response element containing an instance of Contingent Worker and his/her Personal Information.
 * 
 * <p>Java class for Contingent_Worker_Personal_InfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contingent_Worker_Personal_InfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contingent_Worker_Reference" type="{urn:com.workday/bsvc}Contingent_Worker_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Contingent_Worker_Personal_Info_Data" type="{urn:com.workday/bsvc}Worker_Personal_Info_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="As_Of_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="As_Of_Moment" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contingent_Worker_Personal_InfoType", propOrder = {
    "contingentWorkerReference",
    "contingentWorkerPersonalInfoData"
})
public class ContingentWorkerPersonalInfoType {

    @XmlElement(name = "Contingent_Worker_Reference")
    protected ContingentWorkerReferenceDataType contingentWorkerReference;
    @XmlElement(name = "Contingent_Worker_Personal_Info_Data")
    protected WorkerPersonalInfoDataType contingentWorkerPersonalInfoData;
    @XmlAttribute(name = "As_Of_Date", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar asOfDate;
    @XmlAttribute(name = "As_Of_Moment", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asOfMoment;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the contingentWorkerReference property.
     * 
     * @return
     *     possible object is
     *     {@link ContingentWorkerReferenceDataType }
     *     
     */
    public ContingentWorkerReferenceDataType getContingentWorkerReference() {
        return contingentWorkerReference;
    }

    /**
     * Sets the value of the contingentWorkerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContingentWorkerReferenceDataType }
     *     
     */
    public void setContingentWorkerReference(ContingentWorkerReferenceDataType value) {
        this.contingentWorkerReference = value;
    }

    /**
     * Gets the value of the contingentWorkerPersonalInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerPersonalInfoDataType }
     *     
     */
    public WorkerPersonalInfoDataType getContingentWorkerPersonalInfoData() {
        return contingentWorkerPersonalInfoData;
    }

    /**
     * Sets the value of the contingentWorkerPersonalInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerPersonalInfoDataType }
     *     
     */
    public void setContingentWorkerPersonalInfoData(WorkerPersonalInfoDataType value) {
        this.contingentWorkerPersonalInfoData = value;
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

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
