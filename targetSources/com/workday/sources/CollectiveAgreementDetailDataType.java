
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
 * Encapsulating element containing all Collective Agreement data.
 * 
 * <p>Java class for Collective_Agreement_Detail_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Collective_Agreement_Detail_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assign_Employee_Collective_Agreement_Event_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="End_Assignment_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Collective_Agreement_Data" type="{urn:com.workday/bsvc}Collective_Agreement_Snapshot_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collective_Agreement_Detail_DataType", propOrder = {
    "assignEmployeeCollectiveAgreementEventReference",
    "effectiveDate",
    "endAssignmentDate",
    "collectiveAgreementData"
})
public class CollectiveAgreementDetailDataType {

    @XmlElement(name = "Assign_Employee_Collective_Agreement_Event_Reference")
    protected UniqueIdentifierObjectType assignEmployeeCollectiveAgreementEventReference;
    @XmlElement(name = "Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "End_Assignment_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endAssignmentDate;
    @XmlElement(name = "Collective_Agreement_Data")
    protected List<CollectiveAgreementSnapshotDataType> collectiveAgreementData;

    /**
     * Gets the value of the assignEmployeeCollectiveAgreementEventReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getAssignEmployeeCollectiveAgreementEventReference() {
        return assignEmployeeCollectiveAgreementEventReference;
    }

    /**
     * Sets the value of the assignEmployeeCollectiveAgreementEventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setAssignEmployeeCollectiveAgreementEventReference(UniqueIdentifierObjectType value) {
        this.assignEmployeeCollectiveAgreementEventReference = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the endAssignmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndAssignmentDate() {
        return endAssignmentDate;
    }

    /**
     * Sets the value of the endAssignmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndAssignmentDate(XMLGregorianCalendar value) {
        this.endAssignmentDate = value;
    }

    /**
     * Gets the value of the collectiveAgreementData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectiveAgreementData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectiveAgreementData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectiveAgreementSnapshotDataType }
     * 
     * 
     */
    public List<CollectiveAgreementSnapshotDataType> getCollectiveAgreementData() {
        if (collectiveAgreementData == null) {
            collectiveAgreementData = new ArrayList<CollectiveAgreementSnapshotDataType>();
        }
        return this.collectiveAgreementData;
    }

}
