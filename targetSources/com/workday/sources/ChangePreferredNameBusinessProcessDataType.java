
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Preferred Name Change business process web service.
 * 
 * <p>Java class for Change_Preferred_Name_Business_Process_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Preferred_Name_Business_Process_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType"/>
 *         &lt;element name="Use_Legal_Name_As_Preferred_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name_Data" type="{urn:com.workday/bsvc}Person_Name_Detail_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Preferred_Name_Business_Process_DataType", propOrder = {
    "workerReference",
    "useLegalNameAsPreferredName",
    "nameData"
})
public class ChangePreferredNameBusinessProcessDataType {

    @XmlElement(name = "Worker_Reference", required = true)
    protected WorkerObjectType workerReference;
    @XmlElement(name = "Use_Legal_Name_As_Preferred_Name")
    protected Boolean useLegalNameAsPreferredName;
    @XmlElement(name = "Name_Data")
    protected PersonNameDetailDataType nameData;

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
     * Gets the value of the useLegalNameAsPreferredName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLegalNameAsPreferredName() {
        return useLegalNameAsPreferredName;
    }

    /**
     * Sets the value of the useLegalNameAsPreferredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLegalNameAsPreferredName(Boolean value) {
        this.useLegalNameAsPreferredName = value;
    }

    /**
     * Gets the value of the nameData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameDetailDataType }
     *     
     */
    public PersonNameDetailDataType getNameData() {
        return nameData;
    }

    /**
     * Sets the value of the nameData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameDetailDataType }
     *     
     */
    public void setNameData(PersonNameDetailDataType value) {
        this.nameData = value;
    }

}
