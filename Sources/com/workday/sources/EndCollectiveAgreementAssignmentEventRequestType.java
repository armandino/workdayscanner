
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request Element consisting of Business Process Parameters and element with End Collective Agreement Assignment details
 * 
 * <p>Java class for End_Collective_Agreement_Assignment_Event_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="End_Collective_Agreement_Assignment_Event_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business_Process_Parameters" type="{urn:com.workday/bsvc}Business_Process_ParametersType" minOccurs="0"/>
 *         &lt;element name="End_Collective_Agreement_Assignment_Data" type="{urn:com.workday/bsvc}End_Collective_Agreement_Assignment_Event_DataType" minOccurs="0"/>
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
@XmlType(name = "End_Collective_Agreement_Assignment_Event_RequestType", propOrder = {
    "businessProcessParameters",
    "endCollectiveAgreementAssignmentData"
})
public class EndCollectiveAgreementAssignmentEventRequestType {

    @XmlElement(name = "Business_Process_Parameters")
    protected BusinessProcessParametersType businessProcessParameters;
    @XmlElement(name = "End_Collective_Agreement_Assignment_Data")
    protected EndCollectiveAgreementAssignmentEventDataType endCollectiveAgreementAssignmentData;
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
     * Gets the value of the endCollectiveAgreementAssignmentData property.
     * 
     * @return
     *     possible object is
     *     {@link EndCollectiveAgreementAssignmentEventDataType }
     *     
     */
    public EndCollectiveAgreementAssignmentEventDataType getEndCollectiveAgreementAssignmentData() {
        return endCollectiveAgreementAssignmentData;
    }

    /**
     * Sets the value of the endCollectiveAgreementAssignmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndCollectiveAgreementAssignmentEventDataType }
     *     
     */
    public void setEndCollectiveAgreementAssignmentData(EndCollectiveAgreementAssignmentEventDataType value) {
        this.endCollectiveAgreementAssignmentData = value;
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
