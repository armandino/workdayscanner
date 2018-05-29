
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing all Contingent Worker Contract Information data.
 * 
 * <p>Java class for Contingent_Worker_Contract_Info_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contingent_Worker_Contract_Info_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Status_Data" type="{urn:com.workday/bsvc}Worker_Status_DataType" minOccurs="0"/>
 *         &lt;element name="Worker_Position_Data" type="{urn:com.workday/bsvc}Worker_Position_DataType" minOccurs="0"/>
 *         &lt;element name="Contingent_Worker_Type_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor_Reference_Data" type="{urn:com.workday/bsvc}Vendor_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Contract_Details_Data" type="{urn:com.workday/bsvc}Contract_Details_DataType" minOccurs="0"/>
 *         &lt;element name="Contract_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Worker_Document_Data" type="{urn:com.workday/bsvc}Worker_Document_Data_WWSType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contingent_Worker_Contract_Info_DataType", propOrder = {
    "workerStatusData",
    "workerPositionData",
    "contingentWorkerTypeName",
    "vendorReferenceData",
    "contractDetailsData",
    "contractEndDate",
    "workerDocumentData"
})
public class ContingentWorkerContractInfoDataType {

    @XmlElement(name = "Worker_Status_Data")
    protected WorkerStatusDataType workerStatusData;
    @XmlElement(name = "Worker_Position_Data")
    protected WorkerPositionDataType workerPositionData;
    @XmlElement(name = "Contingent_Worker_Type_Name")
    protected String contingentWorkerTypeName;
    @XmlElement(name = "Vendor_Reference_Data")
    protected VendorReferenceType vendorReferenceData;
    @XmlElement(name = "Contract_Details_Data")
    protected ContractDetailsDataType contractDetailsData;
    @XmlElement(name = "Contract_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractEndDate;
    @XmlElement(name = "Worker_Document_Data")
    protected WorkerDocumentDataWWSType workerDocumentData;

    /**
     * Gets the value of the workerStatusData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerStatusDataType }
     *     
     */
    public WorkerStatusDataType getWorkerStatusData() {
        return workerStatusData;
    }

    /**
     * Sets the value of the workerStatusData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerStatusDataType }
     *     
     */
    public void setWorkerStatusData(WorkerStatusDataType value) {
        this.workerStatusData = value;
    }

    /**
     * Gets the value of the workerPositionData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerPositionDataType }
     *     
     */
    public WorkerPositionDataType getWorkerPositionData() {
        return workerPositionData;
    }

    /**
     * Sets the value of the workerPositionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerPositionDataType }
     *     
     */
    public void setWorkerPositionData(WorkerPositionDataType value) {
        this.workerPositionData = value;
    }

    /**
     * Gets the value of the contingentWorkerTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContingentWorkerTypeName() {
        return contingentWorkerTypeName;
    }

    /**
     * Sets the value of the contingentWorkerTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContingentWorkerTypeName(String value) {
        this.contingentWorkerTypeName = value;
    }

    /**
     * Gets the value of the vendorReferenceData property.
     * 
     * @return
     *     possible object is
     *     {@link VendorReferenceType }
     *     
     */
    public VendorReferenceType getVendorReferenceData() {
        return vendorReferenceData;
    }

    /**
     * Sets the value of the vendorReferenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorReferenceType }
     *     
     */
    public void setVendorReferenceData(VendorReferenceType value) {
        this.vendorReferenceData = value;
    }

    /**
     * Gets the value of the contractDetailsData property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDetailsDataType }
     *     
     */
    public ContractDetailsDataType getContractDetailsData() {
        return contractDetailsData;
    }

    /**
     * Sets the value of the contractDetailsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDetailsDataType }
     *     
     */
    public void setContractDetailsData(ContractDetailsDataType value) {
        this.contractDetailsData = value;
    }

    /**
     * Gets the value of the contractEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractEndDate() {
        return contractEndDate;
    }

    /**
     * Sets the value of the contractEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractEndDate(XMLGregorianCalendar value) {
        this.contractEndDate = value;
    }

    /**
     * Gets the value of the workerDocumentData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerDocumentDataWWSType }
     *     
     */
    public WorkerDocumentDataWWSType getWorkerDocumentData() {
        return workerDocumentData;
    }

    /**
     * Sets the value of the workerDocumentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerDocumentDataWWSType }
     *     
     */
    public void setWorkerDocumentData(WorkerDocumentDataWWSType value) {
        this.workerDocumentData = value;
    }

}
