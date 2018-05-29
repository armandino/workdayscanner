
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A container for Academic Unit responses
 * 
 * <p>Java class for Academic_Unit_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Unit_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Unit" type="{urn:com.workday/bsvc}Academic_UnitType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_Unit_Response_DataType", propOrder = {
    "academicUnit"
})
public class AcademicUnitResponseDataType {

    @XmlElement(name = "Academic_Unit")
    protected List<AcademicUnitType> academicUnit;

    /**
     * Gets the value of the academicUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicUnitType }
     * 
     * 
     */
    public List<AcademicUnitType> getAcademicUnit() {
        if (academicUnit == null) {
            academicUnit = new ArrayList<AcademicUnitType>();
        }
        return this.academicUnit;
    }

}
