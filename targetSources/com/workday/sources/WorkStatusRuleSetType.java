
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the Data and Reference to the Work Status Rule Sets
 * 
 * <p>Java class for Work_Status_Rule_SetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work_Status_Rule_SetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Work_Status_Rule_Set_Reference" type="{urn:com.workday/bsvc}Work_Status_Rule_SetObjectType" minOccurs="0"/>
 *         &lt;element name="Work_Status_Rule_Set_Data" type="{urn:com.workday/bsvc}Work_Status_Rule_Set_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Work_Status_Rule_SetType", propOrder = {
    "workStatusRuleSetReference",
    "workStatusRuleSetData"
})
public class WorkStatusRuleSetType {

    @XmlElement(name = "Work_Status_Rule_Set_Reference")
    protected WorkStatusRuleSetObjectType workStatusRuleSetReference;
    @XmlElement(name = "Work_Status_Rule_Set_Data")
    protected List<WorkStatusRuleSetDataType> workStatusRuleSetData;

    /**
     * Gets the value of the workStatusRuleSetReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkStatusRuleSetObjectType }
     *     
     */
    public WorkStatusRuleSetObjectType getWorkStatusRuleSetReference() {
        return workStatusRuleSetReference;
    }

    /**
     * Sets the value of the workStatusRuleSetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkStatusRuleSetObjectType }
     *     
     */
    public void setWorkStatusRuleSetReference(WorkStatusRuleSetObjectType value) {
        this.workStatusRuleSetReference = value;
    }

    /**
     * Gets the value of the workStatusRuleSetData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workStatusRuleSetData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkStatusRuleSetData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkStatusRuleSetDataType }
     * 
     * 
     */
    public List<WorkStatusRuleSetDataType> getWorkStatusRuleSetData() {
        if (workStatusRuleSetData == null) {
            workStatusRuleSetData = new ArrayList<WorkStatusRuleSetDataType>();
        }
        return this.workStatusRuleSetData;
    }

}
