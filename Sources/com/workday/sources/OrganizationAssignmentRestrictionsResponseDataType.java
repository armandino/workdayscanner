
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response Data
 * 
 * <p>Java class for Organization_Assignment_Restrictions_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Assignment_Restrictions_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Assignment_Restrictions" type="{urn:com.workday/bsvc}Organization_Assignment_RestrictionsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Assignment_Restrictions_Response_DataType", propOrder = {
    "organizationAssignmentRestrictions"
})
public class OrganizationAssignmentRestrictionsResponseDataType {

    @XmlElement(name = "Organization_Assignment_Restrictions")
    protected List<OrganizationAssignmentRestrictionsType> organizationAssignmentRestrictions;

    /**
     * Gets the value of the organizationAssignmentRestrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationAssignmentRestrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationAssignmentRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationAssignmentRestrictionsType }
     * 
     * 
     */
    public List<OrganizationAssignmentRestrictionsType> getOrganizationAssignmentRestrictions() {
        if (organizationAssignmentRestrictions == null) {
            organizationAssignmentRestrictions = new ArrayList<OrganizationAssignmentRestrictionsType>();
        }
        return this.organizationAssignmentRestrictions;
    }

}
