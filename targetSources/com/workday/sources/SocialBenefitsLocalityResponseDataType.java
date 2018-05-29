
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Social Benefits Locality data.
 * 
 * <p>Java class for Social_Benefits_Locality_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Social_Benefits_Locality_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Social_Benefits_Locality" type="{urn:com.workday/bsvc}Social_Benefits_LocalityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Social_Benefits_Locality_Response_DataType", propOrder = {
    "socialBenefitsLocality"
})
public class SocialBenefitsLocalityResponseDataType {

    @XmlElement(name = "Social_Benefits_Locality")
    protected List<SocialBenefitsLocalityType> socialBenefitsLocality;

    /**
     * Gets the value of the socialBenefitsLocality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialBenefitsLocality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialBenefitsLocality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocialBenefitsLocalityType }
     * 
     * 
     */
    public List<SocialBenefitsLocalityType> getSocialBenefitsLocality() {
        if (socialBenefitsLocality == null) {
            socialBenefitsLocality = new ArrayList<SocialBenefitsLocalityType>();
        }
        return this.socialBenefitsLocality;
    }

}
