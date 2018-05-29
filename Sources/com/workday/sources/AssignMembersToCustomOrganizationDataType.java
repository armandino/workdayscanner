
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Sub element of the request having positions to add/remove.
 * 
 * <p>Java class for Assign_Members_to_Custom_Organization_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assign_Members_to_Custom_Organization_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Reorganization_Reference" type="{urn:com.workday/bsvc}ReorganizationObjectType"/>
 *         &lt;element name="Positions_to_Add_Reference" type="{urn:com.workday/bsvc}Position_ElementObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Positions_to_Remove_Reference" type="{urn:com.workday/bsvc}Position_ElementObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assign_Members_to_Custom_Organization_DataType", propOrder = {
    "reorganizationReference",
    "positionsToAddReference",
    "positionsToRemoveReference"
})
public class AssignMembersToCustomOrganizationDataType {

    @XmlElement(name = "Reorganization_Reference", required = true)
    protected ReorganizationObjectType reorganizationReference;
    @XmlElement(name = "Positions_to_Add_Reference")
    protected List<PositionElementObjectType> positionsToAddReference;
    @XmlElement(name = "Positions_to_Remove_Reference")
    protected List<PositionElementObjectType> positionsToRemoveReference;

    /**
     * Gets the value of the reorganizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReorganizationObjectType }
     *     
     */
    public ReorganizationObjectType getReorganizationReference() {
        return reorganizationReference;
    }

    /**
     * Sets the value of the reorganizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReorganizationObjectType }
     *     
     */
    public void setReorganizationReference(ReorganizationObjectType value) {
        this.reorganizationReference = value;
    }

    /**
     * Gets the value of the positionsToAddReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionsToAddReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionsToAddReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionElementObjectType }
     * 
     * 
     */
    public List<PositionElementObjectType> getPositionsToAddReference() {
        if (positionsToAddReference == null) {
            positionsToAddReference = new ArrayList<PositionElementObjectType>();
        }
        return this.positionsToAddReference;
    }

    /**
     * Gets the value of the positionsToRemoveReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionsToRemoveReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionsToRemoveReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionElementObjectType }
     * 
     * 
     */
    public List<PositionElementObjectType> getPositionsToRemoveReference() {
        if (positionsToRemoveReference == null) {
            positionsToRemoveReference = new ArrayList<PositionElementObjectType>();
        }
        return this.positionsToRemoveReference;
    }

}
