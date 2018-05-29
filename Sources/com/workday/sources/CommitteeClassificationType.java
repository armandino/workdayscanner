
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the data for a Committee Classification.
 * 
 * <p>Java class for Committee_ClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_ClassificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Classification_Reference" type="{urn:com.workday/bsvc}Committee_ClassificationObjectType" minOccurs="0"/>
 *         &lt;element name="Committee_Classification_Data" type="{urn:com.workday/bsvc}Committee_Classification_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_ClassificationType", propOrder = {
    "committeeClassificationReference",
    "committeeClassificationData"
})
public class CommitteeClassificationType {

    @XmlElement(name = "Committee_Classification_Reference")
    protected CommitteeClassificationObjectType committeeClassificationReference;
    @XmlElement(name = "Committee_Classification_Data")
    protected List<CommitteeClassificationDataType> committeeClassificationData;

    /**
     * Gets the value of the committeeClassificationReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeClassificationObjectType }
     *     
     */
    public CommitteeClassificationObjectType getCommitteeClassificationReference() {
        return committeeClassificationReference;
    }

    /**
     * Sets the value of the committeeClassificationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeClassificationObjectType }
     *     
     */
    public void setCommitteeClassificationReference(CommitteeClassificationObjectType value) {
        this.committeeClassificationReference = value;
    }

    /**
     * Gets the value of the committeeClassificationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeClassificationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeClassificationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeClassificationDataType }
     * 
     * 
     */
    public List<CommitteeClassificationDataType> getCommitteeClassificationData() {
        if (committeeClassificationData == null) {
            committeeClassificationData = new ArrayList<CommitteeClassificationDataType>();
        }
        return this.committeeClassificationData;
    }

}
