
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element for Feedback Comments and Questions.  There can be multiple questions per request, thus multiple comments per feedback given.
 * 
 * <p>Java class for Feedback_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Feedback_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Feedback_Question" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *         &lt;element name="Feedback_Comment" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Feedback_ResponseType", propOrder = {
    "feedbackQuestion",
    "feedbackComment"
})
public class FeedbackResponseType {

    @XmlElement(name = "Feedback_Question")
    protected String feedbackQuestion;
    @XmlElement(name = "Feedback_Comment")
    protected String feedbackComment;

    /**
     * Gets the value of the feedbackQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackQuestion() {
        return feedbackQuestion;
    }

    /**
     * Sets the value of the feedbackQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackQuestion(String value) {
        this.feedbackQuestion = value;
    }

    /**
     * Gets the value of the feedbackComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackComment() {
        return feedbackComment;
    }

    /**
     * Sets the value of the feedbackComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackComment(String value) {
        this.feedbackComment = value;
    }

}
