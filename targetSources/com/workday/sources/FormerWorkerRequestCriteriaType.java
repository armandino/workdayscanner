
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
 * Utilize the Request Criteria element to limit the Former Workers returned based on the specific criteria.  Former Workers that are returned must meet all of the criteria specified.
 * 
 * <p>Java class for Former_Worker_Request_CriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Former_Worker_Request_CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Updated_From_Moment" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Update_To_Moment" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Terminated_From_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Terminated_To_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="National_ID_Criteria_Data" type="{urn:com.workday/bsvc}Worker_by_National_ID_Request_CriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Former_Worker_Request_CriteriaType", propOrder = {
    "updatedFromMoment",
    "updateToMoment",
    "terminatedFromDate",
    "terminatedToDate",
    "nationalIDCriteriaData"
})
public class FormerWorkerRequestCriteriaType {

    @XmlElement(name = "Updated_From_Moment")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedFromMoment;
    @XmlElement(name = "Update_To_Moment")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateToMoment;
    @XmlElement(name = "Terminated_From_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminatedFromDate;
    @XmlElement(name = "Terminated_To_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminatedToDate;
    @XmlElement(name = "National_ID_Criteria_Data")
    protected List<WorkerByNationalIDRequestCriteriaType> nationalIDCriteriaData;

    /**
     * Gets the value of the updatedFromMoment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedFromMoment() {
        return updatedFromMoment;
    }

    /**
     * Sets the value of the updatedFromMoment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedFromMoment(XMLGregorianCalendar value) {
        this.updatedFromMoment = value;
    }

    /**
     * Gets the value of the updateToMoment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateToMoment() {
        return updateToMoment;
    }

    /**
     * Sets the value of the updateToMoment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateToMoment(XMLGregorianCalendar value) {
        this.updateToMoment = value;
    }

    /**
     * Gets the value of the terminatedFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminatedFromDate() {
        return terminatedFromDate;
    }

    /**
     * Sets the value of the terminatedFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminatedFromDate(XMLGregorianCalendar value) {
        this.terminatedFromDate = value;
    }

    /**
     * Gets the value of the terminatedToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminatedToDate() {
        return terminatedToDate;
    }

    /**
     * Sets the value of the terminatedToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminatedToDate(XMLGregorianCalendar value) {
        this.terminatedToDate = value;
    }

    /**
     * Gets the value of the nationalIDCriteriaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalIDCriteriaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalIDCriteriaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerByNationalIDRequestCriteriaType }
     * 
     * 
     */
    public List<WorkerByNationalIDRequestCriteriaType> getNationalIDCriteriaData() {
        if (nationalIDCriteriaData == null) {
            nationalIDCriteriaData = new ArrayList<WorkerByNationalIDRequestCriteriaType>();
        }
        return this.nationalIDCriteriaData;
    }

}
