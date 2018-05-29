
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the Request References element to retrieve a specific instance(s) of a Committee and its associated data.
 * 
 * <p>Java class for Get_Committee_Defintion_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get_Committee_Defintion_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Definition_Reference" type="{urn:com.workday/bsvc}CommitteeObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_Committee_Defintion_Request_ReferencesType", propOrder = {
    "committeeDefinitionReference"
})
public class GetCommitteeDefintionRequestReferencesType {

    @XmlElement(name = "Committee_Definition_Reference", required = true)
    protected List<CommitteeObjectType> committeeDefinitionReference;

    /**
     * Gets the value of the committeeDefinitionReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeDefinitionReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeDefinitionReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeObjectType }
     * 
     * 
     */
    public List<CommitteeObjectType> getCommitteeDefinitionReference() {
        if (committeeDefinitionReference == null) {
            committeeDefinitionReference = new ArrayList<CommitteeObjectType>();
        }
        return this.committeeDefinitionReference;
    }

}
