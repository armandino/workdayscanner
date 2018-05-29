
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains information about all the succession plans that this employee is on.
 * 
 * <p>Java class for Succession_Profile_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Succession_Profile_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Candidate_Data" type="{urn:com.workday/bsvc}Succession_Plan_Candidate_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Succession_Profile_DataType", propOrder = {
    "candidateData"
})
public class SuccessionProfileDataType {

    @XmlElement(name = "Candidate_Data")
    protected List<SuccessionPlanCandidateDataType> candidateData;

    /**
     * Gets the value of the candidateData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the candidateData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCandidateData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuccessionPlanCandidateDataType }
     * 
     * 
     */
    public List<SuccessionPlanCandidateDataType> getCandidateData() {
        if (candidateData == null) {
            candidateData = new ArrayList<SuccessionPlanCandidateDataType>();
        }
        return this.candidateData;
    }

}
