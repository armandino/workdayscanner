
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing the worker data for the Get Change Passports and Visas response.
 * 
 * <p>Java class for Change_Passports_and_Visas_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Passports_and_Visas_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Change_Passports_and_Visas" type="{urn:com.workday/bsvc}Change_Passports_and_Visas_Response_WrapperType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Passports_and_Visas_Response_DataType", propOrder = {
    "changePassportsAndVisas"
})
public class ChangePassportsAndVisasResponseDataType {

    @XmlElement(name = "Change_Passports_and_Visas")
    protected List<ChangePassportsAndVisasResponseWrapperType> changePassportsAndVisas;

    /**
     * Gets the value of the changePassportsAndVisas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changePassportsAndVisas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangePassportsAndVisas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangePassportsAndVisasResponseWrapperType }
     * 
     * 
     */
    public List<ChangePassportsAndVisasResponseWrapperType> getChangePassportsAndVisas() {
        if (changePassportsAndVisas == null) {
            changePassportsAndVisas = new ArrayList<ChangePassportsAndVisasResponseWrapperType>();
        }
        return this.changePassportsAndVisas;
    }

}
