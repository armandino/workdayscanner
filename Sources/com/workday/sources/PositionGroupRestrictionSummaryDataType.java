
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper for restriction data for openings for all staffing models.
 * 
 * <p>Java class for Position_Group_Restriction_Summary_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Position_Group_Restriction_Summary_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Availability_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Earliest_Hire_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Job_Family_Reference" type="{urn:com.workday/bsvc}Job_Family_BaseObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Job_Profile_Restriction_Summary_Data" type="{urn:com.workday/bsvc}Job_Profile_Summary_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location_Reference" type="{urn:com.workday/bsvc}LocationObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Worker_Type_Reference" type="{urn:com.workday/bsvc}Worker_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Time_Type_Reference" type="{urn:com.workday/bsvc}Position_Time_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Position_Worker_Type_Reference" type="{urn:com.workday/bsvc}Position_Worker_TypeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Position_Group_Restriction_Summary_DataType", propOrder = {
    "availabilityDate",
    "earliestHireDate",
    "jobFamilyReference",
    "jobProfileRestrictionSummaryData",
    "locationReference",
    "workerTypeReference",
    "timeTypeReference",
    "positionWorkerTypeReference"
})
public class PositionGroupRestrictionSummaryDataType {

    @XmlElement(name = "Availability_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar availabilityDate;
    @XmlElement(name = "Earliest_Hire_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earliestHireDate;
    @XmlElement(name = "Job_Family_Reference")
    protected List<JobFamilyBaseObjectType> jobFamilyReference;
    @XmlElement(name = "Job_Profile_Restriction_Summary_Data")
    protected List<JobProfileSummaryDataType> jobProfileRestrictionSummaryData;
    @XmlElement(name = "Location_Reference")
    protected List<LocationObjectType> locationReference;
    @XmlElement(name = "Worker_Type_Reference")
    protected WorkerTypeObjectType workerTypeReference;
    @XmlElement(name = "Time_Type_Reference")
    protected PositionTimeTypeObjectType timeTypeReference;
    @XmlElement(name = "Position_Worker_Type_Reference")
    protected List<PositionWorkerTypeObjectType> positionWorkerTypeReference;

    /**
     * Gets the value of the availabilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvailabilityDate() {
        return availabilityDate;
    }

    /**
     * Sets the value of the availabilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvailabilityDate(XMLGregorianCalendar value) {
        this.availabilityDate = value;
    }

    /**
     * Gets the value of the earliestHireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestHireDate() {
        return earliestHireDate;
    }

    /**
     * Sets the value of the earliestHireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestHireDate(XMLGregorianCalendar value) {
        this.earliestHireDate = value;
    }

    /**
     * Gets the value of the jobFamilyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobFamilyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobFamilyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobFamilyBaseObjectType }
     * 
     * 
     */
    public List<JobFamilyBaseObjectType> getJobFamilyReference() {
        if (jobFamilyReference == null) {
            jobFamilyReference = new ArrayList<JobFamilyBaseObjectType>();
        }
        return this.jobFamilyReference;
    }

    /**
     * Gets the value of the jobProfileRestrictionSummaryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobProfileRestrictionSummaryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobProfileRestrictionSummaryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobProfileSummaryDataType }
     * 
     * 
     */
    public List<JobProfileSummaryDataType> getJobProfileRestrictionSummaryData() {
        if (jobProfileRestrictionSummaryData == null) {
            jobProfileRestrictionSummaryData = new ArrayList<JobProfileSummaryDataType>();
        }
        return this.jobProfileRestrictionSummaryData;
    }

    /**
     * Gets the value of the locationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationObjectType }
     * 
     * 
     */
    public List<LocationObjectType> getLocationReference() {
        if (locationReference == null) {
            locationReference = new ArrayList<LocationObjectType>();
        }
        return this.locationReference;
    }

    /**
     * Gets the value of the workerTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerTypeObjectType }
     *     
     */
    public WorkerTypeObjectType getWorkerTypeReference() {
        return workerTypeReference;
    }

    /**
     * Sets the value of the workerTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerTypeObjectType }
     *     
     */
    public void setWorkerTypeReference(WorkerTypeObjectType value) {
        this.workerTypeReference = value;
    }

    /**
     * Gets the value of the timeTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link PositionTimeTypeObjectType }
     *     
     */
    public PositionTimeTypeObjectType getTimeTypeReference() {
        return timeTypeReference;
    }

    /**
     * Sets the value of the timeTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionTimeTypeObjectType }
     *     
     */
    public void setTimeTypeReference(PositionTimeTypeObjectType value) {
        this.timeTypeReference = value;
    }

    /**
     * Gets the value of the positionWorkerTypeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionWorkerTypeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionWorkerTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionWorkerTypeObjectType }
     * 
     * 
     */
    public List<PositionWorkerTypeObjectType> getPositionWorkerTypeReference() {
        if (positionWorkerTypeReference == null) {
            positionWorkerTypeReference = new ArrayList<PositionWorkerTypeObjectType>();
        }
        return this.positionWorkerTypeReference;
    }

}
