
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Manage Professional Affiliation Sub Business Process Data
 * 
 * <p>Java class for Manage_Professional_Affiliation_Sub_Business_Process_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Manage_Professional_Affiliation_Sub_Business_Process_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business_Sub_Process_Parameters" type="{urn:com.workday/bsvc}Business_Sub_Process_ParametersType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Manage_Professional_Affiliation_Data" type="{urn:com.workday/bsvc}Manage_Professional_Affiliation_Data_for_RoleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Manage_Professional_Affiliation_Sub_Business_Process_DataType", propOrder = {
    "businessSubProcessParameters",
    "manageProfessionalAffiliationData"
})
public class ManageProfessionalAffiliationSubBusinessProcessDataType {

    @XmlElement(name = "Business_Sub_Process_Parameters")
    protected List<BusinessSubProcessParametersType> businessSubProcessParameters;
    @XmlElement(name = "Manage_Professional_Affiliation_Data")
    protected List<ManageProfessionalAffiliationDataForRoleType> manageProfessionalAffiliationData;

    /**
     * Gets the value of the businessSubProcessParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessSubProcessParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessSubProcessParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessSubProcessParametersType }
     * 
     * 
     */
    public List<BusinessSubProcessParametersType> getBusinessSubProcessParameters() {
        if (businessSubProcessParameters == null) {
            businessSubProcessParameters = new ArrayList<BusinessSubProcessParametersType>();
        }
        return this.businessSubProcessParameters;
    }

    /**
     * Gets the value of the manageProfessionalAffiliationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manageProfessionalAffiliationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManageProfessionalAffiliationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManageProfessionalAffiliationDataForRoleType }
     * 
     * 
     */
    public List<ManageProfessionalAffiliationDataForRoleType> getManageProfessionalAffiliationData() {
        if (manageProfessionalAffiliationData == null) {
            manageProfessionalAffiliationData = new ArrayList<ManageProfessionalAffiliationDataForRoleType>();
        }
        return this.manageProfessionalAffiliationData;
    }

}
