
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Validation_FaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Validation_FaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Validation_Error" type="{urn:com.workday/bsvc}Validation_ErrorType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Validation_FaultType", propOrder = {
    "validationError"
})
public class ValidationFaultType {

    @XmlElement(name = "Validation_Error")
    protected List<ValidationErrorType> validationError;

    /**
     * Gets the value of the validationError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validationError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidationError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationErrorType }
     * 
     * 
     */
    public List<ValidationErrorType> getValidationError() {
        if (validationError == null) {
            validationError = new ArrayList<ValidationErrorType>();
        }
        return this.validationError;
    }

}
