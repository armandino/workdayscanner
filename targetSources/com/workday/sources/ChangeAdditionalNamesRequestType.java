
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This web service allows updates to the additional names of a worker.
 * 
 * <p>Java class for Change_Additional_Names_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Additional_Names_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Change_Additional_Names_Data" type="{urn:com.workday/bsvc}Change_Additional_Name_DataType"/>
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
@XmlType(name = "Change_Additional_Names_RequestType", propOrder = {
    "changeAdditionalNamesData"
})
public class ChangeAdditionalNamesRequestType {

    @XmlElement(name = "Change_Additional_Names_Data", required = true)
    protected ChangeAdditionalNameDataType changeAdditionalNamesData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the changeAdditionalNamesData property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeAdditionalNameDataType }
     *     
     */
    public ChangeAdditionalNameDataType getChangeAdditionalNamesData() {
        return changeAdditionalNamesData;
    }

    /**
     * Sets the value of the changeAdditionalNamesData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeAdditionalNameDataType }
     *     
     */
    public void setChangeAdditionalNamesData(ChangeAdditionalNameDataType value) {
        this.changeAdditionalNamesData = value;
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
