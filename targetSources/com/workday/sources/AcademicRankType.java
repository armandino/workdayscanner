
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Academic Rank Element
 * 
 * <p>Java class for Academic_RankType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_RankType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Rank_Reference" type="{urn:com.workday/bsvc}Academic_RankObjectType" minOccurs="0"/>
 *         &lt;element name="Academic_Rank_Data" type="{urn:com.workday/bsvc}Academic_Rank_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_RankType", propOrder = {
    "academicRankReference",
    "academicRankData"
})
public class AcademicRankType {

    @XmlElement(name = "Academic_Rank_Reference")
    protected AcademicRankObjectType academicRankReference;
    @XmlElement(name = "Academic_Rank_Data")
    protected AcademicRankDataType academicRankData;

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

}
