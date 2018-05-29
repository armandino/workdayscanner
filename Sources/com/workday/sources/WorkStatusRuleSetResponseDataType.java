
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the Response of the Web Service Get Request
 * 
 * <p>Java class for Work_Status_Rule_Set_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work_Status_Rule_Set_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Work_Status_Rule_Set" type="{urn:com.workday/bsvc}Work_Status_Rule_SetType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Work_Status_Rule_Set_Response_DataType", propOrder = {
    "workStatusRuleSet"
})
public class WorkStatusRuleSetResponseDataType {

    @XmlElement(name = "Work_Status_Rule_Set")
    protected List<WorkStatusRuleSetType> workStatusRuleSet;

    /**
     * Gets the value of the workStatusRuleSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workStatusRuleSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkStatusRuleSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkStatusRuleSetType }
     * 
     * 
     */
    public List<WorkStatusRuleSetType> getWorkStatusRuleSet() {
        if (workStatusRuleSet == null) {
            workStatusRuleSet = new ArrayList<WorkStatusRuleSetType>();
        }
        return this.workStatusRuleSet;
    }

}
