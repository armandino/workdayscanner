
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper Element that Contains Worker References and Worker Photo Data
 * 
 * <p>Java class for Worker_Photos_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Photos_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Photo" type="{urn:com.workday/bsvc}Worker_PhotoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Photos_Response_DataType", propOrder = {
    "workerPhoto"
})
public class WorkerPhotosResponseDataType {

    @XmlElement(name = "Worker_Photo")
    protected List<WorkerPhotoType> workerPhoto;

    /**
     * Gets the value of the workerPhoto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerPhoto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerPhoto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerPhotoType }
     * 
     * 
     */
    public List<WorkerPhotoType> getWorkerPhoto() {
        if (workerPhoto == null) {
            workerPhoto = new ArrayList<WorkerPhotoType>();
        }
        return this.workerPhoto;
    }

}
