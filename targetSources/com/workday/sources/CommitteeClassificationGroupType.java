
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the data for a Committee Classification Group.
 * 
 * <p>Java class for Committee_Classification_GroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Classification_GroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Classification_Group_Reference" type="{urn:com.workday/bsvc}Committee_Classification_GroupObjectType" minOccurs="0"/>
 *         &lt;element name="Committee_Classification_Group_Data" type="{urn:com.workday/bsvc}Committee_Classification_Group_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Classification_GroupType", propOrder = {
    "committeeClassificationGroupReference",
    "committeeClassificationGroupData"
})
public class CommitteeClassificationGroupType {

    @XmlElement(name = "Committee_Classification_Group_Reference")
    protected CommitteeClassificationGroupObjectType committeeClassificationGroupReference;
    @XmlElement(name = "Committee_Classification_Group_Data")
    protected List<CommitteeClassificationGroupDataType> committeeClassificationGroupData;

    /**
     * Gets the value of the committeeClassificationGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeClassificationGroupObjectType }
     *     
     */
    public CommitteeClassificationGroupObjectType getCommitteeClassificationGroupReference() {
        return committeeClassificationGroupReference;
    }

    /**
     * Sets the value of the committeeClassificationGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeClassificationGroupObjectType }
     *     
     */
    public void setCommitteeClassificationGroupReference(CommitteeClassificationGroupObjectType value) {
        this.committeeClassificationGroupReference = value;
    }

    /**
     * Gets the value of the committeeClassificationGroupData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeClassificationGroupData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeClassificationGroupData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeClassificationGroupDataType }
     * 
     * 
     */
    public List<CommitteeClassificationGroupDataType> getCommitteeClassificationGroupData() {
        if (committeeClassificationGroupData == null) {
            committeeClassificationGroupData = new ArrayList<CommitteeClassificationGroupDataType>();
        }
        return this.committeeClassificationGroupData;
    }

}
