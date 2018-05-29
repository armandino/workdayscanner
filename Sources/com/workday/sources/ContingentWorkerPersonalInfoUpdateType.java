
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the following elements to update the Personal Information for an existing Contingent Worker within the Workday system.
 * 
 * <p>Java class for Contingent_Worker_Personal_Info_UpdateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contingent_Worker_Personal_Info_UpdateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contingent_Worker_Reference" type="{urn:com.workday/bsvc}Contingent_Worker_Reference_DataType"/>
 *         &lt;element name="Contingent_Worker_Personal_Info_Data" type="{urn:com.workday/bsvc}Worker_Personal_Info_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contingent_Worker_Personal_Info_UpdateType", propOrder = {
    "contingentWorkerReference",
    "contingentWorkerPersonalInfoData"
})
public class ContingentWorkerPersonalInfoUpdateType {

    @XmlElement(name = "Contingent_Worker_Reference", required = true)
    protected ContingentWorkerReferenceDataType contingentWorkerReference;
    @XmlElement(name = "Contingent_Worker_Personal_Info_Data", required = true)
    protected WorkerPersonalInfoDataType contingentWorkerPersonalInfoData;
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
