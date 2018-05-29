
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Creates all Skills for the referenced Worker
 * 
 * <p>Java class for Worker_Skill_Item_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Skill_Item_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Skill_Item" type="{urn:com.workday/bsvc}SkillType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Skill_Item_DataType", propOrder = {
    "workerSkillItem"
})
public class WorkerSkillItemDataType {

    @XmlElement(name = "Worker_Skill_Item")
    protected List<SkillType> workerSkillItem;

    /**
     * Gets the value of the workerSkillItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerSkillItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerSkillItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SkillType }
     * 
     * 
     */
    public List<SkillType> getWorkerSkillItem() {
        if (workerSkillItem == null) {
            workerSkillItem = new ArrayList<SkillType>();
        }
        return this.workerSkillItem;
    }

}
