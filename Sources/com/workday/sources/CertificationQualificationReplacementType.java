
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for Certification Qualifications. Allows all certification qualifications for a Job Profile or Position Restriction to be removed - or to replace all existing certification qualifications with those sent in the web service
 * 
 * <p>Java class for Certification_Qualification_ReplacementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Certification_Qualification_ReplacementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Certification_Qualification_Replacement_Data" type="{urn:com.workday/bsvc}Certification_Qualification_Profile_Replacement_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Certification_Qualification_ReplacementType", propOrder = {
    "certificationQualificationReplacementData"
})
public class CertificationQualificationReplacementType {

    @XmlElement(name = "Certification_Qualification_Replacement_Data")
    protected List<CertificationQualificationProfileReplacementDataType> certificationQualificationReplacementData;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the certificationQualificationReplacementData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificationQualificationReplacementData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificationQualificationReplacementData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificationQualificationProfileReplacementDataType }
     * 
     * 
     */
    public List<CertificationQualificationProfileReplacementDataType> getCertificationQualificationReplacementData() {
        if (certificationQualificationReplacementData == null) {
            certificationQualificationReplacementData = new ArrayList<CertificationQualificationProfileReplacementDataType>();
        }
        return this.certificationQualificationReplacementData;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

}
