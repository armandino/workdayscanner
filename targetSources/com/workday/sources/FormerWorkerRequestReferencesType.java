
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the Request References element to retrieve a specific instance(s) of  a Former Worker and its associated data.
 * 
 * <p>Java class for Former_Worker_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Former_Worker_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Former_Worker_Reference" type="{urn:com.workday/bsvc}Former_WorkerObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Former_Worker_Request_ReferencesType", propOrder = {
    "formerWorkerReference"
})
public class FormerWorkerRequestReferencesType {

    @XmlElement(name = "Former_Worker_Reference", required = true)
    protected List<FormerWorkerObjectType> formerWorkerReference;

    /**
     * Gets the value of the formerWorkerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerWorkerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerWorkerReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormerWorkerObjectType }
     * 
     * 
     */
    public List<FormerWorkerObjectType> getFormerWorkerReference() {
        if (formerWorkerReference == null) {
            formerWorkerReference = new ArrayList<FormerWorkerObjectType>();
        }
        return this.formerWorkerReference;
    }

}
