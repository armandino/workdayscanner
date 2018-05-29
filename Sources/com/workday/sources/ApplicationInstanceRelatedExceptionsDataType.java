
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing Exceptions Data
 * 
 * <p>Java class for Application_Instance_Related_Exceptions_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Application_Instance_Related_Exceptions_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Exceptions_Data" type="{urn:com.workday/bsvc}Application_Instance_Exceptions_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Application_Instance_Related_Exceptions_DataType", propOrder = {
    "exceptionsData"
})
public class ApplicationInstanceRelatedExceptionsDataType {

    @XmlElement(name = "Exceptions_Data")
    protected List<ApplicationInstanceExceptionsDataType> exceptionsData;

    /**
     * Gets the value of the exceptionsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptionsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationInstanceExceptionsDataType }
     * 
     * 
     */
    public List<ApplicationInstanceExceptionsDataType> getExceptionsData() {
        if (exceptionsData == null) {
            exceptionsData = new ArrayList<ApplicationInstanceExceptionsDataType>();
        }
        return this.exceptionsData;
    }

}
