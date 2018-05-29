
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference to the provisioning group created or updated.
 * 
 * <p>Java class for Put_Provisioning_Group_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Provisioning_Group_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Provisioning_Group_Reference" type="{urn:com.workday/bsvc}Provisioning_GroupObjectType" minOccurs="0"/>
 *         &lt;element name="Exceptions_Response_Data" type="{urn:com.workday/bsvc}Application_Instance_Related_Exceptions_DataType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Put_Provisioning_Group_ResponseType", propOrder = {
    "provisioningGroupReference",
    "exceptionsResponseData"
})
public class PutProvisioningGroupResponseType {

    @XmlElement(name = "Provisioning_Group_Reference")
    protected ProvisioningGroupObjectType provisioningGroupReference;
    @XmlElement(name = "Exceptions_Response_Data")
    protected List<ApplicationInstanceRelatedExceptionsDataType> exceptionsResponseData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the provisioningGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProvisioningGroupObjectType }
     *     
     */
    public ProvisioningGroupObjectType getProvisioningGroupReference() {
        return provisioningGroupReference;
    }

    /**
     * Sets the value of the provisioningGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvisioningGroupObjectType }
     *     
     */
    public void setProvisioningGroupReference(ProvisioningGroupObjectType value) {
        this.provisioningGroupReference = value;
    }

    /**
     * Gets the value of the exceptionsResponseData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionsResponseData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptionsResponseData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationInstanceRelatedExceptionsDataType }
     * 
     * 
     */
    public List<ApplicationInstanceRelatedExceptionsDataType> getExceptionsResponseData() {
        if (exceptionsResponseData == null) {
            exceptionsResponseData = new ArrayList<ApplicationInstanceRelatedExceptionsDataType>();
        }
        return this.exceptionsResponseData;
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
