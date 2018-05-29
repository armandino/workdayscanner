
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element contains criteria to filter the Organizations returned.
 * 
 * <p>Java class for Organization_Request_CriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Request_CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Type_Reference" type="{urn:com.workday/bsvc}Organization_TypeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Include_Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Transaction_Log_Criteria" type="{urn:com.workday/bsvc}Transaction_Log_CriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Field_And_Parameter_Criteria_Data" type="{urn:com.workday/bsvc}Field_And_Parameter_Criteria_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Request_CriteriaType", propOrder = {
    "organizationTypeReference",
    "includeInactive",
    "transactionLogCriteria",
    "fieldAndParameterCriteriaData"
})
public class OrganizationRequestCriteriaType {

    @XmlElement(name = "Organization_Type_Reference")
    protected List<OrganizationTypeObjectType> organizationTypeReference;
    @XmlElement(name = "Include_Inactive")
    protected Boolean includeInactive;
    @XmlElement(name = "Transaction_Log_Criteria")
    protected List<TransactionLogCriteriaType> transactionLogCriteria;
    @XmlElement(name = "Field_And_Parameter_Criteria_Data")
    protected FieldAndParameterCriteriaDataType fieldAndParameterCriteriaData;

    /**
     * Gets the value of the organizationTypeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationTypeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationTypeObjectType }
     * 
     * 
     */
    public List<OrganizationTypeObjectType> getOrganizationTypeReference() {
        if (organizationTypeReference == null) {
            organizationTypeReference = new ArrayList<OrganizationTypeObjectType>();
        }
        return this.organizationTypeReference;
    }

    /**
     * Gets the value of the includeInactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeInactive() {
        return includeInactive;
    }

    /**
     * Sets the value of the includeInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeInactive(Boolean value) {
        this.includeInactive = value;
    }

    /**
     * Gets the value of the transactionLogCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionLogCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionLogCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionLogCriteriaType }
     * 
     * 
     */
    public List<TransactionLogCriteriaType> getTransactionLogCriteria() {
        if (transactionLogCriteria == null) {
            transactionLogCriteria = new ArrayList<TransactionLogCriteriaType>();
        }
        return this.transactionLogCriteria;
    }

    /**
     * Gets the value of the fieldAndParameterCriteriaData property.
     * 
     * @return
     *     possible object is
     *     {@link FieldAndParameterCriteriaDataType }
     *     
     */
    public FieldAndParameterCriteriaDataType getFieldAndParameterCriteriaData() {
        return fieldAndParameterCriteriaData;
    }

    /**
     * Sets the value of the fieldAndParameterCriteriaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldAndParameterCriteriaDataType }
     *     
     */
    public void setFieldAndParameterCriteriaData(FieldAndParameterCriteriaDataType value) {
        this.fieldAndParameterCriteriaData = value;
    }

}
