
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing the worker data for the Get Change Licenses response.
 * 
 * <p>Java class for Change_Licenses_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Licenses_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Change_Licenses" type="{urn:com.workday/bsvc}Change_Licenses_Response_WrapperType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Licenses_Response_DataType", propOrder = {
    "changeLicenses"
})
public class ChangeLicensesResponseDataType {

    @XmlElement(name = "Change_Licenses")
    protected List<ChangeLicensesResponseWrapperType> changeLicenses;

    /**
     * Gets the value of the changeLicenses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeLicenses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeLicenses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeLicensesResponseWrapperType }
     * 
     * 
     */
    public List<ChangeLicensesResponseWrapperType> getChangeLicenses() {
        if (changeLicenses == null) {
            changeLicenses = new ArrayList<ChangeLicensesResponseWrapperType>();
        }
        return this.changeLicenses;
    }

}
