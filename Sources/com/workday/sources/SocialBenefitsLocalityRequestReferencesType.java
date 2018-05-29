
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the Request References element to retrieve a specific instance(s) of Social Benefits Locality and its associated data.
 * 
 * <p>Java class for Social_Benefits_Locality_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Social_Benefits_Locality_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Social_Benefits_Locality_Reference" type="{urn:com.workday/bsvc}Social_Benefits_LocalityObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Social_Benefits_Locality_Request_ReferencesType", propOrder = {
    "socialBenefitsLocalityReference"
})
public class SocialBenefitsLocalityRequestReferencesType {

    @XmlElement(name = "Social_Benefits_Locality_Reference", required = true)
    protected List<SocialBenefitsLocalityObjectType> socialBenefitsLocalityReference;

    /**
     * Gets the value of the socialBenefitsLocalityReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialBenefitsLocalityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialBenefitsLocalityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocialBenefitsLocalityObjectType }
     * 
     * 
     */
    public List<SocialBenefitsLocalityObjectType> getSocialBenefitsLocalityReference() {
        if (socialBenefitsLocalityReference == null) {
            socialBenefitsLocalityReference = new ArrayList<SocialBenefitsLocalityObjectType>();
        }
        return this.socialBenefitsLocalityReference;
    }

}
