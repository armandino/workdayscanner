
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Edit Named Professorship Event Request
 * 
 * <p>Java class for Edit_Named_Professorship_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Edit_Named_Professorship_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business_Process_Parameters" type="{urn:com.workday/bsvc}Business_Process_ParametersType" minOccurs="0"/>
 *         &lt;element name="Edit_Named_Professorship_Data" type="{urn:com.workday/bsvc}Edit_Named_Professorship_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Edit_Named_Professorship_RequestType", propOrder = {
    "businessProcessParameters",
    "editNamedProfessorshipData"
})
public class EditNamedProfessorshipRequestType {

    @XmlElement(name = "Business_Process_Parameters")
    protected BusinessProcessParametersType businessProcessParameters;
    @XmlElement(name = "Edit_Named_Professorship_Data", required = true)
    protected EditNamedProfessorshipDataType editNamedProfessorshipData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the businessProcessParameters property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessProcessParametersType }
     *     
     */
    public BusinessProcessParametersType getBusinessProcessParameters() {
        return businessProcessParameters;
    }

    /**
     * Sets the value of the businessProcessParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessProcessParametersType }
     *     
     */
    public void setBusinessProcessParameters(BusinessProcessParametersType value) {
        this.businessProcessParameters = value;
    }

    /**
     * Gets the value of the editNamedProfessorshipData property.
     * 
     * @return
     *     possible object is
     *     {@link EditNamedProfessorshipDataType }
     *     
     */
    public EditNamedProfessorshipDataType getEditNamedProfessorshipData() {
        return editNamedProfessorshipData;
    }

    /**
     * Sets the value of the editNamedProfessorshipData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditNamedProfessorshipDataType }
     *     
     */
    public void setEditNamedProfessorshipData(EditNamedProfessorshipDataType value) {
        this.editNamedProfessorshipData = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
