
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for Professional Affiliation Data.
 * 
 * <p>Java class for Manage_Professional_Affiliation_Data_for_RoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Manage_Professional_Affiliation_Data_for_RoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Role_Reference" type="{urn:com.workday/bsvc}RoleObjectType" minOccurs="0"/>
 *         &lt;element name="Source_Reference" type="{urn:com.workday/bsvc}Person_Skill_Source_CategoryObjectType" minOccurs="0"/>
 *         &lt;element name="Professional_Affiliation" type="{urn:com.workday/bsvc}Professional_Affiliation_SkillType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Manage_Professional_Affiliation_Data_for_RoleType", propOrder = {
    "roleReference",
    "sourceReference",
    "professionalAffiliation"
})
public class ManageProfessionalAffiliationDataForRoleType {

    @XmlElement(name = "Role_Reference")
    protected RoleObjectType roleReference;
    @XmlElement(name = "Source_Reference")
    protected PersonSkillSourceCategoryObjectType sourceReference;
    @XmlElement(name = "Professional_Affiliation")
    protected List<ProfessionalAffiliationSkillType> professionalAffiliation;

    /**
     * Gets the value of the roleReference property.
     * 
     * @return
     *     possible object is
     *     {@link RoleObjectType }
     *     
     */
    public RoleObjectType getRoleReference() {
        return roleReference;
    }

    /**
     * Sets the value of the roleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleObjectType }
     *     
     */
    public void setRoleReference(RoleObjectType value) {
        this.roleReference = value;
    }

    /**
     * Gets the value of the sourceReference property.
     * 
     * @return
     *     possible object is
     *     {@link PersonSkillSourceCategoryObjectType }
     *     
     */
    public PersonSkillSourceCategoryObjectType getSourceReference() {
        return sourceReference;
    }

    /**
     * Sets the value of the sourceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonSkillSourceCategoryObjectType }
     *     
     */
    public void setSourceReference(PersonSkillSourceCategoryObjectType value) {
        this.sourceReference = value;
    }

    /**
     * Gets the value of the professionalAffiliation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the professionalAffiliation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfessionalAffiliation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfessionalAffiliationSkillType }
     * 
     * 
     */
    public List<ProfessionalAffiliationSkillType> getProfessionalAffiliation() {
        if (professionalAffiliation == null) {
            professionalAffiliation = new ArrayList<ProfessionalAffiliationSkillType>();
        }
        return this.professionalAffiliation;
    }

}
