
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element for Award and Activity information.
 * 
 * <p>Java class for Award_and_Activity_Achievement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Award_and_Activity_Achievement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Award_and_Activity_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remove_Award_and_Activity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Award_and_Activity_Type_Reference" type="{urn:com.workday/bsvc}Award_and_Activity_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sponsor_Issuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Description" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Related_Position_Reference" type="{urn:com.workday/bsvc}Position_ElementObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Award_and_Activity_Achievement_DataType", propOrder = {
    "awardAndActivityID",
    "removeAwardAndActivity",
    "awardAndActivityTypeReference",
    "title",
    "sponsorIssuer",
    "startDate",
    "endDate",
    "description",
    "url",
    "relatedPositionReference"
})
public class AwardAndActivityAchievementDataType {

    @XmlElement(name = "Award_and_Activity_ID")
    protected String awardAndActivityID;
    @XmlElement(name = "Remove_Award_and_Activity")
    protected Boolean removeAwardAndActivity;
    @XmlElement(name = "Award_and_Activity_Type_Reference")
    protected AwardAndActivityTypeObjectType awardAndActivityTypeReference;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Sponsor_Issuer")
    protected String sponsorIssuer;
    @XmlElement(name = "Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "Related_Position_Reference")
    protected PositionElementObjectType relatedPositionReference;

    /**
     * Gets the value of the awardAndActivityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardAndActivityID() {
        return awardAndActivityID;
    }

    /**
     * Sets the value of the awardAndActivityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardAndActivityID(String value) {
        this.awardAndActivityID = value;
    }

    /**
     * Gets the value of the removeAwardAndActivity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveAwardAndActivity() {
        return removeAwardAndActivity;
    }

    /**
     * Sets the value of the removeAwardAndActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveAwardAndActivity(Boolean value) {
        this.removeAwardAndActivity = value;
    }

    /**
     * Gets the value of the awardAndActivityTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link AwardAndActivityTypeObjectType }
     *     
     */
    public AwardAndActivityTypeObjectType getAwardAndActivityTypeReference() {
        return awardAndActivityTypeReference;
    }

    /**
     * Sets the value of the awardAndActivityTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardAndActivityTypeObjectType }
     *     
     */
    public void setAwardAndActivityTypeReference(AwardAndActivityTypeObjectType value) {
        this.awardAndActivityTypeReference = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the sponsorIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorIssuer() {
        return sponsorIssuer;
    }

    /**
     * Sets the value of the sponsorIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorIssuer(String value) {
        this.sponsorIssuer = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the relatedPositionReference property.
     * 
     * @return
     *     possible object is
     *     {@link PositionElementObjectType }
     *     
     */
    public PositionElementObjectType getRelatedPositionReference() {
        return relatedPositionReference;
    }

    /**
     * Sets the value of the relatedPositionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionElementObjectType }
     *     
     */
    public void setRelatedPositionReference(PositionElementObjectType value) {
        this.relatedPositionReference = value;
    }

}
