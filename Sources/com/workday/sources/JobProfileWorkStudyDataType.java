
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for Work-Study Data.
 * 
 * <p>Java class for Job_Profile_Work-Study_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Profile_Work-Study_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Requirement_Option_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Allowed_Student_Award_Sources_Reference" type="{urn:com.workday/bsvc}Student_Award_SourceObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Profile_Work-Study_DataType", propOrder = {
    "requirementOptionReference",
    "allowedStudentAwardSourcesReference"
})
public class JobProfileWorkStudyDataType {

    @XmlElement(name = "Requirement_Option_Reference")
    protected UniqueIdentifierObjectType requirementOptionReference;
    @XmlElement(name = "Allowed_Student_Award_Sources_Reference")
    protected List<StudentAwardSourceObjectType> allowedStudentAwardSourcesReference;

    /**
     * Gets the value of the requirementOptionReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getRequirementOptionReference() {
        return requirementOptionReference;
    }

    /**
     * Sets the value of the requirementOptionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setRequirementOptionReference(UniqueIdentifierObjectType value) {
        this.requirementOptionReference = value;
    }

    /**
     * Gets the value of the allowedStudentAwardSourcesReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedStudentAwardSourcesReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedStudentAwardSourcesReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentAwardSourceObjectType }
     * 
     * 
     */
    public List<StudentAwardSourceObjectType> getAllowedStudentAwardSourcesReference() {
        if (allowedStudentAwardSourcesReference == null) {
            allowedStudentAwardSourcesReference = new ArrayList<StudentAwardSourceObjectType>();
        }
        return this.allowedStudentAwardSourcesReference;
    }

}
