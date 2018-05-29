
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains detailed data for the referenced Development Item
 * 
 * <p>Java class for Development_Item_Version_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Development_Item_Version_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Development_Item">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="140"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Additional_Information" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *         &lt;element name="Category_Reference" type="{urn:com.workday/bsvc}Development_Item_CategoryObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Development_Item_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Development_Item_Completion_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Status_Reference" type="{urn:com.workday/bsvc}Development_Item_StatusObjectType"/>
 *         &lt;element name="Status_Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Updated_by_Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" minOccurs="0"/>
 *         &lt;element name="Relates_To_Reference" type="{urn:com.workday/bsvc}Talent_TagObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Development_Item_Version_DataType", propOrder = {
    "id",
    "developmentItem",
    "additionalInformation",
    "categoryReference",
    "developmentItemStartDate",
    "developmentItemCompletionDate",
    "statusReference",
    "statusNote",
    "updatedByWorkerReference",
    "relatesToReference"
})
public class DevelopmentItemVersionDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Development_Item", required = true)
    protected String developmentItem;
    @XmlElement(name = "Additional_Information")
    protected String additionalInformation;
    @XmlElement(name = "Category_Reference")
    protected List<DevelopmentItemCategoryObjectType> categoryReference;
    @XmlElement(name = "Development_Item_Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar developmentItemStartDate;
    @XmlElement(name = "Development_Item_Completion_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar developmentItemCompletionDate;
    @XmlElement(name = "Status_Reference", required = true)
    protected DevelopmentItemStatusObjectType statusReference;
    @XmlElement(name = "Status_Note")
    protected String statusNote;
    @XmlElement(name = "Updated_by_Worker_Reference")
    protected WorkerObjectType updatedByWorkerReference;
    @XmlElement(name = "Relates_To_Reference")
    protected List<TalentTagObjectType> relatesToReference;

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
     * Gets the value of the developmentItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevelopmentItem() {
        return developmentItem;
    }

    /**
     * Sets the value of the developmentItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevelopmentItem(String value) {
        this.developmentItem = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

    /**
     * Gets the value of the categoryReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevelopmentItemCategoryObjectType }
     * 
     * 
     */
    public List<DevelopmentItemCategoryObjectType> getCategoryReference() {
        if (categoryReference == null) {
            categoryReference = new ArrayList<DevelopmentItemCategoryObjectType>();
        }
        return this.categoryReference;
    }

    /**
     * Gets the value of the developmentItemStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDevelopmentItemStartDate() {
        return developmentItemStartDate;
    }

    /**
     * Sets the value of the developmentItemStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDevelopmentItemStartDate(XMLGregorianCalendar value) {
        this.developmentItemStartDate = value;
    }

    /**
     * Gets the value of the developmentItemCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDevelopmentItemCompletionDate() {
        return developmentItemCompletionDate;
    }

    /**
     * Sets the value of the developmentItemCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDevelopmentItemCompletionDate(XMLGregorianCalendar value) {
        this.developmentItemCompletionDate = value;
    }

    /**
     * Gets the value of the statusReference property.
     * 
     * @return
     *     possible object is
     *     {@link DevelopmentItemStatusObjectType }
     *     
     */
    public DevelopmentItemStatusObjectType getStatusReference() {
        return statusReference;
    }

    /**
     * Sets the value of the statusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevelopmentItemStatusObjectType }
     *     
     */
    public void setStatusReference(DevelopmentItemStatusObjectType value) {
        this.statusReference = value;
    }

    /**
     * Gets the value of the statusNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusNote() {
        return statusNote;
    }

    /**
     * Sets the value of the statusNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusNote(String value) {
        this.statusNote = value;
    }

    /**
     * Gets the value of the updatedByWorkerReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerObjectType }
     *     
     */
    public WorkerObjectType getUpdatedByWorkerReference() {
        return updatedByWorkerReference;
    }

    /**
     * Sets the value of the updatedByWorkerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerObjectType }
     *     
     */
    public void setUpdatedByWorkerReference(WorkerObjectType value) {
        this.updatedByWorkerReference = value;
    }

    /**
     * Gets the value of the relatesToReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatesToReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatesToReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TalentTagObjectType }
     * 
     * 
     */
    public List<TalentTagObjectType> getRelatesToReference() {
        if (relatesToReference == null) {
            relatesToReference = new ArrayList<TalentTagObjectType>();
        }
        return this.relatesToReference;
    }

}
