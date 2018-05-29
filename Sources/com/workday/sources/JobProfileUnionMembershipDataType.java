
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container For Union Membership Data
 * 
 * <p>Java class for Job_Profile_Union_Membership_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Profile_Union_Membership_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Requirement_Option_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Union_Reference" type="{urn:com.workday/bsvc}UnionObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Profile_Union_Membership_DataType", propOrder = {
    "requirementOptionReference",
    "unionReference"
})
public class JobProfileUnionMembershipDataType {

    @XmlElement(name = "Requirement_Option_Reference")
    protected UniqueIdentifierObjectType requirementOptionReference;
    @XmlElement(name = "Union_Reference")
    protected List<UnionObjectType> unionReference;

    /**
     * Gets the value of the requirementOptionReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getRequirementOptionReference() {
        return requirementOptionReference;
    }

    /**
     * Sets the value of the requirementOptionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setRequirementOptionReference(UniqueIdentifierObjectType value) {
        this.requirementOptionReference = value;
    }

    /**
     * Gets the value of the unionReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unionReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnionReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnionObjectType }
     * 
     * 
     */
    public List<UnionObjectType> getUnionReference() {
        if (unionReference == null) {
            unionReference = new ArrayList<UnionObjectType>();
        }
        return this.unionReference;
    }

}
