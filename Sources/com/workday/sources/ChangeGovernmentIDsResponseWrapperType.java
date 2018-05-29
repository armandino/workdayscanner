
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Change Government IDs Business Process Data element. This is the element that contains the data to load.
 * 
 * <p>Java class for Change_Government_IDs_Response_WrapperType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Government_IDs_Response_WrapperType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person_Reference" type="{urn:com.workday/bsvc}RoleObjectType" minOccurs="0"/>
 *         &lt;element name="Change_Government_IDs_Data" type="{urn:com.workday/bsvc}Change_Government_IDs_Business_Process_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Government_IDs_Response_WrapperType", propOrder = {
    "personReference",
    "changeGovernmentIDsData"
})
public class ChangeGovernmentIDsResponseWrapperType {

    @XmlElement(name = "Person_Reference")
    protected RoleObjectType personReference;
    @XmlElement(name = "Change_Government_IDs_Data")
    protected List<ChangeGovernmentIDsBusinessProcessDataType> changeGovernmentIDsData;

    /**
     * Gets the value of the personReference property.
     * 
     * @return
     *     possible object is
     *     {@link RoleObjectType }
     *     
     */
    public RoleObjectType getPersonReference() {
        return personReference;
    }

    /**
     * Sets the value of the personReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleObjectType }
     *     
     */
    public void setPersonReference(RoleObjectType value) {
        this.personReference = value;
    }

    /**
     * Gets the value of the changeGovernmentIDsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeGovernmentIDsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeGovernmentIDsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeGovernmentIDsBusinessProcessDataType }
     * 
     * 
     */
    public List<ChangeGovernmentIDsBusinessProcessDataType> getChangeGovernmentIDsData() {
        if (changeGovernmentIDsData == null) {
            changeGovernmentIDsData = new ArrayList<ChangeGovernmentIDsBusinessProcessDataType>();
        }
        return this.changeGovernmentIDsData;
    }

}
