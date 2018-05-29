
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the Request References element to retrieve a specific instance(s) of Political Affiliation and its associated data.
 * 
 * <p>Java class for Political_Affiliation_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Political_Affiliation_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Political_Affiliation_Reference" type="{urn:com.workday/bsvc}Political_AffiliationObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Political_Affiliation_Request_ReferencesType", propOrder = {
    "politicalAffiliationReference"
})
public class PoliticalAffiliationRequestReferencesType {

    @XmlElement(name = "Political_Affiliation_Reference", required = true)
    protected List<PoliticalAffiliationObjectType> politicalAffiliationReference;

    /**
     * Gets the value of the politicalAffiliationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the politicalAffiliationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoliticalAffiliationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PoliticalAffiliationObjectType }
     * 
     * 
     */
    public List<PoliticalAffiliationObjectType> getPoliticalAffiliationReference() {
        if (politicalAffiliationReference == null) {
            politicalAffiliationReference = new ArrayList<PoliticalAffiliationObjectType>();
        }
        return this.politicalAffiliationReference;
    }

}
