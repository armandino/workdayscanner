
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get Job Family Group Response Group
 * 
 * <p>Java class for Job_Family_Group_Response_GroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Family_Group_Response_GroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Include_Reference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Job_Profile_Info_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Family_Group_Response_GroupType", propOrder = {
    "includeReference",
    "includeJobProfileInfoData"
})
public class JobFamilyGroupResponseGroupType {

    @XmlElement(name = "Include_Reference")
    protected Boolean includeReference;
    @XmlElement(name = "Include_Job_Profile_Info_Data")
    protected Boolean includeJobProfileInfoData;

    /**
     * Gets the value of the includeReference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeReference() {
        return includeReference;
    }

    /**
     * Sets the value of the includeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeReference(Boolean value) {
        this.includeReference = value;
    }

    /**
     * Gets the value of the includeJobProfileInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeJobProfileInfoData() {
        return includeJobProfileInfoData;
    }

    /**
     * Sets the value of the includeJobProfileInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeJobProfileInfoData(Boolean value) {
        this.includeJobProfileInfoData = value;
    }

}
