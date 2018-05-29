
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the evaluation information that was filled out by the manager.
 * 
 * <p>Java class for Manager_Evaluation_Detail_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Manager_Evaluation_Detail_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Overall_Data" type="{urn:com.workday/bsvc}Overall_Evaluation_Detail_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Manager_Evaluation_Detail_DataType", propOrder = {
    "overallData"
})
public class ManagerEvaluationDetailDataType {

    @XmlElement(name = "Overall_Data")
    protected OverallEvaluationDetailDataType overallData;

    /**
     * Gets the value of the overallData property.
     * 
     * @return
     *     possible object is
     *     {@link OverallEvaluationDetailDataType }
     *     
     */
    public OverallEvaluationDetailDataType getOverallData() {
        return overallData;
    }

    /**
     * Sets the value of the overallData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallEvaluationDetailDataType }
     *     
     */
    public void setOverallData(OverallEvaluationDetailDataType value) {
        this.overallData = value;
    }

}
