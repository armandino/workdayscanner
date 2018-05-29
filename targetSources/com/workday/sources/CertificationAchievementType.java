
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for Certification information.
 * 
 * <p>Java class for Certification_AchievementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Certification_AchievementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Certification_Reference" type="{urn:com.workday/bsvc}Certification_SkillObjectType" minOccurs="0"/>
 *         &lt;element name="Certification_Data" type="{urn:com.workday/bsvc}Certification_Achievement_DataType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Certification_AchievementType", propOrder = {
    "certificationReference",
    "certificationData"
})
public class CertificationAchievementType {

    @XmlElement(name = "Certification_Reference")
    protected CertificationSkillObjectType certificationReference;
    @XmlElement(name = "Certification_Data", required = true)
    protected List<CertificationAchievementDataType> certificationData;

    /**
     * Gets the value of the certificationReference property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationSkillObjectType }
     *     
     */
    public CertificationSkillObjectType getCertificationReference() {
        return certificationReference;
    }

    /**
     * Sets the value of the certificationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationSkillObjectType }
     *     
     */
    public void setCertificationReference(CertificationSkillObjectType value) {
        this.certificationReference = value;
    }

    /**
     * Gets the value of the certificationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificationAchievementDataType }
     * 
     * 
     */
    public List<CertificationAchievementDataType> getCertificationData() {
        if (certificationData == null) {
            certificationData = new ArrayList<CertificationAchievementDataType>();
        }
        return this.certificationData;
    }

}
