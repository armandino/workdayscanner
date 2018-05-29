
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper Element for Worker Compensation Code Data
 * 
 * <p>Java class for Workers_Compensation_Code_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Workers_Compensation_Code_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Workers_Compensation_Code" type="{urn:com.workday/bsvc}Workers_Compensation_CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Workers_Compensation_Code_Response_DataType", propOrder = {
    "workersCompensationCode"
})
public class WorkersCompensationCodeResponseDataType {

    @XmlElement(name = "Workers_Compensation_Code")
    protected List<WorkersCompensationCodeType> workersCompensationCode;

    /**
     * Gets the value of the workersCompensationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workersCompensationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkersCompensationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkersCompensationCodeType }
     * 
     * 
     */
    public List<WorkersCompensationCodeType> getWorkersCompensationCode() {
        if (workersCompensationCode == null) {
            workersCompensationCode = new ArrayList<WorkersCompensationCodeType>();
        }
        return this.workersCompensationCode;
    }

}
