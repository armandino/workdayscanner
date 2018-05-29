
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Worker Personal data.
 * 
 * <p>Java class for Worker_Personal_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Personal_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name_Data" type="{urn:com.workday/bsvc}Name_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contact_Data" type="{urn:com.workday/bsvc}Contact_DataType" minOccurs="0"/>
 *         &lt;element name="Biographic_Data" type="{urn:com.workday/bsvc}Biographic_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Demographic_Data" type="{urn:com.workday/bsvc}Demographic_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Personal_DataType", propOrder = {
    "nameData",
    "contactData",
    "biographicData",
    "demographicData"
})
public class WorkerPersonalDataType {

    @XmlElement(name = "Name_Data")
    protected List<NameDataType> nameData;
    @XmlElement(name = "Contact_Data")
    protected ContactDataType contactData;
    @XmlElement(name = "Biographic_Data")
    protected List<BiographicDataType> biographicData;
    @XmlElement(name = "Demographic_Data")
    protected List<DemographicDataType> demographicData;

    /**
     * Gets the value of the nameData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameDataType }
     * 
     * 
     */
    public List<NameDataType> getNameData() {
        if (nameData == null) {
            nameData = new ArrayList<NameDataType>();
        }
        return this.nameData;
    }

    /**
     * Gets the value of the contactData property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDataType }
     *     
     */
    public ContactDataType getContactData() {
        return contactData;
    }

    /**
     * Sets the value of the contactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDataType }
     *     
     */
    public void setContactData(ContactDataType value) {
        this.contactData = value;
    }

    /**
     * Gets the value of the biographicData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the biographicData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBiographicData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BiographicDataType }
     * 
     * 
     */
    public List<BiographicDataType> getBiographicData() {
        if (biographicData == null) {
            biographicData = new ArrayList<BiographicDataType>();
        }
        return this.biographicData;
    }

    /**
     * Gets the value of the demographicData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demographicData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemographicData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DemographicDataType }
     * 
     * 
     */
    public List<DemographicDataType> getDemographicData() {
        if (demographicData == null) {
            demographicData = new ArrayList<DemographicDataType>();
        }
        return this.demographicData;
    }

}
