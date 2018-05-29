
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The gender identity response data.
 * 
 * <p>Java class for Gender_Identity_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Gender_Identity_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Gender_Identity" type="{urn:com.workday/bsvc}Gender_IdentityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gender_Identity_Response_DataType", propOrder = {
    "genderIdentity"
})
public class GenderIdentityResponseDataType {

    @XmlElement(name = "Gender_Identity")
    protected List<GenderIdentityType> genderIdentity;

    /**
     * Gets the value of the genderIdentity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genderIdentity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenderIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenderIdentityType }
     * 
     * 
     */
    public List<GenderIdentityType> getGenderIdentity() {
        if (genderIdentity == null) {
            genderIdentity = new ArrayList<GenderIdentityType>();
        }
        return this.genderIdentity;
    }

}
