
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the worker's organizations that they are a member of related to the position.
 * 
 * <p>Java class for Position_Management_Chains_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Position_Management_Chains_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Position_Supervisory_Management_Chain_Data" type="{urn:com.workday/bsvc}Worker_Supervisory_Management_Chain_DataType" minOccurs="0"/>
 *         &lt;element name="Position_Matrix_Management_Chain_Data" type="{urn:com.workday/bsvc}Worker_Matrix_Management_Chain_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Position_Management_Chains_DataType", propOrder = {
    "positionSupervisoryManagementChainData",
    "positionMatrixManagementChainData"
})
public class PositionManagementChainsDataType {

    @XmlElement(name = "Position_Supervisory_Management_Chain_Data")
    protected WorkerSupervisoryManagementChainDataType positionSupervisoryManagementChainData;
    @XmlElement(name = "Position_Matrix_Management_Chain_Data")
    protected WorkerMatrixManagementChainDataType positionMatrixManagementChainData;

    /**
     * Gets the value of the positionSupervisoryManagementChainData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerSupervisoryManagementChainDataType }
     *     
     */
    public WorkerSupervisoryManagementChainDataType getPositionSupervisoryManagementChainData() {
        return positionSupervisoryManagementChainData;
    }

    /**
     * Sets the value of the positionSupervisoryManagementChainData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerSupervisoryManagementChainDataType }
     *     
     */
    public void setPositionSupervisoryManagementChainData(WorkerSupervisoryManagementChainDataType value) {
        this.positionSupervisoryManagementChainData = value;
    }

    /**
     * Gets the value of the positionMatrixManagementChainData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerMatrixManagementChainDataType }
     *     
     */
    public WorkerMatrixManagementChainDataType getPositionMatrixManagementChainData() {
        return positionMatrixManagementChainData;
    }

    /**
     * Sets the value of the positionMatrixManagementChainData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerMatrixManagementChainDataType }
     *     
     */
    public void setPositionMatrixManagementChainData(WorkerMatrixManagementChainDataType value) {
        this.positionMatrixManagementChainData = value;
    }

}
