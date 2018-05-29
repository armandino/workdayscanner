
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The overall section evaluation information (rating, comments) for the evaluator.
 * 
 * <p>Java class for Overall_Evaluation_Detail_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Overall_Evaluation_Detail_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rating_Reference" type="{urn:com.workday/bsvc}Review_RatingObjectType" minOccurs="0"/>
 *         &lt;element name="Comment" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Overall_Evaluation_Detail_DataType", propOrder = {
    "ratingReference",
    "comment"
})
public class OverallEvaluationDetailDataType {

    @XmlElement(name = "Rating_Reference")
    protected ReviewRatingObjectType ratingReference;
    @XmlElement(name = "Comment")
    protected String comment;

    /**
     * Gets the value of the ratingReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReviewRatingObjectType }
     *     
     */
    public ReviewRatingObjectType getRatingReference() {
        return ratingReference;
    }

    /**
     * Sets the value of the ratingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewRatingObjectType }
     *     
     */
    public void setRatingReference(ReviewRatingObjectType value) {
        this.ratingReference = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
