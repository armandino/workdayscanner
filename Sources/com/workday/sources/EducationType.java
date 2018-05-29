
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for Education information.
 * 
 * <p>Java class for EducationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EducationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Education_Reference" type="{urn:com.workday/bsvc}EducationObjectType" minOccurs="0"/>
 *         &lt;element name="Education_Data" type="{urn:com.workday/bsvc}Education_Achievement_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EducationType", propOrder = {
    "educationReference",
    "educationData"
})
public class EducationType {

    @XmlElement(name = "Education_Reference")
    protected EducationObjectType educationReference;
    @XmlElement(name = "Education_Data")
    protected List<EducationAchievementDataType> educationData;

    /**
     * Gets the value of the educationReference property.
     * 
     * @return
     *     possible object is
     *     {@link EducationObjectType }
     *     
     */
    public EducationObjectType getEducationReference() {
        return educationReference;
    }

    /**
     * Sets the value of the educationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationObjectType }
     *     
     */
    public void setEducationReference(EducationObjectType value) {
        this.educationReference = value;
    }

    /**
     * Gets the value of the educationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the educationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEducationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EducationAchievementDataType }
     * 
     * 
     */
    public List<EducationAchievementDataType> getEducationData() {
        if (educationData == null) {
            educationData = new ArrayList<EducationAchievementDataType>();
        }
        return this.educationData;
    }

}
