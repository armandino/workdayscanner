
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
 * Job Classification Group Data Element
 * 
 * <p>Java class for Job_Classification_Group_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Classification_Group_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Job_Classification_Group_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_Setup_Data_Mapping_Reference" type="{urn:com.workday/bsvc}Global_Setup_Data_MappingObjectType" minOccurs="0"/>
 *         &lt;element name="Location_Reference" type="{urn:com.workday/bsvc}Location_ContextObjectType" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Job_Classification" type="{urn:com.workday/bsvc}Job_ClassificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Classification_Group_DataType", propOrder = {
    "id",
    "effectiveDate",
    "jobClassificationGroupName",
    "globalSetupDataMappingReference",
    "locationReference",
    "inactive",
    "jobClassification"
})
public class JobClassificationGroupDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Job_Classification_Group_Name")
    protected String jobClassificationGroupName;
    @XmlElement(name = "Global_Setup_Data_Mapping_Reference")
    protected GlobalSetupDataMappingObjectType globalSetupDataMappingReference;
    @XmlElement(name = "Location_Reference")
    protected LocationContextObjectType locationReference;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;
    @XmlElement(name = "Job_Classification")
    protected List<JobClassificationType> jobClassification;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     * Gets the value of the jobClassificationGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobClassificationGroupName() {
        return jobClassificationGroupName;
    }

    /**
     * Sets the value of the jobClassificationGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobClassificationGroupName(String value) {
        this.jobClassificationGroupName = value;
    }

    /**
     * Gets the value of the globalSetupDataMappingReference property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalSetupDataMappingObjectType }
     *     
     */
    public GlobalSetupDataMappingObjectType getGlobalSetupDataMappingReference() {
        return globalSetupDataMappingReference;
    }

    /**
     * Sets the value of the globalSetupDataMappingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalSetupDataMappingObjectType }
     *     
     */
    public void setGlobalSetupDataMappingReference(GlobalSetupDataMappingObjectType value) {
        this.globalSetupDataMappingReference = value;
    }

    /**
     * Gets the value of the locationReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationContextObjectType }
     *     
     */
    public LocationContextObjectType getLocationReference() {
        return locationReference;
    }

    /**
     * Sets the value of the locationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationContextObjectType }
     *     
     */
    public void setLocationReference(LocationContextObjectType value) {
        this.locationReference = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

    /**
     * Gets the value of the jobClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobClassificationType }
     * 
     * 
     */
    public List<JobClassificationType> getJobClassification() {
        if (jobClassification == null) {
            jobClassification = new ArrayList<JobClassificationType>();
        }
        return this.jobClassification;
    }

}
