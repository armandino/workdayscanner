
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
 * Element  containing a single union member with associated membership details.
 * 
 * <p>Java class for Union_Member_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Union_Member_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" minOccurs="0"/>
 *         &lt;element name="Union_Reference" type="{urn:com.workday/bsvc}UnionObjectType"/>
 *         &lt;element name="Seniority_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Union_Membership_Data" type="{urn:com.workday/bsvc}Union_Membership_DataType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Union_Member_DataType", propOrder = {
    "workerReference",
    "unionReference",
    "seniorityDate",
    "unionMembershipData"
})
public class UnionMemberDataType {

    @XmlElement(name = "Worker_Reference")
    protected WorkerObjectType workerReference;
    @XmlElement(name = "Union_Reference", required = true)
    protected UnionObjectType unionReference;
    @XmlElement(name = "Seniority_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar seniorityDate;
    @XmlElement(name = "Union_Membership_Data", required = true)
    protected List<UnionMembershipDataType> unionMembershipData;

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
     * Gets the value of the unionReference property.
     * 
     * @return
     *     possible object is
     *     {@link UnionObjectType }
     *     
     */
    public UnionObjectType getUnionReference() {
        return unionReference;
    }

    /**
     * Sets the value of the unionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnionObjectType }
     *     
     */
    public void setUnionReference(UnionObjectType value) {
        this.unionReference = value;
    }

    /**
     * Gets the value of the seniorityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeniorityDate() {
        return seniorityDate;
    }

    /**
     * Sets the value of the seniorityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeniorityDate(XMLGregorianCalendar value) {
        this.seniorityDate = value;
    }

    /**
     * Gets the value of the unionMembershipData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unionMembershipData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnionMembershipData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnionMembershipDataType }
     * 
     * 
     */
    public List<UnionMembershipDataType> getUnionMembershipData() {
        if (unionMembershipData == null) {
            unionMembershipData = new ArrayList<UnionMembershipDataType>();
        }
        return this.unionMembershipData;
    }

}
