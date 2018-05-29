
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element for selecting the Academic Unit to be updated
 * 
 * <p>Java class for Put_Academic_Unit_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Academic_Unit_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Unit_Reference" type="{urn:com.workday/bsvc}Academic_UnitObjectType" minOccurs="0"/>
 *         &lt;element name="Academic_Unit_Data" type="{urn:com.workday/bsvc}Academic_Unit_DataType"/>
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
@XmlType(name = "Put_Academic_Unit_RequestType", propOrder = {
    "academicUnitReference",
    "academicUnitData"
})
public class PutAcademicUnitRequestType {

    @XmlElement(name = "Academic_Unit_Reference")
    protected AcademicUnitObjectType academicUnitReference;
    @XmlElement(name = "Academic_Unit_Data", required = true)
    protected AcademicUnitDataType academicUnitData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the academicUnitReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicUnitObjectType }
     *     
     */
    public AcademicUnitObjectType getAcademicUnitReference() {
        return academicUnitReference;
    }

    /**
     * Sets the value of the academicUnitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicUnitObjectType }
     *     
     */
    public void setAcademicUnitReference(AcademicUnitObjectType value) {
        this.academicUnitReference = value;
    }

    /**
     * Gets the value of the academicUnitData property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicUnitDataType }
     *     
     */
    public AcademicUnitDataType getAcademicUnitData() {
        return academicUnitData;
    }

    /**
     * Sets the value of the academicUnitData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicUnitDataType }
     *     
     */
    public void setAcademicUnitData(AcademicUnitDataType value) {
        this.academicUnitData = value;
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
