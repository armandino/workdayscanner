
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Result of the evaluation of an External Field based on a contextual instance.
 * 
 * <p>Java class for Document_Field_Result_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document_Field_Result_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Field_Reference" type="{urn:com.workday/bsvc}Integration_Document_FieldObjectType" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document_Field_Result_DataType", propOrder = {
    "fieldReference",
    "value"
})
public class DocumentFieldResultDataType {

    @XmlElement(name = "Field_Reference")
    protected IntegrationDocumentFieldObjectType fieldReference;
    @XmlElement(name = "Value")
    protected String value;

    /**
     * Gets the value of the fieldReference property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDocumentFieldObjectType }
     *     
     */
    public IntegrationDocumentFieldObjectType getFieldReference() {
        return fieldReference;
    }

    /**
     * Sets the value of the fieldReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDocumentFieldObjectType }
     *     
     */
    public void setFieldReference(IntegrationDocumentFieldObjectType value) {
        this.fieldReference = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
