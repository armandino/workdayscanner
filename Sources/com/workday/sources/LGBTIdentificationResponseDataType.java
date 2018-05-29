
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all LGBT Identification data.
 * 
 * <p>Java class for LGBT_Identification_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LGBT_Identification_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LGBT_Identification" type="{urn:com.workday/bsvc}LGBT_IdentificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LGBT_Identification_Response_DataType", propOrder = {
    "lgbtIdentification"
})
public class LGBTIdentificationResponseDataType {

    @XmlElement(name = "LGBT_Identification")
    protected List<LGBTIdentificationType> lgbtIdentification;

    /**
     * Gets the value of the lgbtIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lgbtIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLGBTIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LGBTIdentificationType }
     * 
     * 
     */
    public List<LGBTIdentificationType> getLGBTIdentification() {
        if (lgbtIdentification == null) {
            lgbtIdentification = new ArrayList<LGBTIdentificationType>();
        }
        return this.lgbtIdentification;
    }

}
