
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element containing an instance of a Former Worker and its associated data.
 * 
 * <p>Java class for Former_Worker_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Former_Worker_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Former_Worker" type="{urn:com.workday/bsvc}Former_WorkerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Former_Worker_Response_DataType", propOrder = {
    "formerWorker"
})
public class FormerWorkerResponseDataType {

    @XmlElement(name = "Former_Worker")
    protected List<FormerWorkerType> formerWorker;

    /**
     * Gets the value of the formerWorker property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerWorker property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerWorker().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormerWorkerType }
     * 
     * 
     */
    public List<FormerWorkerType> getFormerWorker() {
        if (formerWorker == null) {
            formerWorker = new ArrayList<FormerWorkerType>();
        }
        return this.formerWorker;
    }

}
