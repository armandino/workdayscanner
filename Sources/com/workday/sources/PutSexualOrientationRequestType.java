
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The request to edit sexual orientation data for a worker.
 * 
 * <p>Java class for Put_Sexual_Orientation_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Sexual_Orientation_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sexual_Orientation_Reference" type="{urn:com.workday/bsvc}Sexual_OrientationObjectType" minOccurs="0"/>
 *         &lt;element name="Sexual_Orientation_Data" type="{urn:com.workday/bsvc}Sexual_Orientation_DataType"/>
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
@XmlType(name = "Put_Sexual_Orientation_RequestType", propOrder = {
    "sexualOrientationReference",
    "sexualOrientationData"
})
public class PutSexualOrientationRequestType {

    @XmlElement(name = "Sexual_Orientation_Reference")
    protected SexualOrientationObjectType sexualOrientationReference;
    @XmlElement(name = "Sexual_Orientation_Data", required = true)
    protected SexualOrientationDataType sexualOrientationData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the sexualOrientationReference property.
     * 
     * @return
     *     possible object is
     *     {@link SexualOrientationObjectType }
     *     
     */
    public SexualOrientationObjectType getSexualOrientationReference() {
        return sexualOrientationReference;
    }

    /**
     * Sets the value of the sexualOrientationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SexualOrientationObjectType }
     *     
     */
    public void setSexualOrientationReference(SexualOrientationObjectType value) {
        this.sexualOrientationReference = value;
    }

    /**
     * Gets the value of the sexualOrientationData property.
     * 
     * @return
     *     possible object is
     *     {@link SexualOrientationDataType }
     *     
     */
    public SexualOrientationDataType getSexualOrientationData() {
        return sexualOrientationData;
    }

    /**
     * Sets the value of the sexualOrientationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SexualOrientationDataType }
     *     
     */
    public void setSexualOrientationData(SexualOrientationDataType value) {
        this.sexualOrientationData = value;
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
