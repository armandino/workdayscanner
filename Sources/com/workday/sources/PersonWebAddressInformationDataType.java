
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element that tracks all web addresses.
 * 
 * <p>Java class for Person_Web_Address_Information_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_Web_Address_Information_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person_Web_Address_Data" type="{urn:com.workday/bsvc}Person_Web_Address_DataType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person_Web_Address_Information_DataType", propOrder = {
    "personWebAddressData"
})
public class PersonWebAddressInformationDataType {

    @XmlElement(name = "Person_Web_Address_Data", required = true)
    protected List<PersonWebAddressDataType> personWebAddressData;

    /**
     * Gets the value of the personWebAddressData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personWebAddressData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonWebAddressData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonWebAddressDataType }
     * 
     * 
     */
    public List<PersonWebAddressDataType> getPersonWebAddressData() {
        if (personWebAddressData == null) {
            personWebAddressData = new ArrayList<PersonWebAddressDataType>();
        }
        return this.personWebAddressData;
    }

}
