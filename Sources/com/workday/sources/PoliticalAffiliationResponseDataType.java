
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The "Response Data" element contains the core data results based on the inbound request that was processed.
 * 
 * <p>Java class for Political_Affiliation_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Political_Affiliation_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Political_Affiliation" type="{urn:com.workday/bsvc}Political_AffiliationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Political_Affiliation_Response_DataType", propOrder = {
    "politicalAffiliation"
})
public class PoliticalAffiliationResponseDataType {

    @XmlElement(name = "Political_Affiliation")
    protected List<PoliticalAffiliationType> politicalAffiliation;

    /**
     * Gets the value of the politicalAffiliation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the politicalAffiliation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoliticalAffiliation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PoliticalAffiliationType }
     * 
     * 
     */
    public List<PoliticalAffiliationType> getPoliticalAffiliation() {
        if (politicalAffiliation == null) {
            politicalAffiliation = new ArrayList<PoliticalAffiliationType>();
        }
        return this.politicalAffiliation;
    }

}
