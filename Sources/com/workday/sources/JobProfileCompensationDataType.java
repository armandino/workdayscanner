
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element contains Compensation related data for the Job Profile.  Currently, only an optional Compensation Grade association for the Job Profile is available.
 * 
 * <p>Java class for Job_Profile_Compensation_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Profile_Compensation_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compensation_Grade_Reference" type="{urn:com.workday/bsvc}Compensation_GradeObjectType" minOccurs="0"/>
 *         &lt;element name="Compensation_Grade_Profile_Reference" type="{urn:com.workday/bsvc}Compensation_Grade_ProfileObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Profile_Compensation_DataType", propOrder = {
    "compensationGradeReference",
    "compensationGradeProfileReference"
})
public class JobProfileCompensationDataType {

    @XmlElement(name = "Compensation_Grade_Reference")
    protected CompensationGradeObjectType compensationGradeReference;
    @XmlElement(name = "Compensation_Grade_Profile_Reference")
    protected List<CompensationGradeProfileObjectType> compensationGradeProfileReference;

    /**
     * Gets the value of the compensationGradeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationGradeObjectType }
     *     
     */
    public CompensationGradeObjectType getCompensationGradeReference() {
        return compensationGradeReference;
    }

    /**
     * Sets the value of the compensationGradeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationGradeObjectType }
     *     
     */
    public void setCompensationGradeReference(CompensationGradeObjectType value) {
        this.compensationGradeReference = value;
    }

    /**
     * Gets the value of the compensationGradeProfileReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compensationGradeProfileReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompensationGradeProfileReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompensationGradeProfileObjectType }
     * 
     * 
     */
    public List<CompensationGradeProfileObjectType> getCompensationGradeProfileReference() {
        if (compensationGradeProfileReference == null) {
            compensationGradeProfileReference = new ArrayList<CompensationGradeProfileObjectType>();
        }
        return this.compensationGradeProfileReference;
    }

}
