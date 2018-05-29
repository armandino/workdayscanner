
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the Position-level data for a Worker.  The primary position is always the first element.
 * 
 * <p>Java class for Worker_Job_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Job_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Position_Data" type="{urn:com.workday/bsvc}Position_Detail_DataType" minOccurs="0"/>
 *         &lt;element name="Position_Organizations_Data" type="{urn:com.workday/bsvc}Position_Organization_DataType" minOccurs="0"/>
 *         &lt;element name="Position_Management_Chains_Data" type="{urn:com.workday/bsvc}Position_Management_Chains_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Primary_Job" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Job_DataType", propOrder = {
    "positionData",
    "positionOrganizationsData",
    "positionManagementChainsData"
})
public class WorkerJobDataType {

    @XmlElement(name = "Position_Data")
    protected PositionDetailDataType positionData;
    @XmlElement(name = "Position_Organizations_Data")
    protected PositionOrganizationDataType positionOrganizationsData;
    @XmlElement(name = "Position_Management_Chains_Data")
    protected PositionManagementChainsDataType positionManagementChainsData;
    @XmlAttribute(name = "Primary_Job", namespace = "urn:com.workday/bsvc")
    protected Boolean primaryJob;

    /**
     * Gets the value of the positionData property.
     * 
     * @return
     *     possible object is
     *     {@link PositionDetailDataType }
     *     
     */
    public PositionDetailDataType getPositionData() {
        return positionData;
    }

    /**
     * Sets the value of the positionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionDetailDataType }
     *     
     */
    public void setPositionData(PositionDetailDataType value) {
        this.positionData = value;
    }

    /**
     * Gets the value of the positionOrganizationsData property.
     * 
     * @return
     *     possible object is
     *     {@link PositionOrganizationDataType }
     *     
     */
    public PositionOrganizationDataType getPositionOrganizationsData() {
        return positionOrganizationsData;
    }

    /**
     * Sets the value of the positionOrganizationsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionOrganizationDataType }
     *     
     */
    public void setPositionOrganizationsData(PositionOrganizationDataType value) {
        this.positionOrganizationsData = value;
    }

    /**
     * Gets the value of the positionManagementChainsData property.
     * 
     * @return
     *     possible object is
     *     {@link PositionManagementChainsDataType }
     *     
     */
    public PositionManagementChainsDataType getPositionManagementChainsData() {
        return positionManagementChainsData;
    }

    /**
     * Sets the value of the positionManagementChainsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionManagementChainsDataType }
     *     
     */
    public void setPositionManagementChainsData(PositionManagementChainsDataType value) {
        this.positionManagementChainsData = value;
    }

    /**
     * Gets the value of the primaryJob property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryJob() {
        return primaryJob;
    }

    /**
     * Sets the value of the primaryJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryJob(Boolean value) {
        this.primaryJob = value;
    }

}
