
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the response elements for the Get Political Affiliation and Put Political Affiliation service requests.
 * 
 * <p>Java class for Political_AffiliationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Political_AffiliationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Political_Affiliation_Reference" type="{urn:com.workday/bsvc}Political_AffiliationObjectType" minOccurs="0"/>
 *         &lt;element name="Political_Affiliation_Data" type="{urn:com.workday/bsvc}Political_Affiliation_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Political_AffiliationType", propOrder = {
    "politicalAffiliationReference",
    "politicalAffiliationData"
})
public class PoliticalAffiliationType {

    @XmlElement(name = "Political_Affiliation_Reference")
    protected PoliticalAffiliationObjectType politicalAffiliationReference;
    @XmlElement(name = "Political_Affiliation_Data")
    protected PoliticalAffiliationDataType politicalAffiliationData;

    /**
     * Gets the value of the politicalAffiliationReference property.
     * 
     * @return
     *     possible object is
     *     {@link PoliticalAffiliationObjectType }
     *     
     */
    public PoliticalAffiliationObjectType getPoliticalAffiliationReference() {
        return politicalAffiliationReference;
    }

    /**
     * Sets the value of the politicalAffiliationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoliticalAffiliationObjectType }
     *     
     */
    public void setPoliticalAffiliationReference(PoliticalAffiliationObjectType value) {
        this.politicalAffiliationReference = value;
    }

    /**
     * Gets the value of the politicalAffiliationData property.
     * 
     * @return
     *     possible object is
     *     {@link PoliticalAffiliationDataType }
     *     
     */
    public PoliticalAffiliationDataType getPoliticalAffiliationData() {
        return politicalAffiliationData;
    }

    /**
     * Sets the value of the politicalAffiliationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoliticalAffiliationDataType }
     *     
     */
    public void setPoliticalAffiliationData(PoliticalAffiliationDataType value) {
        this.politicalAffiliationData = value;
    }

}
