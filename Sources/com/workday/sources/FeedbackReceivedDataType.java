
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the employee's feedback received
 * 
 * <p>Java class for Feedback_Received_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Feedback_Received_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Feedback_Received" type="{urn:com.workday/bsvc}Feedback_ReceivedType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Feedback_Received_DataType", propOrder = {
    "feedbackReceived"
})
public class FeedbackReceivedDataType {

    @XmlElement(name = "Feedback_Received")
    protected List<FeedbackReceivedType> feedbackReceived;

    /**
     * Gets the value of the feedbackReceived property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedbackReceived property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedbackReceived().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedbackReceivedType }
     * 
     * 
     */
    public List<FeedbackReceivedType> getFeedbackReceived() {
        if (feedbackReceived == null) {
            feedbackReceived = new ArrayList<FeedbackReceivedType>();
        }
        return this.feedbackReceived;
    }

}
