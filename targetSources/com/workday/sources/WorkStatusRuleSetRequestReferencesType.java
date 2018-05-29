
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * References Provided to be returned by Get Work Status Rule Set
 * 
 * <p>Java class for Work_Status_Rule_Set_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work_Status_Rule_Set_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Work_Status_Rule_Set_Reference" type="{urn:com.workday/bsvc}Work_Status_Rule_SetObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Work_Status_Rule_Set_Request_ReferencesType", propOrder = {
    "workStatusRuleSetReference"
})
public class WorkStatusRuleSetRequestReferencesType {

    @XmlElement(name = "Work_Status_Rule_Set_Reference", required = true)
    protected List<WorkStatusRuleSetObjectType> workStatusRuleSetReference;

    /**
     * Gets the value of the workStatusRuleSetReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workStatusRuleSetReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkStatusRuleSetReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkStatusRuleSetObjectType }
     * 
     * 
     */
    public List<WorkStatusRuleSetObjectType> getWorkStatusRuleSetReference() {
        if (workStatusRuleSetReference == null) {
            workStatusRuleSetReference = new ArrayList<WorkStatusRuleSetObjectType>();
        }
        return this.workStatusRuleSetReference;
    }

}
