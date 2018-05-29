
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request References
 * 
 * <p>Java class for Academic_Rank_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Rank_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Rank_Reference" type="{urn:com.workday/bsvc}Academic_RankObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_Rank_Request_ReferencesType", propOrder = {
    "academicRankReference"
})
public class AcademicRankRequestReferencesType {

    @XmlElement(name = "Academic_Rank_Reference", required = true)
    protected List<AcademicRankObjectType> academicRankReference;

    /**
     * Gets the value of the academicRankReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicRankReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicRankReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicRankObjectType }
     * 
     * 
     */
    public List<AcademicRankObjectType> getAcademicRankReference() {
        if (academicRankReference == null) {
            academicRankReference = new ArrayList<AcademicRankObjectType>();
        }
        return this.academicRankReference;
    }

}
