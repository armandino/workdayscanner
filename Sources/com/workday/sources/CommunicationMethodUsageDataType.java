
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element for all Communication Method Usage data.
 * 
 * <p>Java class for Communication_Method_Usage_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Communication_Method_Usage_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type_Reference" type="{urn:com.workday/bsvc}Communication_Usage_Type_ReferenceType" maxOccurs="unbounded"/>
 *         &lt;element name="Use_For_Reference" type="{urn:com.workday/bsvc}Communication_Usage_BehaviorEnumeration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Public" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Communication_Method_Usage_DataType", propOrder = {
    "typeReference",
    "useForReference",
    "comments"
})
public class CommunicationMethodUsageDataType {

    @XmlElement(name = "Type_Reference", required = true)
    protected List<CommunicationUsageTypeReferenceType> typeReference;
    @XmlElement(name = "Use_For_Reference")
    protected List<String> useForReference;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlAttribute(name = "Public", namespace = "urn:com.workday/bsvc")
    protected Boolean _public;

    /**
     * Gets the value of the typeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationUsageTypeReferenceType }
     * 
     * 
     */
    public List<CommunicationUsageTypeReferenceType> getTypeReference() {
        if (typeReference == null) {
            typeReference = new ArrayList<CommunicationUsageTypeReferenceType>();
        }
        return this.typeReference;
    }

    /**
     * Gets the value of the useForReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useForReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseForReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUseForReference() {
        if (useForReference == null) {
            useForReference = new ArrayList<String>();
        }
        return this.useForReference;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the public property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublic() {
        return _public;
    }

    /**
     * Sets the value of the public property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublic(Boolean value) {
        this._public = value;
    }

}
