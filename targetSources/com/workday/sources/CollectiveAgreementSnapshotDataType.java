
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating Element containing the Collective Agreement Classification Parameter Data.
 * 
 * <p>Java class for Collective_Agreement_Snapshot_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Collective_Agreement_Snapshot_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Collective_Agreement_Reference" type="{urn:com.workday/bsvc}Collective_AgreementObjectType" minOccurs="0"/>
 *         &lt;element name="Collective_Agreement_Factor" type="{urn:com.workday/bsvc}Collective_Agreement_Factor_Parameter_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collective_Agreement_Snapshot_DataType", propOrder = {
    "collectiveAgreementReference",
    "collectiveAgreementFactor"
})
public class CollectiveAgreementSnapshotDataType {

    @XmlElement(name = "Collective_Agreement_Reference")
    protected CollectiveAgreementObjectType collectiveAgreementReference;
    @XmlElement(name = "Collective_Agreement_Factor")
    protected List<CollectiveAgreementFactorParameterDataType> collectiveAgreementFactor;

    /**
     * Gets the value of the collectiveAgreementReference property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementObjectType }
     *     
     */
    public CollectiveAgreementObjectType getCollectiveAgreementReference() {
        return collectiveAgreementReference;
    }

    /**
     * Sets the value of the collectiveAgreementReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementObjectType }
     *     
     */
    public void setCollectiveAgreementReference(CollectiveAgreementObjectType value) {
        this.collectiveAgreementReference = value;
    }

    /**
     * Gets the value of the collectiveAgreementFactor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectiveAgreementFactor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectiveAgreementFactor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectiveAgreementFactorParameterDataType }
     * 
     * 
     */
    public List<CollectiveAgreementFactorParameterDataType> getCollectiveAgreementFactor() {
        if (collectiveAgreementFactor == null) {
            collectiveAgreementFactor = new ArrayList<CollectiveAgreementFactorParameterDataType>();
        }
        return this.collectiveAgreementFactor;
    }

}
