
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Organization Reference ID Response Data
 * 
 * <p>Java class for Organization_Reference_ID_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Reference_ID_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Reference_ID" type="{urn:com.workday/bsvc}Organization_Reference_IDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Reference_ID_Response_DataType", propOrder = {
    "organizationReferenceID"
})
public class OrganizationReferenceIDResponseDataType {

    @XmlElement(name = "Organization_Reference_ID")
    protected List<OrganizationReferenceIDType> organizationReferenceID;

    /**
     * Gets the value of the organizationReferenceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationReferenceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationReferenceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationReferenceIDType }
     * 
     * 
     */
    public List<OrganizationReferenceIDType> getOrganizationReferenceID() {
        if (organizationReferenceID == null) {
            organizationReferenceID = new ArrayList<OrganizationReferenceIDType>();
        }
        return this.organizationReferenceID;
    }

}
