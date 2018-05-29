
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
 * The request element containing all necessary information to assign a Veteran Status Identification for a Worker.
 * 
 * <p>Java class for Veteran_Status_Identification_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Veteran_Status_Identification_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType"/>
 *         &lt;element name="US_Veteran_Tenanted_Reference" type="{urn:com.workday/bsvc}US_Veteran_Status__Tenanted_ObjectType"/>
 *         &lt;element name="US_Protected_Veteran_Status_Type_Reference" type="{urn:com.workday/bsvc}US_Protected_Veteran_Status_TypeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Discharge_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Veteran_Status_Identification_DataType", propOrder = {
    "workerReference",
    "usVeteranTenantedReference",
    "usProtectedVeteranStatusTypeReference",
    "dischargeDate"
})
public class VeteranStatusIdentificationDataType {

    @XmlElement(name = "Worker_Reference", required = true)
    protected WorkerObjectType workerReference;
    @XmlElement(name = "US_Veteran_Tenanted_Reference", required = true)
    protected USVeteranStatusTenantedObjectType usVeteranTenantedReference;
    @XmlElement(name = "US_Protected_Veteran_Status_Type_Reference")
    protected List<USProtectedVeteranStatusTypeObjectType> usProtectedVeteranStatusTypeReference;
    @XmlElement(name = "Discharge_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dischargeDate;

    /**
     * Gets the value of the workerReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerObjectType }
     *     
     */
    public WorkerObjectType getWorkerReference() {
        return workerReference;
    }

    /**
     * Sets the value of the workerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerObjectType }
     *     
     */
    public void setWorkerReference(WorkerObjectType value) {
        this.workerReference = value;
    }

    /**
     * Gets the value of the usVeteranTenantedReference property.
     * 
     * @return
     *     possible object is
     *     {@link USVeteranStatusTenantedObjectType }
     *     
     */
    public USVeteranStatusTenantedObjectType getUSVeteranTenantedReference() {
        return usVeteranTenantedReference;
    }

    /**
     * Sets the value of the usVeteranTenantedReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link USVeteranStatusTenantedObjectType }
     *     
     */
    public void setUSVeteranTenantedReference(USVeteranStatusTenantedObjectType value) {
        this.usVeteranTenantedReference = value;
    }

    /**
     * Gets the value of the usProtectedVeteranStatusTypeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usProtectedVeteranStatusTypeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUSProtectedVeteranStatusTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link USProtectedVeteranStatusTypeObjectType }
     * 
     * 
     */
    public List<USProtectedVeteranStatusTypeObjectType> getUSProtectedVeteranStatusTypeReference() {
        if (usProtectedVeteranStatusTypeReference == null) {
            usProtectedVeteranStatusTypeReference = new ArrayList<USProtectedVeteranStatusTypeObjectType>();
        }
        return this.usProtectedVeteranStatusTypeReference;
    }

    /**
     * Gets the value of the dischargeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDischargeDate() {
        return dischargeDate;
    }

    /**
     * Sets the value of the dischargeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDischargeDate(XMLGregorianCalendar value) {
        this.dischargeDate = value;
    }

}
