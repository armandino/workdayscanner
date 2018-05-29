
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Academic Appointee
 * 
 * <p>Java class for Academic_AppointeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_AppointeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Appointee_Reference" type="{urn:com.workday/bsvc}Academic_Appointee_EnabledObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Academic_Appointee_Data" type="{urn:com.workday/bsvc}Academic_Appointee_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_AppointeeType", propOrder = {
    "academicAppointeeReference",
    "academicAppointeeData"
})
public class AcademicAppointeeType {

    @XmlElement(name = "Academic_Appointee_Reference")
    protected List<AcademicAppointeeEnabledObjectType> academicAppointeeReference;
    @XmlElement(name = "Academic_Appointee_Data")
    protected AcademicAppointeeDataType academicAppointeeData;

    /**
     * Gets the value of the academicAppointeeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicAppointeeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicAppointeeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicAppointeeEnabledObjectType }
     * 
     * 
     */
    public List<AcademicAppointeeEnabledObjectType> getAcademicAppointeeReference() {
        if (academicAppointeeReference == null) {
            academicAppointeeReference = new ArrayList<AcademicAppointeeEnabledObjectType>();
        }
        return this.academicAppointeeReference;
    }

    /**
     * Gets the value of the academicAppointeeData property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicAppointeeDataType }
     *     
     */
    public AcademicAppointeeDataType getAcademicAppointeeData() {
        return academicAppointeeData;
    }

    /**
     * Sets the value of the academicAppointeeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicAppointeeDataType }
     *     
     */
    public void setAcademicAppointeeData(AcademicAppointeeDataType value) {
        this.academicAppointeeData = value;
    }

}
