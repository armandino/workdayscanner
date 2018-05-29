
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Personal data for the former worker.
 * 
 * <p>Java class for Former_Worker_Personal_Information_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Former_Worker_Personal_Information_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name_Data" type="{urn:com.workday/bsvc}Person_Name_DataType" minOccurs="0"/>
 *         &lt;element name="Birth_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Ethnicity_Reference" type="{urn:com.workday/bsvc}EthnicityObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Hispanic_or_Latino" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Contact_Information_Data" type="{urn:com.workday/bsvc}Contact_Information_DataType" minOccurs="0"/>
 *         &lt;element name="National_Identifier_Data" type="{urn:com.workday/bsvc}National_IDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Former_Worker_Personal_Information_DataType", propOrder = {
    "nameData",
    "birthDate",
    "ethnicityReference",
    "hispanicOrLatino",
    "contactInformationData",
    "nationalIdentifierData"
})
public class FormerWorkerPersonalInformationDataType {

    @XmlElement(name = "Name_Data")
    protected PersonNameDataType nameData;
    @XmlElement(name = "Birth_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "Ethnicity_Reference")
    protected List<EthnicityObjectType> ethnicityReference;
    @XmlElement(name = "Hispanic_or_Latino")
    protected Boolean hispanicOrLatino;
    @XmlElement(name = "Contact_Information_Data")
    protected ContactInformationDataType contactInformationData;
    @XmlElement(name = "National_Identifier_Data")
    protected List<NationalIDType> nationalIdentifierData;

    /**
     * Gets the value of the nameData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameDataType }
     *     
     */
    public PersonNameDataType getNameData() {
        return nameData;
    }

    /**
     * Sets the value of the nameData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameDataType }
     *     
     */
    public void setNameData(PersonNameDataType value) {
        this.nameData = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the ethnicityReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ethnicityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEthnicityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EthnicityObjectType }
     * 
     * 
     */
    public List<EthnicityObjectType> getEthnicityReference() {
        if (ethnicityReference == null) {
            ethnicityReference = new ArrayList<EthnicityObjectType>();
        }
        return this.ethnicityReference;
    }

    /**
     * Gets the value of the hispanicOrLatino property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHispanicOrLatino() {
        return hispanicOrLatino;
    }

    /**
     * Sets the value of the hispanicOrLatino property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHispanicOrLatino(Boolean value) {
        this.hispanicOrLatino = value;
    }

    /**
     * Gets the value of the contactInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationDataType }
     *     
     */
    public ContactInformationDataType getContactInformationData() {
        return contactInformationData;
    }

    /**
     * Sets the value of the contactInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationDataType }
     *     
     */
    public void setContactInformationData(ContactInformationDataType value) {
        this.contactInformationData = value;
    }

    /**
     * Gets the value of the nationalIdentifierData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalIdentifierData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalIdentifierData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NationalIDType }
     * 
     * 
     */
    public List<NationalIDType> getNationalIdentifierData() {
        if (nationalIdentifierData == null) {
            nationalIdentifierData = new ArrayList<NationalIDType>();
        }
        return this.nationalIdentifierData;
    }

}
