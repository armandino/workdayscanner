
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides ability to assign the previous superior to an organization that is currently inactive, does not have a superior, and the latest event was 'Inactivate'.
 * 
 * <p>Java class for Reassign_Superior_to_Inactive_Organization_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reassign_Superior_to_Inactive_Organization_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business_Process_Parameters" type="{urn:com.workday/bsvc}Business_Process_ParametersType" minOccurs="0"/>
 *         &lt;element name="Reassign_Superior_to_Inactive_Organization_Data" type="{urn:com.workday/bsvc}Reassign_Superior_to_Inactive_Organization_DataType"/>
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
@XmlType(name = "Reassign_Superior_to_Inactive_Organization_RequestType", propOrder = {
    "businessProcessParameters",
    "reassignSuperiorToInactiveOrganizationData"
})
public class ReassignSuperiorToInactiveOrganizationRequestType {

    @XmlElement(name = "Business_Process_Parameters")
    protected BusinessProcessParametersType businessProcessParameters;
    @XmlElement(name = "Reassign_Superior_to_Inactive_Organization_Data", required = true)
    protected ReassignSuperiorToInactiveOrganizationDataType reassignSuperiorToInactiveOrganizationData;
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
     * Gets the value of the reassignSuperiorToInactiveOrganizationData property.
     * 
     * @return
     *     possible object is
     *     {@link ReassignSuperiorToInactiveOrganizationDataType }
     *     
     */
    public ReassignSuperiorToInactiveOrganizationDataType getReassignSuperiorToInactiveOrganizationData() {
        return reassignSuperiorToInactiveOrganizationData;
    }

    /**
     * Sets the value of the reassignSuperiorToInactiveOrganizationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReassignSuperiorToInactiveOrganizationDataType }
     *     
     */
    public void setReassignSuperiorToInactiveOrganizationData(ReassignSuperiorToInactiveOrganizationDataType value) {
        this.reassignSuperiorToInactiveOrganizationData = value;
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
