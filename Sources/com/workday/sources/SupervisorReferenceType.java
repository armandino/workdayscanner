
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Worker (e.g. Employee or Contingent Worker).
 * 
 * <p>Java class for Supervisor_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Supervisor_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Employee_Reference" type="{urn:com.workday/bsvc}Employee_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Contingent_Worker_Reference" type="{urn:com.workday/bsvc}Contingent_Worker_Reference_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Supervisor_ReferenceType", propOrder = {
    "employeeReference",
    "contingentWorkerReference"
})
public class SupervisorReferenceType {

    @XmlElement(name = "Employee_Reference")
    protected EmployeeReferenceType employeeReference;
    @XmlElement(name = "Contingent_Worker_Reference")
    protected ContingentWorkerReferenceDataType contingentWorkerReference;

    /**
     * Gets the value of the employeeReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeReferenceType }
     *     
     */
    public EmployeeReferenceType getEmployeeReference() {
        return employeeReference;
    }

    /**
     * Sets the value of the employeeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeReferenceType }
     *     
     */
    public void setEmployeeReference(EmployeeReferenceType value) {
        this.employeeReference = value;
    }

    /**
     * Gets the value of the contingentWorkerReference property.
     * 
     * @return
     *     possible object is
     *     {@link ContingentWorkerReferenceDataType }
     *     
     */
    public ContingentWorkerReferenceDataType getContingentWorkerReference() {
        return contingentWorkerReference;
    }

    /**
     * Sets the value of the contingentWorkerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContingentWorkerReferenceDataType }
     *     
     */
    public void setContingentWorkerReference(ContingentWorkerReferenceDataType value) {
        this.contingentWorkerReference = value;
    }

}
