
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the Request Criteria element to limit the Job Families returned based on the specific criteria.  Job Families that are returned must meet all of the criteria specified.
 * 
 * <p>Java class for Job_Families_Request_CriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Families_Request_CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Field_And_Parameter_Criteria_Data" type="{urn:com.workday/bsvc}Field_And_Parameter_Criteria_DataType" minOccurs="0"/>
 *         &lt;element name="Include_InActive_Job_Families" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Families_Request_CriteriaType", propOrder = {
    "fieldAndParameterCriteriaData",
    "includeInActiveJobFamilies"
})
public class JobFamiliesRequestCriteriaType {

    @XmlElement(name = "Field_And_Parameter_Criteria_Data")
    protected FieldAndParameterCriteriaDataType fieldAndParameterCriteriaData;
    @XmlElement(name = "Include_InActive_Job_Families")
    protected Boolean includeInActiveJobFamilies;

    /**
     * Gets the value of the fieldAndParameterCriteriaData property.
     * 
     * @return
     *     possible object is
     *     {@link FieldAndParameterCriteriaDataType }
     *     
     */
    public FieldAndParameterCriteriaDataType getFieldAndParameterCriteriaData() {
        return fieldAndParameterCriteriaData;
    }

    /**
     * Sets the value of the fieldAndParameterCriteriaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldAndParameterCriteriaDataType }
     *     
     */
    public void setFieldAndParameterCriteriaData(FieldAndParameterCriteriaDataType value) {
        this.fieldAndParameterCriteriaData = value;
    }

    /**
     * Gets the value of the includeInActiveJobFamilies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeInActiveJobFamilies() {
        return includeInActiveJobFamilies;
    }

    /**
     * Sets the value of the includeInActiveJobFamilies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeInActiveJobFamilies(Boolean value) {
        this.includeInActiveJobFamilies = value;
    }

}
