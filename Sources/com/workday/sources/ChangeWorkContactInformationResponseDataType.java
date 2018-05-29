
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing the person data for the Get Work Contact Information response.
 * 
 * <p>Java class for Change_Work_Contact_Information_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Work_Contact_Information_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Change_Work_Contact_Information" type="{urn:com.workday/bsvc}Change_Work_Contact_Information_Response_WrapperType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Work_Contact_Information_Response_DataType", propOrder = {
    "changeWorkContactInformation"
})
public class ChangeWorkContactInformationResponseDataType {

    @XmlElement(name = "Change_Work_Contact_Information")
    protected List<ChangeWorkContactInformationResponseWrapperType> changeWorkContactInformation;

    /**
     * Gets the value of the changeWorkContactInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeWorkContactInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeWorkContactInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeWorkContactInformationResponseWrapperType }
     * 
     * 
     */
    public List<ChangeWorkContactInformationResponseWrapperType> getChangeWorkContactInformation() {
        if (changeWorkContactInformation == null) {
            changeWorkContactInformation = new ArrayList<ChangeWorkContactInformationResponseWrapperType>();
        }
        return this.changeWorkContactInformation;
    }

}
