
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the components of a name in local script, such as the First Name and Last Name, for supporting countries.
 * 
 * <p>Java class for Local_Name_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Local_Name_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="First_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Middle_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Name" type="{urn:com.workday/bsvc}Local_Last_Name_DataType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Local_Name_DataType", propOrder = {
    "firstName",
    "middleName",
    "lastName"
})
public class LocalNameDataType {

    @XmlElement(name = "First_Name")
    protected String firstName;
    @XmlElement(name = "Middle_Name")
    protected String middleName;
    @XmlElement(name = "Last_Name")
    protected List<LocalLastNameDataType> lastName;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalLastNameDataType }
     * 
     * 
     */
    public List<LocalLastNameDataType> getLastName() {
        if (lastName == null) {
            lastName = new ArrayList<LocalLastNameDataType>();
        }
        return this.lastName;
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
