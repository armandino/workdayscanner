
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains each payroll reporting code for the position.
 * 
 * <p>Java class for Position_Payroll_Reporting_Code_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Position_Payroll_Reporting_Code_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Payroll_Reporting_Code_Reference" type="{urn:com.workday/bsvc}Payroll_Reporting_Code__All_ObjectType"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Formatted_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Payroll_Reporting_Type_Reference" type="{urn:com.workday/bsvc}Payroll_Reporting_TypeObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Position_Payroll_Reporting_Code_DataType", propOrder = {
    "payrollReportingCodeReference",
    "code",
    "formattedCode",
    "name",
    "payrollReportingTypeReference"
})
public class PositionPayrollReportingCodeDataType {

    @XmlElement(name = "Payroll_Reporting_Code_Reference", required = true)
    protected PayrollReportingCodeAllObjectType payrollReportingCodeReference;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Formatted_Code")
    protected String formattedCode;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Payroll_Reporting_Type_Reference", required = true)
    protected PayrollReportingTypeObjectType payrollReportingTypeReference;

    /**
     * Gets the value of the payrollReportingCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollReportingCodeAllObjectType }
     *     
     */
    public PayrollReportingCodeAllObjectType getPayrollReportingCodeReference() {
        return payrollReportingCodeReference;
    }

    /**
     * Sets the value of the payrollReportingCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollReportingCodeAllObjectType }
     *     
     */
    public void setPayrollReportingCodeReference(PayrollReportingCodeAllObjectType value) {
        this.payrollReportingCodeReference = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the formattedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedCode() {
        return formattedCode;
    }

    /**
     * Sets the value of the formattedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedCode(String value) {
        this.formattedCode = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the payrollReportingTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollReportingTypeObjectType }
     *     
     */
    public PayrollReportingTypeObjectType getPayrollReportingTypeReference() {
        return payrollReportingTypeReference;
    }

    /**
     * Sets the value of the payrollReportingTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollReportingTypeObjectType }
     *     
     */
    public void setPayrollReportingTypeReference(PayrollReportingTypeObjectType value) {
        this.payrollReportingTypeReference = value;
    }

}
