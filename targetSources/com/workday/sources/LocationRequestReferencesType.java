
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing reference to a specific Location.
 * 
 * <p>Java class for Location_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location_Reference" type="{urn:com.workday/bsvc}LocationObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Skip_Non_Existing_Instances" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_Request_ReferencesType", propOrder = {
    "locationReference"
})
public class LocationRequestReferencesType {

    @XmlElement(name = "Location_Reference")
    protected List<LocationObjectType> locationReference;
    @XmlAttribute(name = "Skip_Non_Existing_Instances", namespace = "urn:com.workday/bsvc")
    protected Boolean skipNonExistingInstances;

    /**
     * Gets the value of the locationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationObjectType }
     * 
     * 
     */
    public List<LocationObjectType> getLocationReference() {
        if (locationReference == null) {
            locationReference = new ArrayList<LocationObjectType>();
        }
        return this.locationReference;
    }

    /**
     * Gets the value of the skipNonExistingInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipNonExistingInstances() {
        return skipNonExistingInstances;
    }

    /**
     * Sets the value of the skipNonExistingInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipNonExistingInstances(Boolean value) {
        this.skipNonExistingInstances = value;
    }

}
