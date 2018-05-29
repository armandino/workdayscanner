
package com.workday.sources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the person's that are related to the worker as a dependent, beneficiary or emergency contact.
 * 
 * Security Note: This element is secured to the following domains:  Self Service: Benefit Elections; Worker Data: Benefit Elections
 * 
 * <p>Java class for Worker_Related_Persons_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Related_Persons_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number_of_Payroll_Dependents" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="2"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Related_Person" type="{urn:com.workday/bsvc}Related_PersonType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Related_Persons_DataType", propOrder = {
    "numberOfPayrollDependents",
    "relatedPerson"
})
public class WorkerRelatedPersonsDataType {

    @XmlElement(name = "Number_of_Payroll_Dependents")
    protected BigDecimal numberOfPayrollDependents;
    @XmlElement(name = "Related_Person")
    protected List<RelatedPersonType> relatedPerson;

    /**
     * Gets the value of the numberOfPayrollDependents property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfPayrollDependents() {
        return numberOfPayrollDependents;
    }

    /**
     * Sets the value of the numberOfPayrollDependents property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfPayrollDependents(BigDecimal value) {
        this.numberOfPayrollDependents = value;
    }

    /**
     * Gets the value of the relatedPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedPersonType }
     * 
     * 
     */
    public List<RelatedPersonType> getRelatedPerson() {
        if (relatedPerson == null) {
            relatedPerson = new ArrayList<RelatedPersonType>();
        }
        return this.relatedPerson;
    }

}
