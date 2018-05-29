
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for documents associated with a worker.
 * 
 * <p>Java class for Worker_Document_Data_WWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Document_Data_WWSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Document" type="{urn:com.workday/bsvc}Worker_Document_WWSType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Document_Data_WWSType", propOrder = {
    "workerDocument"
})
public class WorkerDocumentDataWWSType {

    @XmlElement(name = "Worker_Document")
    protected List<WorkerDocumentWWSType> workerDocument;

    /**
     * Gets the value of the workerDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerDocumentWWSType }
     * 
     * 
     */
    public List<WorkerDocumentWWSType> getWorkerDocument() {
        if (workerDocument == null) {
            workerDocument = new ArrayList<WorkerDocumentWWSType>();
        }
        return this.workerDocument;
    }

}
