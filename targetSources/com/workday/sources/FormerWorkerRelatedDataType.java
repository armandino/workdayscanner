
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Returns data that is related to a former worker. Any data entered in this element in the Put Request will be ignored.
 * 
 * <p>Java class for Former_Worker_Related_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Former_Worker_Related_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rehired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Applicant_Reference" type="{urn:com.workday/bsvc}ApplicantObjectType" minOccurs="0"/>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Former_Worker_Related_DataType", propOrder = {
    "rehired",
    "applicantReference",
    "workerReference"
})
public class FormerWorkerRelatedDataType {

    @XmlElement(name = "Rehired")
    protected Boolean rehired;
    @XmlElement(name = "Applicant_Reference")
    protected ApplicantObjectType applicantReference;
    @XmlElement(name = "Worker_Reference")
    protected List<WorkerObjectType> workerReference;

    /**
     * Gets the value of the rehired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRehired() {
        return rehired;
    }

    /**
     * Sets the value of the rehired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRehired(Boolean value) {
        this.rehired = value;
    }

    /**
     * Gets the value of the applicantReference property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicantObjectType }
     *     
     */
    public ApplicantObjectType getApplicantReference() {
        return applicantReference;
    }

    /**
     * Sets the value of the applicantReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantObjectType }
     *     
     */
    public void setApplicantReference(ApplicantObjectType value) {
        this.applicantReference = value;
    }

    /**
     * Gets the value of the workerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerObjectType }
     * 
     * 
     */
    public List<WorkerObjectType> getWorkerReference() {
        if (workerReference == null) {
            workerReference = new ArrayList<WorkerObjectType>();
        }
        return this.workerReference;
    }

}
