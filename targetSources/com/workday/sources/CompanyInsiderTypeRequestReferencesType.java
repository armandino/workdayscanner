
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing reference instance for a Company Insider Type
 * 
 * <p>Java class for Company_Insider_Type_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Company_Insider_Type_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company_Insider_Type_Reference" type="{urn:com.workday/bsvc}Company_Insider_TypeObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Company_Insider_Type_Request_ReferencesType", propOrder = {
    "companyInsiderTypeReference"
})
public class CompanyInsiderTypeRequestReferencesType {

    @XmlElement(name = "Company_Insider_Type_Reference", required = true)
    protected List<CompanyInsiderTypeObjectType> companyInsiderTypeReference;

    /**
     * Gets the value of the companyInsiderTypeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyInsiderTypeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyInsiderTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyInsiderTypeObjectType }
     * 
     * 
     */
    public List<CompanyInsiderTypeObjectType> getCompanyInsiderTypeReference() {
        if (companyInsiderTypeReference == null) {
            companyInsiderTypeReference = new ArrayList<CompanyInsiderTypeObjectType>();
        }
        return this.companyInsiderTypeReference;
    }

}
