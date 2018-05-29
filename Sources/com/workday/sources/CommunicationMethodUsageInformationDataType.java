
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
 * <p>Java class for Communication_Method_Usage_Information_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Communication_Method_Usage_Information_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type_Data" type="{urn:com.workday/bsvc}Communication_Usage_Type_DataType" maxOccurs="unbounded"/>
 *         &lt;element name="Use_For_Reference" type="{urn:com.workday/bsvc}Communication_Usage_BehaviorObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Use_For_Tenanted_Reference" type="{urn:com.workday/bsvc}Communication_Usage_Behavior_TenantedObjectType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Communication_Method_Usage_Information_DataType", propOrder = {
    "typeData",
    "useForReference",
    "useForTenantedReference",
    "comments"
})
public class CommunicationMethodUsageInformationDataType {

    @XmlElement(name = "Type_Data", required = true)
    protected List<CommunicationUsageTypeDataType> typeData;
    @XmlElement(name = "Use_For_Reference")
    protected List<CommunicationUsageBehaviorObjectType> useForReference;
    @XmlElement(name = "Use_For_Tenanted_Reference")
    protected List<CommunicationUsageBehaviorTenantedObjectType> useForTenantedReference;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlAttribute(name = "Public", namespace = "urn:com.workday/bsvc")
    protected Boolean _public;

    /**
     * Gets the value of the typeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationUsageTypeDataType }
     * 
     * 
     */
    public List<CommunicationUsageTypeDataType> getTypeData() {
        if (typeData == null) {
            typeData = new ArrayList<CommunicationUsageTypeDataType>();
        }
        return this.typeData;
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
     * {@link CommunicationUsageBehaviorObjectType }
     * 
     * 
     */
    public List<CommunicationUsageBehaviorObjectType> getUseForReference() {
        if (useForReference == null) {
            useForReference = new ArrayList<CommunicationUsageBehaviorObjectType>();
        }
        return this.useForReference;
    }

    /**
     * Gets the value of the useForTenantedReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useForTenantedReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseForTenantedReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationUsageBehaviorTenantedObjectType }
     * 
     * 
     */
    public List<CommunicationUsageBehaviorTenantedObjectType> getUseForTenantedReference() {
        if (useForTenantedReference == null) {
            useForTenantedReference = new ArrayList<CommunicationUsageBehaviorTenantedObjectType>();
        }
        return this.useForTenantedReference;
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
