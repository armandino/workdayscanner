
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Dependent data.
 * 
 * <p>Java class for DependentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DependentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dependent_Reference" type="{urn:com.workday/bsvc}DependentObjectType"/>
 *         &lt;element name="Dependent_Data" type="{urn:com.workday/bsvc}Dependent_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DependentType", propOrder = {
    "dependentReference",
    "dependentData"
})
public class DependentType {

    @XmlElement(name = "Dependent_Reference", required = true)
    protected DependentObjectType dependentReference;
    @XmlElement(name = "Dependent_Data", required = true)
    protected DependentDataType dependentData;

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
     *     {@link DependentDataType }
     *     
     */
    public DependentDataType getDependentData() {
        return dependentData;
    }

    /**
     * Sets the value of the dependentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependentDataType }
     *     
     */
    public void setDependentData(DependentDataType value) {
        this.dependentData = value;
    }

}
