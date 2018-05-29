
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the Request References element to retrieve a specific instance or instances of Person and their associated work contact information.
 * 
 * <p>Java class for Get_Change_Work_Contact_Information_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get_Change_Work_Contact_Information_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person_Reference" type="{urn:com.workday/bsvc}RoleObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Universal_ID_Reference" type="{urn:com.workday/bsvc}Universal_IdentifierObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_Change_Work_Contact_Information_Request_ReferencesType", propOrder = {
    "personReference",
    "universalIDReference"
})
public class GetChangeWorkContactInformationRequestReferencesType {

    @XmlElement(name = "Person_Reference")
    protected List<RoleObjectType> personReference;
    @XmlElement(name = "Universal_ID_Reference")
    protected List<UniversalIdentifierObjectType> universalIDReference;

    /**
     * Gets the value of the personReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleObjectType }
     * 
     * 
     */
    public List<RoleObjectType> getPersonReference() {
        if (personReference == null) {
            personReference = new ArrayList<RoleObjectType>();
        }
        return this.personReference;
    }

    /**
     * Gets the value of the universalIDReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the universalIDReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniversalIDReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniversalIdentifierObjectType }
     * 
     * 
     */
    public List<UniversalIdentifierObjectType> getUniversalIDReference() {
        if (universalIDReference == null) {
            universalIDReference = new ArrayList<UniversalIdentifierObjectType>();
        }
        return this.universalIDReference;
    }

}
