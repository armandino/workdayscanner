
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Bonus_PlanObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bonus_PlanObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:com.workday/bsvc}Bonus_PlanObjectIDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Descriptor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bonus_PlanObjectType", propOrder = {
    "id"
})
public class BonusPlanObjectType {

    @XmlElement(name = "ID")
    protected List<BonusPlanObjectIDType> id;
    @XmlAttribute(name = "Descriptor", namespace = "urn:com.workday/bsvc")
    protected String descriptor;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BonusPlanObjectIDType }
     * 
     * 
     */
    public List<BonusPlanObjectIDType> getID() {
        if (id == null) {
            id = new ArrayList<BonusPlanObjectIDType>();
        }
        return this.id;
    }

    /**
     * Gets the value of the descriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptor() {
        return descriptor;
    }

    /**
     * Sets the value of the descriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptor(String value) {
        this.descriptor = value;
    }

}
