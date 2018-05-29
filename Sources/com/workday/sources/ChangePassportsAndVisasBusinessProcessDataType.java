
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Passport and Visa Identifier data.
 * 
 * <p>Java class for Change_Passports_and_Visas_Business_Process_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Passports_and_Visas_Business_Process_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType"/>
 *         &lt;element name="Passports_and_Visas_Identification_Data" type="{urn:com.workday/bsvc}Passports_and_Visas_Identification_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Passports_and_Visas_Business_Process_DataType", propOrder = {
    "workerReference",
    "passportsAndVisasIdentificationData"
})
public class ChangePassportsAndVisasBusinessProcessDataType {

    @XmlElement(name = "Worker_Reference", required = true)
    protected WorkerObjectType workerReference;
    @XmlElement(name = "Passports_and_Visas_Identification_Data", required = true)
    protected PassportsAndVisasIdentificationDataType passportsAndVisasIdentificationData;

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
     * Gets the value of the passportsAndVisasIdentificationData property.
     * 
     * @return
     *     possible object is
     *     {@link PassportsAndVisasIdentificationDataType }
     *     
     */
    public PassportsAndVisasIdentificationDataType getPassportsAndVisasIdentificationData() {
        return passportsAndVisasIdentificationData;
    }

    /**
     * Sets the value of the passportsAndVisasIdentificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassportsAndVisasIdentificationDataType }
     *     
     */
    public void setPassportsAndVisasIdentificationData(PassportsAndVisasIdentificationDataType value) {
        this.passportsAndVisasIdentificationData = value;
    }

}
