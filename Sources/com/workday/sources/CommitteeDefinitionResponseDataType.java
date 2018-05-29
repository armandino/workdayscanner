
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Committee Definition Response
 * 
 * <p>Java class for Committee_Definition_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Definition_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Definition" type="{urn:com.workday/bsvc}Committee_DefinitionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Definition_Response_DataType", propOrder = {
    "committeeDefinition"
})
public class CommitteeDefinitionResponseDataType {

    @XmlElement(name = "Committee_Definition")
    protected List<CommitteeDefinitionType> committeeDefinition;

    /**
     * Gets the value of the committeeDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeDefinitionType }
     * 
     * 
     */
    public List<CommitteeDefinitionType> getCommitteeDefinition() {
        if (committeeDefinition == null) {
            committeeDefinition = new ArrayList<CommitteeDefinitionType>();
        }
        return this.committeeDefinition;
    }

}
