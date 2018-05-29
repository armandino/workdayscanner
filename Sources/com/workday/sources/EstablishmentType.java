
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Establishments Data wrapper
 * 
 * <p>Java class for EstablishmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstablishmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Establishment_Reference" type="{urn:com.workday/bsvc}EstablishmentObjectType" minOccurs="0"/>
 *         &lt;element name="Establishment_Data" type="{urn:com.workday/bsvc}Establishment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstablishmentType", propOrder = {
    "establishmentReference",
    "establishmentData"
})
public class EstablishmentType {

    @XmlElement(name = "Establishment_Reference")
    protected EstablishmentObjectType establishmentReference;
    @XmlElement(name = "Establishment_Data")
    protected List<EstablishmentDataType> establishmentData;

    /**
     * Gets the value of the establishmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link EstablishmentObjectType }
     *     
     */
    public EstablishmentObjectType getEstablishmentReference() {
        return establishmentReference;
    }

    /**
     * Sets the value of the establishmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstablishmentObjectType }
     *     
     */
    public void setEstablishmentReference(EstablishmentObjectType value) {
        this.establishmentReference = value;
    }

    /**
     * Gets the value of the establishmentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the establishmentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstablishmentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstablishmentDataType }
     * 
     * 
     */
    public List<EstablishmentDataType> getEstablishmentData() {
        if (establishmentData == null) {
            establishmentData = new ArrayList<EstablishmentDataType>();
        }
        return this.establishmentData;
    }

}
