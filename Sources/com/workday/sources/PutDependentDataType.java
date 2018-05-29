
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Wrapper data element for the Put Dependent Web Service.
 * 
 * <p>Java class for Put_Dependent_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Dependent_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dependent_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Employee_Reference" type="{urn:com.workday/bsvc}EmployeeObjectType" minOccurs="0"/>
 *         &lt;element name="Existing_Related_Person_Reference" type="{urn:com.workday/bsvc}Related_Person_for_WorkerObjectType" minOccurs="0"/>
 *         &lt;element name="Related_Person_Relationship_Reference" type="{urn:com.workday/bsvc}Related_Person_RelationshipObjectType" minOccurs="0"/>
 *         &lt;element name="Use_Employee_Address" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Use_Employee_Phone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Irrevocable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Dependent_Personal_Information_Data" type="{urn:com.workday/bsvc}Dependent_Personal_Information_DataType" minOccurs="0"/>
 *         &lt;element name="Court_Order_Replacement_Data" type="{urn:com.workday/bsvc}Qualified_Domestic_Relations_Order_Replacement_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Dependent_DataType", propOrder = {
    "dependentID",
    "employeeReference",
    "existingRelatedPersonReference",
    "relatedPersonRelationshipReference",
    "useEmployeeAddress",
    "useEmployeePhone",
    "irrevocable",
    "dependentPersonalInformationData",
    "courtOrderReplacementData"
})
public class PutDependentDataType {

    @XmlElement(name = "Dependent_ID")
    protected String dependentID;
    @XmlElement(name = "Employee_Reference")
    protected EmployeeObjectType employeeReference;
    @XmlElement(name = "Existing_Related_Person_Reference")
    protected RelatedPersonForWorkerObjectType existingRelatedPersonReference;
    @XmlElement(name = "Related_Person_Relationship_Reference")
    protected RelatedPersonRelationshipObjectType relatedPersonRelationshipReference;
    @XmlElement(name = "Use_Employee_Address")
    protected Boolean useEmployeeAddress;
    @XmlElement(name = "Use_Employee_Phone")
    protected Boolean useEmployeePhone;
    @XmlElement(name = "Irrevocable")
    protected Boolean irrevocable;
    @XmlElement(name = "Dependent_Personal_Information_Data")
    protected DependentPersonalInformationDataType dependentPersonalInformationData;
    @XmlElement(name = "Court_Order_Replacement_Data")
    protected List<QualifiedDomesticRelationsOrderReplacementDataType> courtOrderReplacementData;

    /**
     * Gets the value of the dependentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentID() {
        return dependentID;
    }

    /**
     * Sets the value of the dependentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentID(String value) {
        this.dependentID = value;
    }

    /**
     * Gets the value of the employeeReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeObjectType }
     *     
     */
    public EmployeeObjectType getEmployeeReference() {
        return employeeReference;
    }

    /**
     * Sets the value of the employeeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeObjectType }
     *     
     */
    public void setEmployeeReference(EmployeeObjectType value) {
        this.employeeReference = value;
    }

    /**
     * Gets the value of the existingRelatedPersonReference property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedPersonForWorkerObjectType }
     *     
     */
    public RelatedPersonForWorkerObjectType getExistingRelatedPersonReference() {
        return existingRelatedPersonReference;
    }

    /**
     * Sets the value of the existingRelatedPersonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedPersonForWorkerObjectType }
     *     
     */
    public void setExistingRelatedPersonReference(RelatedPersonForWorkerObjectType value) {
        this.existingRelatedPersonReference = value;
    }

    /**
     * Gets the value of the relatedPersonRelationshipReference property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedPersonRelationshipObjectType }
     *     
     */
    public RelatedPersonRelationshipObjectType getRelatedPersonRelationshipReference() {
        return relatedPersonRelationshipReference;
    }

    /**
     * Sets the value of the relatedPersonRelationshipReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedPersonRelationshipObjectType }
     *     
     */
    public void setRelatedPersonRelationshipReference(RelatedPersonRelationshipObjectType value) {
        this.relatedPersonRelationshipReference = value;
    }

    /**
     * Gets the value of the useEmployeeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseEmployeeAddress() {
        return useEmployeeAddress;
    }

    /**
     * Sets the value of the useEmployeeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseEmployeeAddress(Boolean value) {
        this.useEmployeeAddress = value;
    }

    /**
     * Gets the value of the useEmployeePhone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseEmployeePhone() {
        return useEmployeePhone;
    }

    /**
     * Sets the value of the useEmployeePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseEmployeePhone(Boolean value) {
        this.useEmployeePhone = value;
    }

    /**
     * Gets the value of the irrevocable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIrrevocable() {
        return irrevocable;
    }

    /**
     * Sets the value of the irrevocable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIrrevocable(Boolean value) {
        this.irrevocable = value;
    }

    /**
     * Gets the value of the dependentPersonalInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link DependentPersonalInformationDataType }
     *     
     */
    public DependentPersonalInformationDataType getDependentPersonalInformationData() {
        return dependentPersonalInformationData;
    }

    /**
     * Sets the value of the dependentPersonalInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependentPersonalInformationDataType }
     *     
     */
    public void setDependentPersonalInformationData(DependentPersonalInformationDataType value) {
        this.dependentPersonalInformationData = value;
    }

    /**
     * Gets the value of the courtOrderReplacementData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courtOrderReplacementData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourtOrderReplacementData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedDomesticRelationsOrderReplacementDataType }
     * 
     * 
     */
    public List<QualifiedDomesticRelationsOrderReplacementDataType> getCourtOrderReplacementData() {
        if (courtOrderReplacementData == null) {
            courtOrderReplacementData = new ArrayList<QualifiedDomesticRelationsOrderReplacementDataType>();
        }
        return this.courtOrderReplacementData;
    }

}
