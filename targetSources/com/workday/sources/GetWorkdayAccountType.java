
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing Workday Account information.
 * 
 * <p>Java class for Get_Workday_AccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get_Workday_AccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Workday_Account_Reference" type="{urn:com.workday/bsvc}RoleObjectType" minOccurs="0"/>
 *         &lt;element name="Workday_Account_for_Worker_Data" type="{urn:com.workday/bsvc}Workday_Account_for_Worker_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_Workday_AccountType", propOrder = {
    "workdayAccountReference",
    "workdayAccountForWorkerData"
})
public class GetWorkdayAccountType {

    @XmlElement(name = "Workday_Account_Reference")
    protected RoleObjectType workdayAccountReference;
    @XmlElement(name = "Workday_Account_for_Worker_Data")
    protected List<WorkdayAccountForWorkerDataType> workdayAccountForWorkerData;

    /**
     * Gets the value of the workdayAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link RoleObjectType }
     *     
     */
    public RoleObjectType getWorkdayAccountReference() {
        return workdayAccountReference;
    }

    /**
     * Sets the value of the workdayAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleObjectType }
     *     
     */
    public void setWorkdayAccountReference(RoleObjectType value) {
        this.workdayAccountReference = value;
    }

    /**
     * Gets the value of the workdayAccountForWorkerData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workdayAccountForWorkerData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkdayAccountForWorkerData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkdayAccountForWorkerDataType }
     * 
     * 
     */
    public List<WorkdayAccountForWorkerDataType> getWorkdayAccountForWorkerData() {
        if (workdayAccountForWorkerData == null) {
            workdayAccountForWorkerData = new ArrayList<WorkdayAccountForWorkerDataType>();
        }
        return this.workdayAccountForWorkerData;
    }

}
