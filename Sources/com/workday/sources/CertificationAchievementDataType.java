
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
 * Wrapper element for Certification information.
 * 
 * <p>Java class for Certification_Achievement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Certification_Achievement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Certification_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remove_Certification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Certification_Reference" type="{urn:com.workday/bsvc}CertificationObjectType" minOccurs="0"/>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *         &lt;element name="Certification_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Issuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Certification_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Issued_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Expiration_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Examination_Score" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Examination_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Specialty_Achievement_Data" type="{urn:com.workday/bsvc}Specialty_Achievement_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Worker_Document_Data" type="{urn:com.workday/bsvc}Certification_Attachment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Certification_Achievement_DataType", propOrder = {
    "certificationID",
    "removeCertification",
    "certificationReference",
    "countryReference",
    "certificationName",
    "issuer",
    "certificationNumber",
    "issuedDate",
    "expirationDate",
    "examinationScore",
    "examinationDate",
    "specialtyAchievementData",
    "workerDocumentData"
})
public class CertificationAchievementDataType {

    @XmlElement(name = "Certification_ID")
    protected String certificationID;
    @XmlElement(name = "Remove_Certification")
    protected Boolean removeCertification;
    @XmlElement(name = "Certification_Reference")
    protected CertificationObjectType certificationReference;
    @XmlElement(name = "Country_Reference")
    protected CountryObjectType countryReference;
    @XmlElement(name = "Certification_Name")
    protected String certificationName;
    @XmlElement(name = "Issuer")
    protected String issuer;
    @XmlElement(name = "Certification_Number")
    protected String certificationNumber;
    @XmlElement(name = "Issued_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issuedDate;
    @XmlElement(name = "Expiration_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "Examination_Score")
    protected String examinationScore;
    @XmlElement(name = "Examination_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar examinationDate;
    @XmlElement(name = "Specialty_Achievement_Data")
    protected List<SpecialtyAchievementDataType> specialtyAchievementData;
    @XmlElement(name = "Worker_Document_Data")
    protected List<CertificationAttachmentDataType> workerDocumentData;

    /**
     * Gets the value of the certificationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationID() {
        return certificationID;
    }

    /**
     * Sets the value of the certificationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationID(String value) {
        this.certificationID = value;
    }

    /**
     * Gets the value of the removeCertification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveCertification() {
        return removeCertification;
    }

    /**
     * Sets the value of the removeCertification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveCertification(Boolean value) {
        this.removeCertification = value;
    }

    /**
     * Gets the value of the certificationReference property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationObjectType }
     *     
     */
    public CertificationObjectType getCertificationReference() {
        return certificationReference;
    }

    /**
     * Sets the value of the certificationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationObjectType }
     *     
     */
    public void setCertificationReference(CertificationObjectType value) {
        this.certificationReference = value;
    }

    /**
     * Gets the value of the countryReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryObjectType }
     *     
     */
    public CountryObjectType getCountryReference() {
        return countryReference;
    }

    /**
     * Sets the value of the countryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryObjectType }
     *     
     */
    public void setCountryReference(CountryObjectType value) {
        this.countryReference = value;
    }

    /**
     * Gets the value of the certificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationName() {
        return certificationName;
    }

    /**
     * Sets the value of the certificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationName(String value) {
        this.certificationName = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the certificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationNumber() {
        return certificationNumber;
    }

    /**
     * Sets the value of the certificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationNumber(String value) {
        this.certificationNumber = value;
    }

    /**
     * Gets the value of the issuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssuedDate() {
        return issuedDate;
    }

    /**
     * Sets the value of the issuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssuedDate(XMLGregorianCalendar value) {
        this.issuedDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the examinationScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationScore() {
        return examinationScore;
    }

    /**
     * Sets the value of the examinationScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationScore(String value) {
        this.examinationScore = value;
    }

    /**
     * Gets the value of the examinationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExaminationDate() {
        return examinationDate;
    }

    /**
     * Sets the value of the examinationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExaminationDate(XMLGregorianCalendar value) {
        this.examinationDate = value;
    }

    /**
     * Gets the value of the specialtyAchievementData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialtyAchievementData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialtyAchievementData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialtyAchievementDataType }
     * 
     * 
     */
    public List<SpecialtyAchievementDataType> getSpecialtyAchievementData() {
        if (specialtyAchievementData == null) {
            specialtyAchievementData = new ArrayList<SpecialtyAchievementDataType>();
        }
        return this.specialtyAchievementData;
    }

    /**
     * Gets the value of the workerDocumentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerDocumentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerDocumentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificationAttachmentDataType }
     * 
     * 
     */
    public List<CertificationAttachmentDataType> getWorkerDocumentData() {
        if (workerDocumentData == null) {
            workerDocumentData = new ArrayList<CertificationAttachmentDataType>();
        }
        return this.workerDocumentData;
    }

}
