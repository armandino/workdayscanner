
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the instructions for adding or updating a former worker.
 * 
 * <p>Java class for Put_Former_Worker_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Former_Worker_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Former_Worker_Reference" type="{urn:com.workday/bsvc}Former_WorkerObjectType" minOccurs="0"/>
 *         &lt;element name="Former_Worker_Data" type="{urn:com.workday/bsvc}Former_Worker_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Former_Worker_RequestType", propOrder = {
    "formerWorkerReference",
    "formerWorkerData"
})
public class PutFormerWorkerRequestType {

    @XmlElement(name = "Former_Worker_Reference")
    protected FormerWorkerObjectType formerWorkerReference;
    @XmlElement(name = "Former_Worker_Data", required = true)
    protected FormerWorkerDataType formerWorkerData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
