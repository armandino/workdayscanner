
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference to the gender identity of the person.
 * 
 * <p>Java class for Gender_Identity_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Gender_Identity_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Gender_Identity_Reference" type="{urn:com.workday/bsvc}Gender_IdentityObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gender_Identity_Request_ReferencesType", propOrder = {
    "genderIdentityReference"
})
public class GenderIdentityRequestReferencesType {

    @XmlElement(name = "Gender_Identity_Reference", required = true)
    protected List<GenderIdentityObjectType> genderIdentityReference;

    /**
     * Gets the value of the genderIdentityReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genderIdentityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenderIdentityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenderIdentityObjectType }
     * 
     * 
     */
    public List<GenderIdentityObjectType> getGenderIdentityReference() {
        if (genderIdentityReference == null) {
            genderIdentityReference = new ArrayList<GenderIdentityObjectType>();
        }
        return this.genderIdentityReference;
    }

}
