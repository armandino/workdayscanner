
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the reference to the Goal Detail and all the Goal Data payload.
 * 
 * <p>Java class for Worker_GoalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_GoalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Goal_Reference" type="{urn:com.workday/bsvc}GoalObjectType" minOccurs="0"/>
 *         &lt;element name="Goal_Data" type="{urn:com.workday/bsvc}Goal_Detail_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_GoalType", propOrder = {
    "goalReference",
    "goalData"
})
public class WorkerGoalType {

    @XmlElement(name = "Goal_Reference")
    protected GoalObjectType goalReference;
    @XmlElement(name = "Goal_Data")
    protected List<GoalDetailDataType> goalData;

    /**
     * Gets the value of the goalReference property.
     * 
     * @return
     *     possible object is
     *     {@link GoalObjectType }
     *     
     */
    public GoalObjectType getGoalReference() {
        return goalReference;
    }

    /**
     * Sets the value of the goalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalObjectType }
     *     
     */
    public void setGoalReference(GoalObjectType value) {
        this.goalReference = value;
    }

    /**
     * Gets the value of the goalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoalDetailDataType }
     * 
     * 
     */
    public List<GoalDetailDataType> getGoalData() {
        if (goalData == null) {
            goalData = new ArrayList<GoalDetailDataType>();
        }
        return this.goalData;
    }

}
