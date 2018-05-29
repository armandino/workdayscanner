
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the components of a name in local script, such as the First Name and Last Name, for supporting countries.
 * 
 * <p>Java class for Local_Person_Name_Detail_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Local_Person_Name_Detail_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="First_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Middle_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Secondary_Last_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="First_Name_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Middle_Name_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Name_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Secondary_Last_Name_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Local_Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Local_Script" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Local_Person_Name_Detail_DataType", propOrder = {
    "firstName",
    "middleName",
    "lastName",
    "secondaryLastName",
    "firstName2",
    "middleName2",
    "lastName2",
    "secondaryLastName2"
})
public class LocalPersonNameDetailDataType {

    @XmlElement(name = "First_Name")
    protected String firstName;
    @XmlElement(name = "Middle_Name")
    protected String middleName;
    @XmlElement(name = "Last_Name")
    protected String lastName;
    @XmlElement(name = "Secondary_Last_Name")
    protected String secondaryLastName;
    @XmlElement(name = "First_Name_2")
    protected String firstName2;
    @XmlElement(name = "Middle_Name_2")
    protected String middleName2;
    @XmlElement(name = "Last_Name_2")
    protected String lastName2;
    @XmlElement(name = "Secondary_Last_Name_2")
    protected String secondaryLastName2;
    @XmlAttribute(name = "Local_Name", namespace = "urn:com.workday/bsvc")
    protected String localName;
    @XmlAttribute(name = "Local_Script", namespace = "urn:com.workday/bsvc")
    protected String localScript;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the secondaryLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryLastName() {
        return secondaryLastName;
    }

    /**
     * Sets the value of the secondaryLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryLastName(String value) {
        this.secondaryLastName = value;
    }

    /**
     * Gets the value of the firstName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName2() {
        return firstName2;
    }

    /**
     * Sets the value of the firstName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName2(String value) {
        this.firstName2 = value;
    }

    /**
     * Gets the value of the middleName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName2() {
        return middleName2;
    }

    /**
     * Sets the value of the middleName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName2(String value) {
        this.middleName2 = value;
    }

    /**
     * Gets the value of the lastName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     * Sets the value of the lastName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName2(String value) {
        this.lastName2 = value;
    }

    /**
     * Gets the value of the secondaryLastName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryLastName2() {
        return secondaryLastName2;
    }

    /**
     * Sets the value of the secondaryLastName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryLastName2(String value) {
        this.secondaryLastName2 = value;
    }

    /**
     * Gets the value of the localName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * Sets the value of the localName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalName(String value) {
        this.localName = value;
    }

    /**
     * Gets the value of the localScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalScript() {
        return localScript;
    }

    /**
     * Sets the value of the localScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalScript(String value) {
        this.localScript = value;
    }

}
