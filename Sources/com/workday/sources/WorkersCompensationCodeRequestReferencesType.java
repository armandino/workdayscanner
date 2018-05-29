
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing reference instance for a Workers' Compensation Code
 * 
 * <p>Java class for Workers_Compensation_Code_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Workers_Compensation_Code_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Workers_Compensation_Code_Reference" type="{urn:com.workday/bsvc}Workers_Compensation_CodeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Workers_Compensation_Code_Request_ReferencesType", propOrder = {
    "workersCompensationCodeReference"
})
public class WorkersCompensationCodeRequestReferencesType {

    @XmlElement(name = "Workers_Compensation_Code_Reference")
    protected List<WorkersCompensationCodeObjectType> workersCompensationCodeReference;

    /**
     * Gets the value of the workersCompensationCodeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workersCompensationCodeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkersCompensationCodeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkersCompensationCodeObjectType }
     * 
     * 
     */
    public List<WorkersCompensationCodeObjectType> getWorkersCompensationCodeReference() {
        if (workersCompensationCodeReference == null) {
            workersCompensationCodeReference = new ArrayList<WorkersCompensationCodeObjectType>();
        }
        return this.workersCompensationCodeReference;
    }

}
