
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the coverage level detailed information and volume for the insurance election.
 * 
 * <p>Java class for Insurance_Coverage_Level_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Insurance_Coverage_Level_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Coverage_Level_Value_Data" type="{urn:com.workday/bsvc}Coverage_Level_Value_DataType"/>
 *         &lt;element name="Volume_Data" type="{urn:com.workday/bsvc}Volume_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Insurance_Coverage_Level_DataType", propOrder = {
    "coverageLevelValueData",
    "volumeData"
})
public class InsuranceCoverageLevelDataType {

    @XmlElement(name = "Coverage_Level_Value_Data", required = true)
    protected CoverageLevelValueDataType coverageLevelValueData;
    @XmlElement(name = "Volume_Data", required = true)
    protected VolumeDataType volumeData;

    /**
     * Gets the value of the coverageLevelValueData property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageLevelValueDataType }
     *     
     */
    public CoverageLevelValueDataType getCoverageLevelValueData() {
        return coverageLevelValueData;
    }

    /**
     * Sets the value of the coverageLevelValueData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageLevelValueDataType }
     *     
     */
    public void setCoverageLevelValueData(CoverageLevelValueDataType value) {
        this.coverageLevelValueData = value;
    }

    /**
     * Gets the value of the volumeData property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeDataType }
     *     
     */
    public VolumeDataType getVolumeData() {
        return volumeData;
    }

    /**
     * Sets the value of the volumeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeDataType }
     *     
     */
    public void setVolumeData(VolumeDataType value) {
        this.volumeData = value;
    }

}
