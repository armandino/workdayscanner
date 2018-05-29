
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing the person data for the Get Home Contact Information response.
 * 
 * <p>Java class for Change_Home_Contact_Information_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Home_Contact_Information_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Change_Home_Contact_Information" type="{urn:com.workday/bsvc}Change_Home_Contact_Information_Response_WrapperType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Home_Contact_Information_Response_DataType", propOrder = {
    "changeHomeContactInformation"
})
public class ChangeHomeContactInformationResponseDataType {

    @XmlElement(name = "Change_Home_Contact_Information")
    protected List<ChangeHomeContactInformationResponseWrapperType> changeHomeContactInformation;

    /**
     * Gets the value of the changeHomeContactInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeHomeContactInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeHomeContactInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeHomeContactInformationResponseWrapperType }
     * 
     * 
     */
    public List<ChangeHomeContactInformationResponseWrapperType> getChangeHomeContactInformation() {
        if (changeHomeContactInformation == null) {
            changeHomeContactInformation = new ArrayList<ChangeHomeContactInformationResponseWrapperType>();
        }
        return this.changeHomeContactInformation;
    }

}
