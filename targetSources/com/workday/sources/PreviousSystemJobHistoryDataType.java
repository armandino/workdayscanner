
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for defining whether a previous system job history entry is being added, updated or deleted.
 * 
 * <p>Java class for Previous_System_Job_History_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Previous_System_Job_History_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Previous_System_Job_History_Reference" type="{urn:com.workday/bsvc}Job_Previous_System_HistoryObjectType" minOccurs="0"/>
 *         &lt;element name="Previous_System_Job_History_Detail_Data" type="{urn:com.workday/bsvc}Previous_System_Job_History_Detail_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Previous_System_Job_History_DataType", propOrder = {
    "previousSystemJobHistoryReference",
    "previousSystemJobHistoryDetailData"
})
public class PreviousSystemJobHistoryDataType {

    @XmlElement(name = "Previous_System_Job_History_Reference")
    protected JobPreviousSystemHistoryObjectType previousSystemJobHistoryReference;
    @XmlElement(name = "Previous_System_Job_History_Detail_Data")
    protected PreviousSystemJobHistoryDetailDataType previousSystemJobHistoryDetailData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the previousSystemJobHistoryReference property.
     * 
     * @return
     *     possible object is
     *     {@link JobPreviousSystemHistoryObjectType }
     *     
     */
    public JobPreviousSystemHistoryObjectType getPreviousSystemJobHistoryReference() {
        return previousSystemJobHistoryReference;
    }

    /**
     * Sets the value of the previousSystemJobHistoryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobPreviousSystemHistoryObjectType }
     *     
     */
    public void setPreviousSystemJobHistoryReference(JobPreviousSystemHistoryObjectType value) {
        this.previousSystemJobHistoryReference = value;
    }

    /**
     * Gets the value of the previousSystemJobHistoryDetailData property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousSystemJobHistoryDetailDataType }
     *     
     */
    public PreviousSystemJobHistoryDetailDataType getPreviousSystemJobHistoryDetailData() {
        return previousSystemJobHistoryDetailData;
    }

    /**
     * Sets the value of the previousSystemJobHistoryDetailData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousSystemJobHistoryDetailDataType }
     *     
     */
    public void setPreviousSystemJobHistoryDetailData(PreviousSystemJobHistoryDetailDataType value) {
        this.previousSystemJobHistoryDetailData = value;
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
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

}
