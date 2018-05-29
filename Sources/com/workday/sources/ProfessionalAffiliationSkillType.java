
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Organization Professional Affiliation information.
 * 
 * <p>Java class for Professional_Affiliation_SkillType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Professional_Affiliation_SkillType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Professional_Affiliation_Reference" type="{urn:com.workday/bsvc}Professional_Affiliation_SkillObjectType" minOccurs="0"/>
 *         &lt;element name="Organization_Professional_Affiliation_Data" type="{urn:com.workday/bsvc}Professional_Affiliation_Organization_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Professional_Affiliation_SkillType", propOrder = {
    "organizationProfessionalAffiliationReference",
    "organizationProfessionalAffiliationData"
})
public class ProfessionalAffiliationSkillType {

    @XmlElement(name = "Organization_Professional_Affiliation_Reference")
    protected ProfessionalAffiliationSkillObjectType organizationProfessionalAffiliationReference;
    @XmlElement(name = "Organization_Professional_Affiliation_Data")
    protected List<ProfessionalAffiliationOrganizationDataType> organizationProfessionalAffiliationData;

    /**
     * Gets the value of the organizationProfessionalAffiliationReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProfessionalAffiliationSkillObjectType }
     *     
     */
    public ProfessionalAffiliationSkillObjectType getOrganizationProfessionalAffiliationReference() {
        return organizationProfessionalAffiliationReference;
    }

    /**
     * Sets the value of the organizationProfessionalAffiliationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfessionalAffiliationSkillObjectType }
     *     
     */
    public void setOrganizationProfessionalAffiliationReference(ProfessionalAffiliationSkillObjectType value) {
        this.organizationProfessionalAffiliationReference = value;
    }

    /**
     * Gets the value of the organizationProfessionalAffiliationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationProfessionalAffiliationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationProfessionalAffiliationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfessionalAffiliationOrganizationDataType }
     * 
     * 
     */
    public List<ProfessionalAffiliationOrganizationDataType> getOrganizationProfessionalAffiliationData() {
        if (organizationProfessionalAffiliationData == null) {
            organizationProfessionalAffiliationData = new ArrayList<ProfessionalAffiliationOrganizationDataType>();
        }
        return this.organizationProfessionalAffiliationData;
    }

}
