
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the reference to the Development Item and the Development Item details
 * 
 * <p>Java class for Worker_Development_ItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Development_ItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Development_Item_Reference" type="{urn:com.workday/bsvc}Development_ItemObjectType" minOccurs="0"/>
 *         &lt;element name="Development_Item_Data" type="{urn:com.workday/bsvc}Development_Item_Version_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Development_ItemType", propOrder = {
    "developmentItemReference",
    "developmentItemData"
})
public class WorkerDevelopmentItemType {

    @XmlElement(name = "Development_Item_Reference")
    protected DevelopmentItemObjectType developmentItemReference;
    @XmlElement(name = "Development_Item_Data")
    protected DevelopmentItemVersionDataType developmentItemData;

    /**
     * Gets the value of the developmentItemReference property.
     * 
     * @return
     *     possible object is
     *     {@link DevelopmentItemObjectType }
     *     
     */
    public DevelopmentItemObjectType getDevelopmentItemReference() {
        return developmentItemReference;
    }

    /**
     * Sets the value of the developmentItemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevelopmentItemObjectType }
     *     
     */
    public void setDevelopmentItemReference(DevelopmentItemObjectType value) {
        this.developmentItemReference = value;
    }

    /**
     * Gets the value of the developmentItemData property.
     * 
     * @return
     *     possible object is
     *     {@link DevelopmentItemVersionDataType }
     *     
     */
    public DevelopmentItemVersionDataType getDevelopmentItemData() {
        return developmentItemData;
    }

    /**
     * Sets the value of the developmentItemData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevelopmentItemVersionDataType }
     *     
     */
    public void setDevelopmentItemData(DevelopmentItemVersionDataType value) {
        this.developmentItemData = value;
    }

}
