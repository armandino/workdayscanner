
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * User Language Setting Data
 * 
 * <p>Java class for Preferred_Communication_Language_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Preferred_Communication_Language_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="User_Language_Reference" type="{urn:com.workday/bsvc}User_LanguageObjectType" maxOccurs="unbounded"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Preferred_Communication_Language_DataType", propOrder = {
    "userLanguageReference",
    "inactive"
})
public class PreferredCommunicationLanguageDataType {

    @XmlElement(name = "User_Language_Reference", required = true)
    protected List<UserLanguageObjectType> userLanguageReference;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;

    /**
     * Gets the value of the userLanguageReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userLanguageReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserLanguageReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserLanguageObjectType }
     * 
     * 
     */
    public List<UserLanguageObjectType> getUserLanguageReference() {
        if (userLanguageReference == null) {
            userLanguageReference = new ArrayList<UserLanguageObjectType>();
        }
        return this.userLanguageReference;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

}
