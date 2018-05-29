
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper for Government Identification Data. Includes National Identifiers and Government Identifiers.
 * 
 * <p>Java class for Government_Identification_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Government_Identification_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="National_ID" type="{urn:com.workday/bsvc}National_IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Government_ID" type="{urn:com.workday/bsvc}Government_IDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Replace_All" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Government_Identification_DataType", propOrder = {
    "nationalID",
    "governmentID"
})
public class GovernmentIdentificationDataType {

    @XmlElement(name = "National_ID")
    protected List<NationalIDType> nationalID;
    @XmlElement(name = "Government_ID")
    protected List<GovernmentIDType> governmentID;
    @XmlAttribute(name = "Replace_All", namespace = "urn:com.workday/bsvc")
    protected Boolean replaceAll;

    /**
     * Gets the value of the nationalID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NationalIDType }
     * 
     * 
     */
    public List<NationalIDType> getNationalID() {
        if (nationalID == null) {
            nationalID = new ArrayList<NationalIDType>();
        }
        return this.nationalID;
    }

    /**
     * Gets the value of the governmentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the governmentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovernmentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GovernmentIDType }
     * 
     * 
     */
    public List<GovernmentIDType> getGovernmentID() {
        if (governmentID == null) {
            governmentID = new ArrayList<GovernmentIDType>();
        }
        return this.governmentID;
    }

    /**
     * Gets the value of the replaceAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplaceAll() {
        return replaceAll;
    }

    /**
     * Sets the value of the replaceAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplaceAll(Boolean value) {
        this.replaceAll = value;
    }

}
