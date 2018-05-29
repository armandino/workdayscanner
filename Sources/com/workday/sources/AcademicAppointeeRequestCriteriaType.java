
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Academic Appointee Request Criteria
 * 
 * <p>Java class for Academic_Appointee_Request_CriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Appointee_Request_CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="By_Academic_Track_Type_Reference" type="{urn:com.workday/bsvc}Academic_Track_TypeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="By_Worker" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="By_Affiliate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="By_Student" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="By_Active_Role" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_Appointee_Request_CriteriaType", propOrder = {
    "byAcademicTrackTypeReference",
    "byWorker",
    "byAffiliate",
    "byStudent",
    "byActiveRole"
})
public class AcademicAppointeeRequestCriteriaType {

    @XmlElement(name = "By_Academic_Track_Type_Reference")
    protected List<AcademicTrackTypeObjectType> byAcademicTrackTypeReference;
    @XmlElement(name = "By_Worker")
    protected Boolean byWorker;
    @XmlElement(name = "By_Affiliate")
    protected Boolean byAffiliate;
    @XmlElement(name = "By_Student")
    protected Boolean byStudent;
    @XmlElement(name = "By_Active_Role")
    protected Boolean byActiveRole;

    /**
     * Gets the value of the byAcademicTrackTypeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the byAcademicTrackTypeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getByAcademicTrackTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicTrackTypeObjectType }
     * 
     * 
     */
    public List<AcademicTrackTypeObjectType> getByAcademicTrackTypeReference() {
        if (byAcademicTrackTypeReference == null) {
            byAcademicTrackTypeReference = new ArrayList<AcademicTrackTypeObjectType>();
        }
        return this.byAcademicTrackTypeReference;
    }

    /**
     * Gets the value of the byWorker property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isByWorker() {
        return byWorker;
    }

    /**
     * Sets the value of the byWorker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setByWorker(Boolean value) {
        this.byWorker = value;
    }

    /**
     * Gets the value of the byAffiliate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isByAffiliate() {
        return byAffiliate;
    }

    /**
     * Sets the value of the byAffiliate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setByAffiliate(Boolean value) {
        this.byAffiliate = value;
    }

    /**
     * Gets the value of the byStudent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isByStudent() {
        return byStudent;
    }

    /**
     * Sets the value of the byStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setByStudent(Boolean value) {
        this.byStudent = value;
    }

    /**
     * Gets the value of the byActiveRole property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isByActiveRole() {
        return byActiveRole;
    }

    /**
     * Sets the value of the byActiveRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setByActiveRole(Boolean value) {
        this.byActiveRole = value;
    }

}
