
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference ID for the communication usage type.
 * 
 * <p>Java class for Communication_Usage_Type_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Communication_Usage_Type_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type_Reference" type="{urn:com.workday/bsvc}Communication_Usage_TypeObjectType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Primary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Communication_Usage_Type_DataType", propOrder = {
    "typeReference"
})
public class CommunicationUsageTypeDataType {

    @XmlElement(name = "Type_Reference", required = true)
    protected CommunicationUsageTypeObjectType typeReference;
    @XmlAttribute(name = "Primary", namespace = "urn:com.workday/bsvc")
    protected Boolean primary;

    /**
     * Gets the value of the typeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationUsageTypeObjectType }
     *     
     */
    public CommunicationUsageTypeObjectType getTypeReference() {
        return typeReference;
    }

    /**
     * Sets the value of the typeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationUsageTypeObjectType }
     *     
     */
    public void setTypeReference(CommunicationUsageTypeObjectType value) {
        this.typeReference = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimary(Boolean value) {
        this.primary = value;
    }

}
