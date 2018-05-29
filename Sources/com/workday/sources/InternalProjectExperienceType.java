
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for Internal Project Experience information.
 * 
 * <p>Java class for Internal_Project_ExperienceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Internal_Project_ExperienceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Internal_Project_Experience_Reference" type="{urn:com.workday/bsvc}Internal_Project_ExperienceObjectType" minOccurs="0"/>
 *         &lt;element name="Internal_Project_Experience_Data" type="{urn:com.workday/bsvc}Internal_Project_Experience_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Internal_Project_ExperienceType", propOrder = {
    "internalProjectExperienceReference",
    "internalProjectExperienceData"
})
public class InternalProjectExperienceType {

    @XmlElement(name = "Internal_Project_Experience_Reference")
    protected InternalProjectExperienceObjectType internalProjectExperienceReference;
    @XmlElement(name = "Internal_Project_Experience_Data")
    protected List<InternalProjectExperienceDataType> internalProjectExperienceData;

    /**
     * Gets the value of the internalProjectExperienceReference property.
     * 
     * @return
     *     possible object is
     *     {@link InternalProjectExperienceObjectType }
     *     
     */
    public InternalProjectExperienceObjectType getInternalProjectExperienceReference() {
        return internalProjectExperienceReference;
    }

    /**
     * Sets the value of the internalProjectExperienceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalProjectExperienceObjectType }
     *     
     */
    public void setInternalProjectExperienceReference(InternalProjectExperienceObjectType value) {
        this.internalProjectExperienceReference = value;
    }

    /**
     * Gets the value of the internalProjectExperienceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalProjectExperienceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalProjectExperienceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalProjectExperienceDataType }
     * 
     * 
     */
    public List<InternalProjectExperienceDataType> getInternalProjectExperienceData() {
        if (internalProjectExperienceData == null) {
            internalProjectExperienceData = new ArrayList<InternalProjectExperienceDataType>();
        }
        return this.internalProjectExperienceData;
    }

}
