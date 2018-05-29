
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Establishment References
 * 
 * <p>Java class for Establishment_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Establishment_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Establishment_Reference" type="{urn:com.workday/bsvc}EstablishmentObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Establishment_Request_ReferencesType", propOrder = {
    "establishmentReference"
})
public class EstablishmentRequestReferencesType {

    @XmlElement(name = "Establishment_Reference", required = true)
    protected List<EstablishmentObjectType> establishmentReference;

    /**
     * Gets the value of the establishmentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the establishmentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstablishmentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstablishmentObjectType }
     * 
     * 
     */
    public List<EstablishmentObjectType> getEstablishmentReference() {
        if (establishmentReference == null) {
            establishmentReference = new ArrayList<EstablishmentObjectType>();
        }
        return this.establishmentReference;
    }

}
