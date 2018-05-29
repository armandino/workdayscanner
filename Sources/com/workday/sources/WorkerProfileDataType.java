
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Worker Profile data.
 * 
 * <p>Java class for Worker_Profile_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Profile_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Employee_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="Contingent_Worker_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Business_Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Integration_ID_Data" type="{urn:com.workday/bsvc}External_Integration_ID_DataType" minOccurs="0"/>
 *         &lt;element name="Worker_Status_Data" type="{urn:com.workday/bsvc}Worker_Status_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Worker_Personal_Data" type="{urn:com.workday/bsvc}Worker_Personal_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Worker_Position_Data" type="{urn:com.workday/bsvc}Worker_Position_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Profile_DataType", propOrder = {
    "employeeID",
    "contingentWorkerID",
    "businessTitle",
    "integrationIDData",
    "workerStatusData",
    "workerPersonalData",
    "workerPositionData"
})
public class WorkerProfileDataType {

    @XmlElement(name = "Employee_ID")
    protected String employeeID;
    @XmlElement(name = "Contingent_Worker_ID")
    protected String contingentWorkerID;
    @XmlElement(name = "Business_Title")
    protected String businessTitle;
    @XmlElement(name = "Integration_ID_Data")
    protected ExternalIntegrationIDDataType integrationIDData;
    @XmlElement(name = "Worker_Status_Data")
    protected List<WorkerStatusDataType> workerStatusData;
    @XmlElement(name = "Worker_Personal_Data")
    protected List<WorkerPersonalDataType> workerPersonalData;
    @XmlElement(name = "Worker_Position_Data")
    protected List<WorkerPositionDataType> workerPositionData;

    /**
     * Gets the value of the employeeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the value of the employeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeID(String value) {
        this.employeeID = value;
    }

    /**
     * Gets the value of the contingentWorkerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContingentWorkerID() {
        return contingentWorkerID;
    }

    /**
     * Sets the value of the contingentWorkerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContingentWorkerID(String value) {
        this.contingentWorkerID = value;
    }

    /**
     * Gets the value of the businessTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTitle() {
        return businessTitle;
    }

    /**
     * Sets the value of the businessTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTitle(String value) {
        this.businessTitle = value;
    }

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
     * Gets the value of the workerStatusData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerStatusData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerStatusData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerStatusDataType }
     * 
     * 
     */
    public List<WorkerStatusDataType> getWorkerStatusData() {
        if (workerStatusData == null) {
            workerStatusData = new ArrayList<WorkerStatusDataType>();
        }
        return this.workerStatusData;
    }

    /**
     * Gets the value of the workerPersonalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerPersonalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerPersonalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerPersonalDataType }
     * 
     * 
     */
    public List<WorkerPersonalDataType> getWorkerPersonalData() {
        if (workerPersonalData == null) {
            workerPersonalData = new ArrayList<WorkerPersonalDataType>();
        }
        return this.workerPersonalData;
    }

    /**
     * Gets the value of the workerPositionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerPositionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerPositionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerPositionDataType }
     * 
     * 
     */
    public List<WorkerPositionDataType> getWorkerPositionData() {
        if (workerPositionData == null) {
            workerPositionData = new ArrayList<WorkerPositionDataType>();
        }
        return this.workerPositionData;
    }

}
