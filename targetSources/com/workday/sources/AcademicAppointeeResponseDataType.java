
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Academic Appointee Response Data
 * 
 * <p>Java class for Academic_Appointee_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Appointee_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Appointee" type="{urn:com.workday/bsvc}Academic_AppointeeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_Appointee_Response_DataType", propOrder = {
    "academicAppointee"
})
public class AcademicAppointeeResponseDataType {

    @XmlElement(name = "Academic_Appointee")
    protected List<AcademicAppointeeType> academicAppointee;

    /**
     * Gets the value of the academicAppointee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicAppointee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicAppointee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicAppointeeType }
     * 
     * 
     */
    public List<AcademicAppointeeType> getAcademicAppointee() {
        if (academicAppointee == null) {
            academicAppointee = new ArrayList<AcademicAppointeeType>();
        }
        return this.academicAppointee;
    }

}
