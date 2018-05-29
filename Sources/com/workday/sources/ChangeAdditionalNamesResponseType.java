
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response for the Change Additional Names web service request. Includes the worker reference and additional name data.
 * 
 * <p>Java class for Change_Additional_Names_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Additional_Names_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person_Additional_Name_Change_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" minOccurs="0"/>
 *         &lt;element name="Additional_Name_Data" type="{urn:com.workday/bsvc}Additional_Name_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Additional_Names_ResponseType", propOrder = {
    "personAdditionalNameChangeReference",
    "workerReference",
    "additionalNameData"
})
public class ChangeAdditionalNamesResponseType {

    @XmlElement(name = "Person_Additional_Name_Change_Reference")
    protected UniqueIdentifierObjectType personAdditionalNameChangeReference;
    @XmlElement(name = "Worker_Reference")
    protected WorkerObjectType workerReference;
    @XmlElement(name = "Additional_Name_Data")
    protected List<AdditionalNameDataType> additionalNameData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the personAdditionalNameChangeReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getPersonAdditionalNameChangeReference() {
        return personAdditionalNameChangeReference;
    }

    /**
     * Sets the value of the personAdditionalNameChangeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setPersonAdditionalNameChangeReference(UniqueIdentifierObjectType value) {
        this.personAdditionalNameChangeReference = value;
    }

    /**
     * Gets the value of the workerReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerObjectType }
     *     
     */
    public WorkerObjectType getWorkerReference() {
        return workerReference;
    }

    /**
     * Sets the value of the workerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerObjectType }
     *     
     */
    public void setWorkerReference(WorkerObjectType value) {
        this.workerReference = value;
    }

    /**
     * Gets the value of the additionalNameData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalNameData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalNameData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalNameDataType }
     * 
     * 
     */
    public List<AdditionalNameDataType> getAdditionalNameData() {
        if (additionalNameData == null) {
            additionalNameData = new ArrayList<AdditionalNameDataType>();
        }
        return this.additionalNameData;
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
