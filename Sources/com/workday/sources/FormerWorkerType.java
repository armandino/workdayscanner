
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the data for adding or updating a Former Worker.
 * 
 * <p>Java class for Former_WorkerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Former_WorkerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Former_Worker_Reference" type="{urn:com.workday/bsvc}Former_WorkerObjectType" minOccurs="0"/>
 *         &lt;element name="Former_Worker_Data" type="{urn:com.workday/bsvc}Former_Worker_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Former_WorkerType", propOrder = {
    "formerWorkerReference",
    "formerWorkerData"
})
public class FormerWorkerType {

    @XmlElement(name = "Former_Worker_Reference")
    protected FormerWorkerObjectType formerWorkerReference;
    @XmlElement(name = "Former_Worker_Data")
    protected FormerWorkerDataType formerWorkerData;

    /**
     * Gets the value of the formerWorkerReference property.
     * 
     * @return
     *     possible object is
     *     {@link FormerWorkerObjectType }
     *     
     */
    public FormerWorkerObjectType getFormerWorkerReference() {
        return formerWorkerReference;
    }

    /**
     * Sets the value of the formerWorkerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormerWorkerObjectType }
     *     
     */
    public void setFormerWorkerReference(FormerWorkerObjectType value) {
        this.formerWorkerReference = value;
    }

    /**
     * Gets the value of the formerWorkerData property.
     * 
     * @return
     *     possible object is
     *     {@link FormerWorkerDataType }
     *     
     */
    public FormerWorkerDataType getFormerWorkerData() {
        return formerWorkerData;
    }

    /**
     * Sets the value of the formerWorkerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormerWorkerDataType }
     *     
     */
    public void setFormerWorkerData(FormerWorkerDataType value) {
        this.formerWorkerData = value;
    }

}
