
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The sexual orientation for a worker.
 * 
 * <p>Java class for Sexual_OrientationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sexual_OrientationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sexual_Orientation_Reference" type="{urn:com.workday/bsvc}Sexual_OrientationObjectType" minOccurs="0"/>
 *         &lt;element name="Sexual_Orientation_Data" type="{urn:com.workday/bsvc}Sexual_Orientation_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sexual_OrientationType", propOrder = {
    "sexualOrientationReference",
    "sexualOrientationData"
})
public class SexualOrientationType {

    @XmlElement(name = "Sexual_Orientation_Reference")
    protected SexualOrientationObjectType sexualOrientationReference;
    @XmlElement(name = "Sexual_Orientation_Data")
    protected List<SexualOrientationDataType> sexualOrientationData;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sexualOrientationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSexualOrientationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SexualOrientationDataType }
     * 
     * 
     */
    public List<SexualOrientationDataType> getSexualOrientationData() {
        if (sexualOrientationData == null) {
            sexualOrientationData = new ArrayList<SexualOrientationDataType>();
        }
        return this.sexualOrientationData;
    }

}
