
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing application related exceptions data
 * 
 * <p>Java class for Application_Instance_Exceptions_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Application_Instance_Exceptions_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Exception_Data" type="{urn:com.workday/bsvc}Exception_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Application_Instance_Exceptions_DataType", propOrder = {
    "exceptionData"
})
public class ApplicationInstanceExceptionsDataType {

    @XmlElement(name = "Exception_Data")
    protected List<ExceptionDataType> exceptionData;

    /**
     * Gets the value of the exceptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExceptionDataType }
     * 
     * 
     */
    public List<ExceptionDataType> getExceptionData() {
        if (exceptionData == null) {
            exceptionData = new ArrayList<ExceptionDataType>();
        }
        return this.exceptionData;
    }

}
