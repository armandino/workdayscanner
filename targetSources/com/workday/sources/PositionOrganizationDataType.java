
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the position's organization that it is part of
 * 
 * <p>Java class for Position_Organization_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Position_Organization_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Position_Organization_Data" type="{urn:com.workday/bsvc}Worker_Organization_Membership_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Pay_Group_Assignment_Correct_or_Rescind_Data" type="{urn:com.workday/bsvc}Pay_Group_Assignment_Correct_or_Rescinded_Organization_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Position_Organization_DataType", propOrder = {
    "positionOrganizationData",
    "payGroupAssignmentCorrectOrRescindData"
})
public class PositionOrganizationDataType {

    @XmlElement(name = "Position_Organization_Data")
    protected List<WorkerOrganizationMembershipDataType> positionOrganizationData;
    @XmlElement(name = "Pay_Group_Assignment_Correct_or_Rescind_Data")
    protected List<PayGroupAssignmentCorrectOrRescindedOrganizationDataType> payGroupAssignmentCorrectOrRescindData;

    /**
     * Gets the value of the positionOrganizationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionOrganizationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionOrganizationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerOrganizationMembershipDataType }
     * 
     * 
     */
    public List<WorkerOrganizationMembershipDataType> getPositionOrganizationData() {
        if (positionOrganizationData == null) {
            positionOrganizationData = new ArrayList<WorkerOrganizationMembershipDataType>();
        }
        return this.positionOrganizationData;
    }

    /**
     * Gets the value of the payGroupAssignmentCorrectOrRescindData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payGroupAssignmentCorrectOrRescindData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayGroupAssignmentCorrectOrRescindData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayGroupAssignmentCorrectOrRescindedOrganizationDataType }
     * 
     * 
     */
    public List<PayGroupAssignmentCorrectOrRescindedOrganizationDataType> getPayGroupAssignmentCorrectOrRescindData() {
        if (payGroupAssignmentCorrectOrRescindData == null) {
            payGroupAssignmentCorrectOrRescindData = new ArrayList<PayGroupAssignmentCorrectOrRescindedOrganizationDataType>();
        }
        return this.payGroupAssignmentCorrectOrRescindData;
    }

}
