
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Change Passports and Visas Business Process Data element. This is the element that contains the data to load.
 * 
 * <p>Java class for Change_Passports_and_Visas_Response_WrapperType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Passports_and_Visas_Response_WrapperType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" minOccurs="0"/>
 *         &lt;element name="Change_Passports_and_Visas_Data" type="{urn:com.workday/bsvc}Change_Passports_and_Visas_Business_Process_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Passports_and_Visas_Response_WrapperType", propOrder = {
    "workerReference",
    "changePassportsAndVisasData"
})
public class ChangePassportsAndVisasResponseWrapperType {

    @XmlElement(name = "Worker_Reference")
    protected WorkerObjectType workerReference;
    @XmlElement(name = "Change_Passports_and_Visas_Data")
    protected List<ChangePassportsAndVisasBusinessProcessDataType> changePassportsAndVisasData;

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
     * Gets the value of the changePassportsAndVisasData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changePassportsAndVisasData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangePassportsAndVisasData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangePassportsAndVisasBusinessProcessDataType }
     * 
     * 
     */
    public List<ChangePassportsAndVisasBusinessProcessDataType> getChangePassportsAndVisasData() {
        if (changePassportsAndVisasData == null) {
            changePassportsAndVisasData = new ArrayList<ChangePassportsAndVisasBusinessProcessDataType>();
        }
        return this.changePassportsAndVisasData;
    }

}
