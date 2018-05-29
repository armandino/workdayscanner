
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Instructional Location data.
 * 
 * <p>Java class for Location_Instructional_Site_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_Instructional_Site_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Unit_Reference" type="{urn:com.workday/bsvc}Academic_UnitObjectType"/>
 *         &lt;element name="Instructional_Site_Data_Capacity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="6"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Off-Site" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Instructional_Use_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_Instructional_Site_DataType", propOrder = {
    "academicUnitReference",
    "instructionalSiteDataCapacity",
    "offSite",
    "instructionalUseOnly"
})
public class LocationInstructionalSiteDataType {

    @XmlElement(name = "Academic_Unit_Reference", required = true)
    protected AcademicUnitObjectType academicUnitReference;
    @XmlElement(name = "Instructional_Site_Data_Capacity", required = true)
    protected BigDecimal instructionalSiteDataCapacity;
    @XmlElement(name = "Off-Site")
    protected Boolean offSite;
    @XmlElement(name = "Instructional_Use_Only")
    protected Boolean instructionalUseOnly;

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
     * Gets the value of the instructionalSiteDataCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstructionalSiteDataCapacity() {
        return instructionalSiteDataCapacity;
    }

    /**
     * Sets the value of the instructionalSiteDataCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstructionalSiteDataCapacity(BigDecimal value) {
        this.instructionalSiteDataCapacity = value;
    }

    /**
     * Gets the value of the offSite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffSite() {
        return offSite;
    }

    /**
     * Sets the value of the offSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOffSite(Boolean value) {
        this.offSite = value;
    }

    /**
     * Gets the value of the instructionalUseOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstructionalUseOnly() {
        return instructionalUseOnly;
    }

    /**
     * Sets the value of the instructionalUseOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstructionalUseOnly(Boolean value) {
        this.instructionalUseOnly = value;
    }

}
