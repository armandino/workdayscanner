
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating Element for the Collective Agreement Snapshot Data.
 * 
 * <p>Java class for Collective_Agreement_Factor_Parameter_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Collective_Agreement_Factor_Parameter_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Order" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Collective_Agreement_Factor_Reference" type="{urn:com.workday/bsvc}Collective_Agreement_FactorObjectType" minOccurs="0"/>
 *         &lt;element name="Collective_Agreement_Factor_Option_Reference" type="{urn:com.workday/bsvc}Collective_Agreement_Factor_OptionObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collective_Agreement_Factor_Parameter_DataType", propOrder = {
    "order",
    "collectiveAgreementFactorReference",
    "collectiveAgreementFactorOptionReference"
})
public class CollectiveAgreementFactorParameterDataType {

    @XmlElement(name = "Order")
    protected String order;
    @XmlElement(name = "Collective_Agreement_Factor_Reference")
    protected CollectiveAgreementFactorObjectType collectiveAgreementFactorReference;
    @XmlElement(name = "Collective_Agreement_Factor_Option_Reference")
    protected List<CollectiveAgreementFactorOptionObjectType> collectiveAgreementFactorOptionReference;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

    /**
     * Gets the value of the collectiveAgreementFactorReference property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveAgreementFactorObjectType }
     *     
     */
    public CollectiveAgreementFactorObjectType getCollectiveAgreementFactorReference() {
        return collectiveAgreementFactorReference;
    }

    /**
     * Sets the value of the collectiveAgreementFactorReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveAgreementFactorObjectType }
     *     
     */
    public void setCollectiveAgreementFactorReference(CollectiveAgreementFactorObjectType value) {
        this.collectiveAgreementFactorReference = value;
    }

    /**
     * Gets the value of the collectiveAgreementFactorOptionReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectiveAgreementFactorOptionReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectiveAgreementFactorOptionReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectiveAgreementFactorOptionObjectType }
     * 
     * 
     */
    public List<CollectiveAgreementFactorOptionObjectType> getCollectiveAgreementFactorOptionReference() {
        if (collectiveAgreementFactorOptionReference == null) {
            collectiveAgreementFactorOptionReference = new ArrayList<CollectiveAgreementFactorOptionObjectType>();
        }
        return this.collectiveAgreementFactorOptionReference;
    }

}
