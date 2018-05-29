
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element for the Put Academic Rank Request
 * 
 * <p>Java class for Put_Academic_Rank_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Academic_Rank_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Rank_Reference" type="{urn:com.workday/bsvc}Academic_RankObjectType" minOccurs="0"/>
 *         &lt;element name="Academic_Rank_Data" type="{urn:com.workday/bsvc}Academic_Rank_DataType"/>
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
@XmlType(name = "Put_Academic_Rank_RequestType", propOrder = {
    "academicRankReference",
    "academicRankData"
})
public class PutAcademicRankRequestType {

    @XmlElement(name = "Academic_Rank_Reference")
    protected AcademicRankObjectType academicRankReference;
    @XmlElement(name = "Academic_Rank_Data", required = true)
    protected AcademicRankDataType academicRankData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the academicRankReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicRankObjectType }
     *     
     */
    public AcademicRankObjectType getAcademicRankReference() {
        return academicRankReference;
    }

    /**
     * Sets the value of the academicRankReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicRankObjectType }
     *     
     */
    public void setAcademicRankReference(AcademicRankObjectType value) {
        this.academicRankReference = value;
    }

    /**
     * Gets the value of the academicRankData property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicRankDataType }
     *     
     */
    public AcademicRankDataType getAcademicRankData() {
        return academicRankData;
    }

    /**
     * Sets the value of the academicRankData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicRankDataType }
     *     
     */
    public void setAcademicRankData(AcademicRankDataType value) {
        this.academicRankData = value;
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
