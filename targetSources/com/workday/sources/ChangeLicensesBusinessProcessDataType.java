
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the License Identifier data.
 * 
 * <p>Java class for Change_Licenses_Business_Process_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Licenses_Business_Process_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType"/>
 *         &lt;element name="License_Identification_Data" type="{urn:com.workday/bsvc}License_Identification_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Licenses_Business_Process_DataType", propOrder = {
    "workerReference",
    "licenseIdentificationData"
})
public class ChangeLicensesBusinessProcessDataType {

    @XmlElement(name = "Worker_Reference", required = true)
    protected WorkerObjectType workerReference;
    @XmlElement(name = "License_Identification_Data", required = true)
    protected LicenseIdentificationDataType licenseIdentificationData;

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
     * Gets the value of the licenseIdentificationData property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseIdentificationDataType }
     *     
     */
    public LicenseIdentificationDataType getLicenseIdentificationData() {
        return licenseIdentificationData;
    }

    /**
     * Sets the value of the licenseIdentificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseIdentificationDataType }
     *     
     */
    public void setLicenseIdentificationData(LicenseIdentificationDataType value) {
        this.licenseIdentificationData = value;
    }

}
