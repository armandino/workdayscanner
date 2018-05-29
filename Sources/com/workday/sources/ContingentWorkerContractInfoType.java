
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Response element containing an instance of Contingent Worker and his/her Contract Information.
 * 
 * <p>Java class for Contingent_Worker_Contract_InfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contingent_Worker_Contract_InfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contingent_Worker_Reference_Data" type="{urn:com.workday/bsvc}Contingent_Worker_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Contingent_Worker_Contract_Info_Data" type="{urn:com.workday/bsvc}Contingent_Worker_Contract_Info_DataType" minOccurs="0"/>
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
@XmlType(name = "Contingent_Worker_Contract_InfoType", propOrder = {
    "contingentWorkerReferenceData",
    "contingentWorkerContractInfoData"
})
public class ContingentWorkerContractInfoType {

    @XmlElement(name = "Contingent_Worker_Reference_Data")
    protected ContingentWorkerReferenceDataType contingentWorkerReferenceData;
    @XmlElement(name = "Contingent_Worker_Contract_Info_Data")
    protected ContingentWorkerContractInfoDataType contingentWorkerContractInfoData;
    @XmlAttribute(name = "As_Of_Date", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar asOfDate;
    @XmlAttribute(name = "As_Of_Moment", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asOfMoment;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the contingentWorkerReferenceData property.
     * 
     * @return
     *     possible object is
     *     {@link ContingentWorkerReferenceDataType }
     *     
     */
    public ContingentWorkerReferenceDataType getContingentWorkerReferenceData() {
        return contingentWorkerReferenceData;
    }

    /**
     * Sets the value of the contingentWorkerReferenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContingentWorkerReferenceDataType }
     *     
     */
    public void setContingentWorkerReferenceData(ContingentWorkerReferenceDataType value) {
        this.contingentWorkerReferenceData = value;
    }

    /**
     * Gets the value of the contingentWorkerContractInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link ContingentWorkerContractInfoDataType }
     *     
     */
    public ContingentWorkerContractInfoDataType getContingentWorkerContractInfoData() {
        return contingentWorkerContractInfoData;
    }

    /**
     * Sets the value of the contingentWorkerContractInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContingentWorkerContractInfoDataType }
     *     
     */
    public void setContingentWorkerContractInfoData(ContingentWorkerContractInfoDataType value) {
        this.contingentWorkerContractInfoData = value;
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
