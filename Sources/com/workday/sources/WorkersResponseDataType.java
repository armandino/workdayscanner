
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains each Worker based on the Request References or Request Criteria.  The data returned is the current information as of the dates in the response filter, and does not include all historical information about the worker.
 * 
 * <p>Java class for Workers_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Workers_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker" type="{urn:com.workday/bsvc}WorkerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Workers_Response_DataType", propOrder = {
    "worker"
})
public class WorkersResponseDataType {

    @XmlElement(name = "Worker")
    protected List<WorkerType> worker;

    /**
     * Gets the value of the worker property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the worker property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorker().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerType }
     * 
     * 
     */
    public List<WorkerType> getWorker() {
        if (worker == null) {
            worker = new ArrayList<WorkerType>();
        }
        return this.worker;
    }

}
