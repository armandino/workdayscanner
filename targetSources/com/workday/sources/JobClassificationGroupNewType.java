
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Response element containing an instance of Job Classification Group and its associated data.
 * 
 * <p>Java class for Job_Classification_Group_NewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Classification_Group_NewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Classification_Group_Reference" type="{urn:com.workday/bsvc}Job_Classification_GroupObjectType" minOccurs="0"/>
 *         &lt;element name="Job_Classification_Group_Name_Data" type="{urn:com.workday/bsvc}Job_Classification_Group_Reference_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Job_Classification_Group_Data" type="{urn:com.workday/bsvc}Job_Classification_Group_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="As_Of_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="As_Of_Moment" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Classification_Group_NewType", propOrder = {
    "jobClassificationGroupReference",
    "jobClassificationGroupNameData",
    "jobClassificationGroupData"
})
public class JobClassificationGroupNewType {

    @XmlElement(name = "Job_Classification_Group_Reference")
    protected JobClassificationGroupObjectType jobClassificationGroupReference;
    @XmlElement(name = "Job_Classification_Group_Name_Data")
    protected List<JobClassificationGroupReferenceDataType> jobClassificationGroupNameData;
    @XmlElement(name = "Job_Classification_Group_Data")
    protected List<JobClassificationGroupDataType> jobClassificationGroupData;
    @XmlAttribute(name = "As_Of_Date", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar asOfDate;
    @XmlAttribute(name = "As_Of_Moment", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asOfMoment;

    /**
     * Gets the value of the jobClassificationGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link JobClassificationGroupObjectType }
     *     
     */
    public JobClassificationGroupObjectType getJobClassificationGroupReference() {
        return jobClassificationGroupReference;
    }

    /**
     * Sets the value of the jobClassificationGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobClassificationGroupObjectType }
     *     
     */
    public void setJobClassificationGroupReference(JobClassificationGroupObjectType value) {
        this.jobClassificationGroupReference = value;
    }

    /**
     * Gets the value of the jobClassificationGroupNameData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobClassificationGroupNameData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobClassificationGroupNameData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobClassificationGroupReferenceDataType }
     * 
     * 
     */
    public List<JobClassificationGroupReferenceDataType> getJobClassificationGroupNameData() {
        if (jobClassificationGroupNameData == null) {
            jobClassificationGroupNameData = new ArrayList<JobClassificationGroupReferenceDataType>();
        }
        return this.jobClassificationGroupNameData;
    }

    /**
     * Gets the value of the jobClassificationGroupData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobClassificationGroupData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobClassificationGroupData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobClassificationGroupDataType }
     * 
     * 
     */
    public List<JobClassificationGroupDataType> getJobClassificationGroupData() {
        if (jobClassificationGroupData == null) {
            jobClassificationGroupData = new ArrayList<JobClassificationGroupDataType>();
        }
        return this.jobClassificationGroupData;
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

}
