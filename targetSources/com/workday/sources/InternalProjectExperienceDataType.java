
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element for the Internal Project Experience information.
 * 
 * <p>Java class for Internal_Project_Experience_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Internal_Project_Experience_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Internal_Project_Experience_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remove_Internal_Project_Experience" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Internal_Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Project_Leader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Internal_Project_Experience_DataType", propOrder = {
    "internalProjectExperienceID",
    "removeInternalProjectExperience",
    "internalProject",
    "description",
    "startDate",
    "endDate",
    "projectLeader"
})
public class InternalProjectExperienceDataType {

    @XmlElement(name = "Internal_Project_Experience_ID")
    protected String internalProjectExperienceID;
    @XmlElement(name = "Remove_Internal_Project_Experience")
    protected Boolean removeInternalProjectExperience;
    @XmlElement(name = "Internal_Project")
    protected String internalProject;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Project_Leader")
    protected String projectLeader;

    /**
     * Gets the value of the internalProjectExperienceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalProjectExperienceID() {
        return internalProjectExperienceID;
    }

    /**
     * Sets the value of the internalProjectExperienceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalProjectExperienceID(String value) {
        this.internalProjectExperienceID = value;
    }

    /**
     * Gets the value of the removeInternalProjectExperience property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveInternalProjectExperience() {
        return removeInternalProjectExperience;
    }

    /**
     * Sets the value of the removeInternalProjectExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveInternalProjectExperience(Boolean value) {
        this.removeInternalProjectExperience = value;
    }

    /**
     * Gets the value of the internalProject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalProject() {
        return internalProject;
    }

    /**
     * Sets the value of the internalProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalProject(String value) {
        this.internalProject = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the projectLeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectLeader() {
        return projectLeader;
    }

    /**
     * Sets the value of the projectLeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectLeader(String value) {
        this.projectLeader = value;
    }

}
