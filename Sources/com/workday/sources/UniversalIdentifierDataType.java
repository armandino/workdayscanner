
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Universal Identifier Data
 * 
 * <p>Java class for Universal_Identifier_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Universal_Identifier_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person_Reference" type="{urn:com.workday/bsvc}RoleObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Universal_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Universal_Identifier_DataType", propOrder = {
    "personReference",
    "universalID"
})
public class UniversalIdentifierDataType {

    @XmlElement(name = "Person_Reference")
    protected List<RoleObjectType> personReference;
    @XmlElement(name = "Universal_ID")
    protected String universalID;

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
     * Gets the value of the universalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalID() {
        return universalID;
    }

    /**
     * Sets the value of the universalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalID(String value) {
        this.universalID = value;
    }

}
