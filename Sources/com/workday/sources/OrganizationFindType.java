
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Utilize the following criteria options to search for Organizations within the Workday system.  The Organization references that are returned are those that satisfy ALL criteria included in the request.  Therefore, the result set will become more limited with every criterium that is populated.
 * 
 * <p>Java class for Organization_FindType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_FindType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="As_Of_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Organization_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_Reference_Data" type="{urn:com.workday/bsvc}Business_Site_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Employee_Reference_Data" type="{urn:com.workday/bsvc}Employee_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Contingent_Worker_Reference_Data" type="{urn:com.workday/bsvc}Contingent_Worker_Reference_DataType" minOccurs="0"/>
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
@XmlType(name = "Organization_FindType", propOrder = {
    "asOfDate",
    "organizationName",
    "locationReferenceData",
    "employeeReferenceData",
    "contingentWorkerReferenceData"
})
public class OrganizationFindType {

    @XmlElement(name = "As_Of_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar asOfDate;
    @XmlElement(name = "Organization_Name")
    protected String organizationName;
    @XmlElement(name = "Location_Reference_Data")
    protected BusinessSiteReferenceDataType locationReferenceData;
    @XmlElement(name = "Employee_Reference_Data")
    protected EmployeeReferenceType employeeReferenceData;
    @XmlElement(name = "Contingent_Worker_Reference_Data")
    protected ContingentWorkerReferenceDataType contingentWorkerReferenceData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the locationReferenceData property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessSiteReferenceDataType }
     *     
     */
    public BusinessSiteReferenceDataType getLocationReferenceData() {
        return locationReferenceData;
    }

    /**
     * Sets the value of the locationReferenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessSiteReferenceDataType }
     *     
     */
    public void setLocationReferenceData(BusinessSiteReferenceDataType value) {
        this.locationReferenceData = value;
    }

    /**
     * Gets the value of the employeeReferenceData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeReferenceType }
     *     
     */
    public EmployeeReferenceType getEmployeeReferenceData() {
        return employeeReferenceData;
    }

    /**
     * Sets the value of the employeeReferenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeReferenceType }
     *     
     */
    public void setEmployeeReferenceData(EmployeeReferenceType value) {
        this.employeeReferenceData = value;
    }

    /**
     * Gets the value of the contingentWorkerReferenceData property.
     * 
     * @return
     *     possible object is
     *     {@link ContingentWorkerReferenceDataType }
     *     
     */
    public ContingentWorkerReferenceDataType getContingentWorkerReferenceData() {
        return contingentWorkerReferenceData;
    }

    /**
     * Sets the value of the contingentWorkerReferenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContingentWorkerReferenceDataType }
     *     
     */
    public void setContingentWorkerReferenceData(ContingentWorkerReferenceDataType value) {
        this.contingentWorkerReferenceData = value;
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
