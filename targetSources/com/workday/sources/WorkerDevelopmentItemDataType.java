
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains all Development Items for the referenced Worker
 * 
 * <p>Java class for Worker_Development_Item_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Development_Item_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Development_Item" type="{urn:com.workday/bsvc}Worker_Development_ItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Development_Item_DataType", propOrder = {
    "workerDevelopmentItem"
})
public class WorkerDevelopmentItemDataType {

    @XmlElement(name = "Worker_Development_Item")
    protected List<WorkerDevelopmentItemType> workerDevelopmentItem;

    /**
     * Gets the value of the workerDevelopmentItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerDevelopmentItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerDevelopmentItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerDevelopmentItemType }
     * 
     * 
     */
    public List<WorkerDevelopmentItemType> getWorkerDevelopmentItem() {
        if (workerDevelopmentItem == null) {
            workerDevelopmentItem = new ArrayList<WorkerDevelopmentItemType>();
        }
        return this.workerDevelopmentItem;
    }

}
