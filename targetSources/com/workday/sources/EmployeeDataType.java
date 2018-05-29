
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Employee data.
 * 
 * <p>Java class for Employee_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Employee_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Integration_ID_Data" type="{urn:com.workday/bsvc}External_Integration_ID_DataType" minOccurs="0"/>
 *         &lt;element name="Personal_Info_Data" type="{urn:com.workday/bsvc}Personal_Info_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Worker_Status_Data" type="{urn:com.workday/bsvc}Worker_Status_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Worker_Position_Data" type="{urn:com.workday/bsvc}Worker_Position_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Compensation_Data" type="{urn:com.workday/bsvc}Compensation_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Compensation_Detail_Data" type="{urn:com.workday/bsvc}Compensation_Detail_DataType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Employee_DataType", propOrder = {
    "employeeID",
    "userID",
    "integrationIDData",
    "personalInfoData",
    "workerStatusData",
    "workerPositionData",
    "compensationData",
    "compensationDetailData",
    "workerDocumentData"
})
public class EmployeeDataType {

    @XmlElement(name = "Employee_ID")
    protected String employeeID;
    @XmlElement(name = "User_ID")
    protected String userID;
    @XmlElement(name = "Integration_ID_Data")
    protected ExternalIntegrationIDDataType integrationIDData;
    @XmlElement(name = "Personal_Info_Data")
    protected List<PersonalInfoDataType> personalInfoData;
    @XmlElement(name = "Worker_Status_Data")
    protected List<WorkerStatusDataType> workerStatusData;
    @XmlElement(name = "Worker_Position_Data")
    protected List<WorkerPositionDataType> workerPositionData;
    @XmlElement(name = "Compensation_Data")
    protected List<CompensationDataType> compensationData;
    @XmlElement(name = "Compensation_Detail_Data")
    protected List<CompensationDetailDataType> compensationDetailData;
    @XmlElement(name = "Worker_Document_Data")
    protected WorkerDocumentDataWWSType workerDocumentData;

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
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
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
     * Gets the value of the personalInfoData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalInfoData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalInfoData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalInfoDataType }
     * 
     * 
     */
    public List<PersonalInfoDataType> getPersonalInfoData() {
        if (personalInfoData == null) {
            personalInfoData = new ArrayList<PersonalInfoDataType>();
        }
        return this.personalInfoData;
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

    /**
     * Gets the value of the compensationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compensationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompensationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompensationDataType }
     * 
     * 
     */
    public List<CompensationDataType> getCompensationData() {
        if (compensationData == null) {
            compensationData = new ArrayList<CompensationDataType>();
        }
        return this.compensationData;
    }

    /**
     * Gets the value of the compensationDetailData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compensationDetailData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompensationDetailData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompensationDetailDataType }
     * 
     * 
     */
    public List<CompensationDetailDataType> getCompensationDetailData() {
        if (compensationDetailData == null) {
            compensationDetailData = new ArrayList<CompensationDetailDataType>();
        }
        return this.compensationDetailData;
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
