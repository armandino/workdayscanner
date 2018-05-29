
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing Put Workers' Compensation Code Response Data
 * 
 * <p>Java class for Put_Workers_Compensation_Code_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Workers_Compensation_Code_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Workers_Compensation_Code_Reference" type="{urn:com.workday/bsvc}Workers_Compensation_CodeObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Workers_Compensation_Code_ResponseType", propOrder = {
    "workersCompensationCodeReference"
})
public class PutWorkersCompensationCodeResponseType {

    @XmlElement(name = "Workers_Compensation_Code_Reference")
    protected WorkersCompensationCodeObjectType workersCompensationCodeReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the workersCompensationCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkersCompensationCodeObjectType }
     *     
     */
    public WorkersCompensationCodeObjectType getWorkersCompensationCodeReference() {
        return workersCompensationCodeReference;
    }

    /**
     * Sets the value of the workersCompensationCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkersCompensationCodeObjectType }
     *     
     */
    public void setWorkersCompensationCodeReference(WorkersCompensationCodeObjectType value) {
        this.workersCompensationCodeReference = value;
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
