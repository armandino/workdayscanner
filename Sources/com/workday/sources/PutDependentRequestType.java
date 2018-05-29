
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Put Dependent Request Information.
 * 
 * <p>Java class for Put_Dependent_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Dependent_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dependent_Reference" type="{urn:com.workday/bsvc}DependentObjectType" minOccurs="0"/>
 *         &lt;element name="Dependent_Data" type="{urn:com.workday/bsvc}Put_Dependent_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Dependent_RequestType", propOrder = {
    "dependentReference",
    "dependentData"
})
public class PutDependentRequestType {

    @XmlElement(name = "Dependent_Reference")
    protected DependentObjectType dependentReference;
    @XmlElement(name = "Dependent_Data", required = true)
    protected PutDependentDataType dependentData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the dependentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DependentObjectType }
     *     
     */
    public DependentObjectType getDependentReference() {
        return dependentReference;
    }

    /**
     * Sets the value of the dependentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependentObjectType }
     *     
     */
    public void setDependentReference(DependentObjectType value) {
        this.dependentReference = value;
    }

    /**
     * Gets the value of the dependentData property.
     * 
     * @return
     *     possible object is
     *     {@link PutDependentDataType }
     *     
     */
    public PutDependentDataType getDependentData() {
        return dependentData;
    }

    /**
     * Sets the value of the dependentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PutDependentDataType }
     *     
     */
    public void setDependentData(PutDependentDataType value) {
        this.dependentData = value;
    }

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
