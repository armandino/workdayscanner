
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The secondary reasons for the worker's most recent termination.
 * 
 * <p>Java class for Secondary_Termination_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Secondary_Termination_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Secondary_Termination_Reason_Reference" type="{urn:com.workday/bsvc}Event_Classification_SubcategoryObjectType" minOccurs="0"/>
 *         &lt;element name="Secondary_Termination_Reason_Category_Reference" type="{urn:com.workday/bsvc}Event_Classification_CategoryObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Secondary_Termination_DataType", propOrder = {
    "secondaryTerminationReasonReference",
    "secondaryTerminationReasonCategoryReference"
})
public class SecondaryTerminationDataType {

    @XmlElement(name = "Secondary_Termination_Reason_Reference")
    protected EventClassificationSubcategoryObjectType secondaryTerminationReasonReference;
    @XmlElement(name = "Secondary_Termination_Reason_Category_Reference")
    protected EventClassificationCategoryObjectType secondaryTerminationReasonCategoryReference;

    /**
     * Gets the value of the secondaryTerminationReasonReference property.
     * 
     * @return
     *     possible object is
     *     {@link EventClassificationSubcategoryObjectType }
     *     
     */
    public EventClassificationSubcategoryObjectType getSecondaryTerminationReasonReference() {
        return secondaryTerminationReasonReference;
    }

    /**
     * Sets the value of the secondaryTerminationReasonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventClassificationSubcategoryObjectType }
     *     
     */
    public void setSecondaryTerminationReasonReference(EventClassificationSubcategoryObjectType value) {
        this.secondaryTerminationReasonReference = value;
    }

    /**
     * Gets the value of the secondaryTerminationReasonCategoryReference property.
     * 
     * @return
     *     possible object is
     *     {@link EventClassificationCategoryObjectType }
     *     
     */
    public EventClassificationCategoryObjectType getSecondaryTerminationReasonCategoryReference() {
        return secondaryTerminationReasonCategoryReference;
    }

    /**
     * Sets the value of the secondaryTerminationReasonCategoryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventClassificationCategoryObjectType }
     *     
     */
    public void setSecondaryTerminationReasonCategoryReference(EventClassificationCategoryObjectType value) {
        this.secondaryTerminationReasonCategoryReference = value;
    }

}
