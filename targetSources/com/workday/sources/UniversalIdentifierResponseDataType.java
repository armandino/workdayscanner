
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response Data
 * 
 * <p>Java class for Universal_Identifier_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Universal_Identifier_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Universal_Identifier" type="{urn:com.workday/bsvc}Universal_IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Universal_Identifier_Response_DataType", propOrder = {
    "universalIdentifier"
})
public class UniversalIdentifierResponseDataType {

    @XmlElement(name = "Universal_Identifier")
    protected List<UniversalIdentifierType> universalIdentifier;

    /**
     * Gets the value of the universalIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the universalIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniversalIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniversalIdentifierType }
     * 
     * 
     */
    public List<UniversalIdentifierType> getUniversalIdentifier() {
        if (universalIdentifier == null) {
            universalIdentifier = new ArrayList<UniversalIdentifierType>();
        }
        return this.universalIdentifier;
    }

}
