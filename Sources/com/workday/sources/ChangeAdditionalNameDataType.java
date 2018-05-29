
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for Additional Name Change web service.
 * 
 * <p>Java class for Change_Additional_Name_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Additional_Name_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType"/>
 *         &lt;element name="Replace_All" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name_Data" type="{urn:com.workday/bsvc}Additional_Name_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Additional_Name_DataType", propOrder = {
    "workerReference",
    "replaceAll",
    "nameData"
})
public class ChangeAdditionalNameDataType {

    @XmlElement(name = "Worker_Reference", required = true)
    protected WorkerObjectType workerReference;
    @XmlElement(name = "Replace_All")
    protected Boolean replaceAll;
    @XmlElement(name = "Name_Data")
    protected List<AdditionalNameDataType> nameData;

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
     * Gets the value of the replaceAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplaceAll() {
        return replaceAll;
    }

    /**
     * Sets the value of the replaceAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplaceAll(Boolean value) {
        this.replaceAll = value;
    }

    /**
     * Gets the value of the nameData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalNameDataType }
     * 
     * 
     */
    public List<AdditionalNameDataType> getNameData() {
        if (nameData == null) {
            nameData = new ArrayList<AdditionalNameDataType>();
        }
        return this.nameData;
    }

}
