
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the worker's supervisory management chain.
 * 
 * <p>Java class for Worker_Supervisory_Management_Chain_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Supervisory_Management_Chain_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Management_Chain_Data" type="{urn:com.workday/bsvc}Management_Chain_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Supervisory_Management_Chain_DataType", propOrder = {
    "managementChainData"
})
public class WorkerSupervisoryManagementChainDataType {

    @XmlElement(name = "Management_Chain_Data")
    protected List<ManagementChainDataType> managementChainData;

    /**
     * Gets the value of the managementChainData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managementChainData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagementChainData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagementChainDataType }
     * 
     * 
     */
    public List<ManagementChainDataType> getManagementChainData() {
        if (managementChainData == null) {
            managementChainData = new ArrayList<ManagementChainDataType>();
        }
        return this.managementChainData;
    }

}
