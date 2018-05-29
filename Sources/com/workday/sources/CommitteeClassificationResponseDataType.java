
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get Committee Classifications Response
 * 
 * <p>Java class for Committee_Classification_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Classification_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Classification" type="{urn:com.workday/bsvc}Committee_ClassificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Classification_Response_DataType", propOrder = {
    "committeeClassification"
})
public class CommitteeClassificationResponseDataType {

    @XmlElement(name = "Committee_Classification")
    protected List<CommitteeClassificationType> committeeClassification;

    /**
     * Gets the value of the committeeClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeClassificationType }
     * 
     * 
     */
    public List<CommitteeClassificationType> getCommitteeClassification() {
        if (committeeClassification == null) {
            committeeClassification = new ArrayList<CommitteeClassificationType>();
        }
        return this.committeeClassification;
    }

}
