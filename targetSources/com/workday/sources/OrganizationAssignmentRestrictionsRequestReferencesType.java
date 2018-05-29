
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Organization Assignment Restrictions Request References
 * 
 * <p>Java class for Organization_Assignment_Restrictions_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Assignment_Restrictions_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Supervisory_Organization_Reference" type="{urn:com.workday/bsvc}Supervisory_OrganizationObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Assignment_Restrictions_Request_ReferencesType", propOrder = {
    "supervisoryOrganizationReference"
})
public class OrganizationAssignmentRestrictionsRequestReferencesType {

    @XmlElement(name = "Supervisory_Organization_Reference", required = true)
    protected List<SupervisoryOrganizationObjectType> supervisoryOrganizationReference;

    /**
     * Gets the value of the supervisoryOrganizationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supervisoryOrganizationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupervisoryOrganizationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupervisoryOrganizationObjectType }
     * 
     * 
     */
    public List<SupervisoryOrganizationObjectType> getSupervisoryOrganizationReference() {
        if (supervisoryOrganizationReference == null) {
            supervisoryOrganizationReference = new ArrayList<SupervisoryOrganizationObjectType>();
        }
        return this.supervisoryOrganizationReference;
    }

}
