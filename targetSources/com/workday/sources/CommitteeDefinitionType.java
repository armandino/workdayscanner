
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Committee Definition Response Data
 * 
 * <p>Java class for Committee_DefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_DefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Definition_Reference" type="{urn:com.workday/bsvc}CommitteeObjectType" minOccurs="0"/>
 *         &lt;element name="Committee_Definition_Data" type="{urn:com.workday/bsvc}Committee_Definition_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_DefinitionType", propOrder = {
    "committeeDefinitionReference",
    "committeeDefinitionData"
})
public class CommitteeDefinitionType {

    @XmlElement(name = "Committee_Definition_Reference")
    protected CommitteeObjectType committeeDefinitionReference;
    @XmlElement(name = "Committee_Definition_Data")
    protected List<CommitteeDefinitionDataType> committeeDefinitionData;

    /**
     * Gets the value of the committeeDefinitionReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeObjectType }
     *     
     */
    public CommitteeObjectType getCommitteeDefinitionReference() {
        return committeeDefinitionReference;
    }

    /**
     * Sets the value of the committeeDefinitionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeObjectType }
     *     
     */
    public void setCommitteeDefinitionReference(CommitteeObjectType value) {
        this.committeeDefinitionReference = value;
    }

    /**
     * Gets the value of the committeeDefinitionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeDefinitionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeDefinitionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeDefinitionDataType }
     * 
     * 
     */
    public List<CommitteeDefinitionDataType> getCommitteeDefinitionData() {
        if (committeeDefinitionData == null) {
            committeeDefinitionData = new ArrayList<CommitteeDefinitionDataType>();
        }
        return this.committeeDefinitionData;
    }

}
