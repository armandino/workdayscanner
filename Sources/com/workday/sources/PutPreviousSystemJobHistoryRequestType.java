
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the Data for adding, updating or deleting a previous system job history entry for a worker.
 * 
 * <p>Java class for Put_Previous_System_Job_History_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Previous_System_Job_History_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Previous_System_Job_History_Data" type="{urn:com.workday/bsvc}Previous_System_Job_HistoryType"/>
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
@XmlType(name = "Put_Previous_System_Job_History_RequestType", propOrder = {
    "previousSystemJobHistoryData"
})
public class PutPreviousSystemJobHistoryRequestType {

    @XmlElement(name = "Previous_System_Job_History_Data", required = true)
    protected PreviousSystemJobHistoryType previousSystemJobHistoryData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the previousSystemJobHistoryData property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousSystemJobHistoryType }
     *     
     */
    public PreviousSystemJobHistoryType getPreviousSystemJobHistoryData() {
        return previousSystemJobHistoryData;
    }

    /**
     * Sets the value of the previousSystemJobHistoryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousSystemJobHistoryType }
     *     
     */
    public void setPreviousSystemJobHistoryData(PreviousSystemJobHistoryType value) {
        this.previousSystemJobHistoryData = value;
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
