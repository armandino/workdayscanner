
package com.workday.sources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for all the detail information about the Academic Rank
 * 
 * <p>Java class for Academic_Rank_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Rank_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Academic_Rank_Title_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emeritus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Rank_Order" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Job_Profile_Reference" type="{urn:com.workday/bsvc}Job_ProfileObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Metadata_Academic_Rank_Reference" type="{urn:com.workday/bsvc}Academic_Rank_MappingObjectType" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_Rank_DataType", propOrder = {
    "id",
    "academicRankTitleName",
    "description",
    "emeritus",
    "rankOrder",
    "jobProfileReference",
    "metadataAcademicRankReference",
    "inactive"
})
public class AcademicRankDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Academic_Rank_Title_Name", required = true)
    protected String academicRankTitleName;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Emeritus")
    protected Boolean emeritus;
    @XmlElement(name = "Rank_Order")
    protected BigDecimal rankOrder;
    @XmlElement(name = "Job_Profile_Reference")
    protected List<JobProfileObjectType> jobProfileReference;
    @XmlElement(name = "Metadata_Academic_Rank_Reference")
    protected AcademicRankMappingObjectType metadataAcademicRankReference;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the academicRankTitleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicRankTitleName() {
        return academicRankTitleName;
    }

    /**
     * Sets the value of the academicRankTitleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicRankTitleName(String value) {
        this.academicRankTitleName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the emeritus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmeritus() {
        return emeritus;
    }

    /**
     * Sets the value of the emeritus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmeritus(Boolean value) {
        this.emeritus = value;
    }

    /**
     * Gets the value of the rankOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRankOrder() {
        return rankOrder;
    }

    /**
     * Sets the value of the rankOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRankOrder(BigDecimal value) {
        this.rankOrder = value;
    }

    /**
     * Gets the value of the jobProfileReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobProfileReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobProfileReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobProfileObjectType }
     * 
     * 
     */
    public List<JobProfileObjectType> getJobProfileReference() {
        if (jobProfileReference == null) {
            jobProfileReference = new ArrayList<JobProfileObjectType>();
        }
        return this.jobProfileReference;
    }

    /**
     * Gets the value of the metadataAcademicRankReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicRankMappingObjectType }
     *     
     */
    public AcademicRankMappingObjectType getMetadataAcademicRankReference() {
        return metadataAcademicRankReference;
    }

    /**
     * Sets the value of the metadataAcademicRankReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicRankMappingObjectType }
     *     
     */
    public void setMetadataAcademicRankReference(AcademicRankMappingObjectType value) {
        this.metadataAcademicRankReference = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

}
