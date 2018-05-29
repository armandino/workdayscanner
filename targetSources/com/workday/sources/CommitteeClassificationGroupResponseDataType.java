
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Documentation Response element containing an instance of a Committee Classification Group and its associated data.
 * 
 * <p>Java class for Committee_Classification_Group_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Classification_Group_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Classification_Group" type="{urn:com.workday/bsvc}Committee_Classification_GroupType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Classification_Group_Response_DataType", propOrder = {
    "committeeClassificationGroup"
})
public class CommitteeClassificationGroupResponseDataType {

    @XmlElement(name = "Committee_Classification_Group")
    protected List<CommitteeClassificationGroupType> committeeClassificationGroup;

    /**
     * Gets the value of the committeeClassificationGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeClassificationGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeClassificationGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeClassificationGroupType }
     * 
     * 
     */
    public List<CommitteeClassificationGroupType> getCommitteeClassificationGroup() {
        if (committeeClassificationGroup == null) {
            committeeClassificationGroup = new ArrayList<CommitteeClassificationGroupType>();
        }
        return this.committeeClassificationGroup;
    }

}
