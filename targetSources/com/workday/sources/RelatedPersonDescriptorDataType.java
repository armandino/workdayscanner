
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Related Person Descriptor data.
 * 
 * <p>Java class for Related_Person_Descriptor_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Related_Person_Descriptor_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Related_Person_Relationship_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Related_Person_Descriptor_DataType", propOrder = {
    "relatedPersonRelationshipName"
})
public class RelatedPersonDescriptorDataType {

    @XmlElement(name = "Related_Person_Relationship_Name")
    protected String relatedPersonRelationshipName;

    /**
     * Gets the value of the relatedPersonRelationshipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedPersonRelationshipName() {
        return relatedPersonRelationshipName;
    }

    /**
     * Sets the value of the relatedPersonRelationshipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedPersonRelationshipName(String value) {
        this.relatedPersonRelationshipName = value;
    }

}
