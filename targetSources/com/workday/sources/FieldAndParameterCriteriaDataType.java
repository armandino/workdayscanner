
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Field Result Request Criteria
 * 
 * <p>Java class for Field_And_Parameter_Criteria_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field_And_Parameter_Criteria_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Provider_Reference" type="{urn:com.workday/bsvc}External_Field_and_Parameter_Initialization_ProviderObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field_And_Parameter_Criteria_DataType", propOrder = {
    "providerReference"
})
public class FieldAndParameterCriteriaDataType {

    @XmlElement(name = "Provider_Reference", required = true)
    protected List<ExternalFieldAndParameterInitializationProviderObjectType> providerReference;

    /**
     * Gets the value of the providerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalFieldAndParameterInitializationProviderObjectType }
     * 
     * 
     */
    public List<ExternalFieldAndParameterInitializationProviderObjectType> getProviderReference() {
        if (providerReference == null) {
            providerReference = new ArrayList<ExternalFieldAndParameterInitializationProviderObjectType>();
        }
        return this.providerReference;
    }

}
