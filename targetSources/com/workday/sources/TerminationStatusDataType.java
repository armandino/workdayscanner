
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing all Termination Status data for a Worker.
 * 
 * <p>Java class for Termination_Status_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Termination_Status_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Terminated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Termination_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Termination_Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Termination_Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Involuntary_Termination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Not_Eligible_For_Hire" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Termination_Status_DataType", propOrder = {
    "terminated",
    "terminationDate",
    "terminationCategory",
    "terminationReason",
    "involuntaryTermination",
    "notEligibleForHire"
})
public class TerminationStatusDataType {

    @XmlElement(name = "Terminated")
    protected Boolean terminated;
    @XmlElement(name = "Termination_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminationDate;
    @XmlElement(name = "Termination_Category")
    protected String terminationCategory;
    @XmlElement(name = "Termination_Reason")
    protected String terminationReason;
    @XmlElement(name = "Involuntary_Termination")
    protected Boolean involuntaryTermination;
    @XmlElement(name = "Not_Eligible_For_Hire")
    protected Boolean notEligibleForHire;

    /**
     * Gets the value of the terminated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerminated() {
        return terminated;
    }

    /**
     * Sets the value of the terminated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerminated(Boolean value) {
        this.terminated = value;
    }

    /**
     * Gets the value of the terminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminationDate(XMLGregorianCalendar value) {
        this.terminationDate = value;
    }

    /**
     * Gets the value of the terminationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationCategory() {
        return terminationCategory;
    }

    /**
     * Sets the value of the terminationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationCategory(String value) {
        this.terminationCategory = value;
    }

    /**
     * Gets the value of the terminationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationReason() {
        return terminationReason;
    }

    /**
     * Sets the value of the terminationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationReason(String value) {
        this.terminationReason = value;
    }

    /**
     * Gets the value of the involuntaryTermination property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvoluntaryTermination() {
        return involuntaryTermination;
    }

    /**
     * Sets the value of the involuntaryTermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvoluntaryTermination(Boolean value) {
        this.involuntaryTermination = value;
    }

    /**
     * Gets the value of the notEligibleForHire property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotEligibleForHire() {
        return notEligibleForHire;
    }

    /**
     * Sets the value of the notEligibleForHire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotEligibleForHire(Boolean value) {
        this.notEligibleForHire = value;
    }

}
