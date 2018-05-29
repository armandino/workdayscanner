
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The sexual orientation response data.
 * 
 * <p>Java class for Sexual_Orientation_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sexual_Orientation_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sexual_Orientation" type="{urn:com.workday/bsvc}Sexual_OrientationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sexual_Orientation_Response_DataType", propOrder = {
    "sexualOrientation"
})
public class SexualOrientationResponseDataType {

    @XmlElement(name = "Sexual_Orientation")
    protected List<SexualOrientationType> sexualOrientation;

    /**
     * Gets the value of the sexualOrientation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sexualOrientation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSexualOrientation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SexualOrientationType }
     * 
     * 
     */
    public List<SexualOrientationType> getSexualOrientation() {
        if (sexualOrientation == null) {
            sexualOrientation = new ArrayList<SexualOrientationType>();
        }
        return this.sexualOrientation;
    }

}
