
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * References to specific Organizations to return
 * 
 * <p>Java class for Organization_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Skip_Non_Existing_Instances" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Request_ReferencesType", propOrder = {
    "organizationReference"
})
public class OrganizationRequestReferencesType {

    @XmlElement(name = "Organization_Reference", required = true)
    protected List<OrganizationObjectType> organizationReference;
    @XmlAttribute(name = "Skip_Non_Existing_Instances", namespace = "urn:com.workday/bsvc")
    protected Boolean skipNonExistingInstances;

    /**
     * Gets the value of the organizationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationObjectType }
     * 
     * 
     */
    public List<OrganizationObjectType> getOrganizationReference() {
        if (organizationReference == null) {
            organizationReference = new ArrayList<OrganizationObjectType>();
        }
        return this.organizationReference;
    }

    /**
     * Gets the value of the skipNonExistingInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipNonExistingInstances() {
        return skipNonExistingInstances;
    }

    /**
     * Sets the value of the skipNonExistingInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipNonExistingInstances(Boolean value) {
        this.skipNonExistingInstances = value;
    }

}
