
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element for the Maintain Contact Information for Person business process web service
 * 
 * <p>Java class for Contact_Information_for_Person_Event_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact_Information_for_Person_Event_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType"/>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Worker_Contact_Information_Data" type="{urn:com.workday/bsvc}Contact_Information_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact_Information_for_Person_Event_DataType", propOrder = {
    "workerReference",
    "effectiveDate",
    "workerContactInformationData"
})
public class ContactInformationForPersonEventDataType {

    @XmlElement(name = "Worker_Reference", required = true)
    protected WorkerObjectType workerReference;
    @XmlElement(name = "Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Worker_Contact_Information_Data", required = true)
    protected ContactInformationDataType workerContactInformationData;

    /**
     * Gets the value of the workerReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerObjectType }
     *     
     */
    public WorkerObjectType getWorkerReference() {
        return workerReference;
    }

    /**
     * Sets the value of the workerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerObjectType }
     *     
     */
    public void setWorkerReference(WorkerObjectType value) {
        this.workerReference = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the workerContactInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationDataType }
     *     
     */
    public ContactInformationDataType getWorkerContactInformationData() {
        return workerContactInformationData;
    }

    /**
     * Sets the value of the workerContactInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationDataType }
     *     
     */
    public void setWorkerContactInformationData(ContactInformationDataType value) {
        this.workerContactInformationData = value;
    }

}
