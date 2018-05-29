
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element that includes Company Insider reference instance and Company Insider Type data.
 * 
 * <p>Java class for Company_Insider_Type_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Company_Insider_Type_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company_Insider_Type" type="{urn:com.workday/bsvc}Company_Insider_TypeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Company_Insider_Type_Response_DataType", propOrder = {
    "companyInsiderType"
})
public class CompanyInsiderTypeResponseDataType {

    @XmlElement(name = "Company_Insider_Type")
    protected List<CompanyInsiderTypeType> companyInsiderType;

    /**
     * Gets the value of the companyInsiderType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyInsiderType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyInsiderType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyInsiderTypeType }
     * 
     * 
     */
    public List<CompanyInsiderTypeType> getCompanyInsiderType() {
        if (companyInsiderType == null) {
            companyInsiderType = new ArrayList<CompanyInsiderTypeType>();
        }
        return this.companyInsiderType;
    }

}
