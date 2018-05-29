
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for Award and Activity information.
 * 
 * <p>Java class for Award_and_ActivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Award_and_ActivityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Award_and_Activity_Reference" type="{urn:com.workday/bsvc}AwardObjectType" minOccurs="0"/>
 *         &lt;element name="Award_and_Activity_Data" type="{urn:com.workday/bsvc}Award_and_Activity_Achievement_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Award_and_ActivityType", propOrder = {
    "awardAndActivityReference",
    "awardAndActivityData"
})
public class AwardAndActivityType {

    @XmlElement(name = "Award_and_Activity_Reference")
    protected AwardObjectType awardAndActivityReference;
    @XmlElement(name = "Award_and_Activity_Data")
    protected AwardAndActivityAchievementDataType awardAndActivityData;

    /**
     * Gets the value of the awardAndActivityReference property.
     * 
     * @return
     *     possible object is
     *     {@link AwardObjectType }
     *     
     */
    public AwardObjectType getAwardAndActivityReference() {
        return awardAndActivityReference;
    }

    /**
     * Sets the value of the awardAndActivityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardObjectType }
     *     
     */
    public void setAwardAndActivityReference(AwardObjectType value) {
        this.awardAndActivityReference = value;
    }

    /**
     * Gets the value of the awardAndActivityData property.
     * 
     * @return
     *     possible object is
     *     {@link AwardAndActivityAchievementDataType }
     *     
     */
    public AwardAndActivityAchievementDataType getAwardAndActivityData() {
        return awardAndActivityData;
    }

    /**
     * Sets the value of the awardAndActivityData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardAndActivityAchievementDataType }
     *     
     */
    public void setAwardAndActivityData(AwardAndActivityAchievementDataType value) {
        this.awardAndActivityData = value;
    }

}
