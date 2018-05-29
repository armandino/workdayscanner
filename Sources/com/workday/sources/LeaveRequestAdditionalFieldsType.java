
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Leave Request Additional Fields
 * 
 * <p>Java class for Leave_Request_Additional_FieldsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Leave_Request_Additional_FieldsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Last_Date_for_Which_Paid" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Expected_Due_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Child_s_Birth_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Stillbirth_Baby_Deceased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Date_Baby_Arrived_Home_From_Hospital" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Adoption_Placement_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Adoption_Notification_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Date_Child_Entered_Country" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Multiple_Child_Indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Number_of_Babies_Adopted_Children" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="2"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Number_of_Previous_Births" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="2"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Number_of_Previous_Maternity_Leaves" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="2"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Number_of_Child_Dependents" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="2"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Single_Parent_Indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Age_of_Dependent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Work_Related" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Stop_Payment_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Social_Security_Disability_Code" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Location_During_Leave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Caesarean_Section_Birth" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Leave_Percentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Week_of_Confinement" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Leave_Entitlement_Override" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Date_of_Recall" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Leave_Request_Additional_FieldsType", propOrder = {
    "lastDateForWhichPaid",
    "expectedDueDate",
    "childSBirthDate",
    "stillbirthBabyDeceased",
    "dateBabyArrivedHomeFromHospital",
    "adoptionPlacementDate",
    "adoptionNotificationDate",
    "dateChildEnteredCountry",
    "multipleChildIndicator",
    "numberOfBabiesAdoptedChildren",
    "numberOfPreviousBirths",
    "numberOfPreviousMaternityLeaves",
    "numberOfChildDependents",
    "singleParentIndicator",
    "ageOfDependent",
    "workRelated",
    "stopPaymentDate",
    "socialSecurityDisabilityCode",
    "locationDuringLeave",
    "caesareanSectionBirth",
    "leavePercentage",
    "weekOfConfinement",
    "leaveEntitlementOverride",
    "dateOfRecall"
})
public class LeaveRequestAdditionalFieldsType {

    @XmlElement(name = "Last_Date_for_Which_Paid")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDateForWhichPaid;
    @XmlElement(name = "Expected_Due_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedDueDate;
    @XmlElement(name = "Child_s_Birth_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar childSBirthDate;
    @XmlElement(name = "Stillbirth_Baby_Deceased")
    protected Boolean stillbirthBabyDeceased;
    @XmlElement(name = "Date_Baby_Arrived_Home_From_Hospital")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateBabyArrivedHomeFromHospital;
    @XmlElement(name = "Adoption_Placement_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar adoptionPlacementDate;
    @XmlElement(name = "Adoption_Notification_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar adoptionNotificationDate;
    @XmlElement(name = "Date_Child_Entered_Country")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateChildEnteredCountry;
    @XmlElement(name = "Multiple_Child_Indicator")
    protected Boolean multipleChildIndicator;
    @XmlElement(name = "Number_of_Babies_Adopted_Children")
    protected BigDecimal numberOfBabiesAdoptedChildren;
    @XmlElement(name = "Number_of_Previous_Births")
    protected BigDecimal numberOfPreviousBirths;
    @XmlElement(name = "Number_of_Previous_Maternity_Leaves")
    protected BigDecimal numberOfPreviousMaternityLeaves;
    @XmlElement(name = "Number_of_Child_Dependents")
    protected BigDecimal numberOfChildDependents;
    @XmlElement(name = "Single_Parent_Indicator")
    protected Boolean singleParentIndicator;
    @XmlElement(name = "Age_of_Dependent")
    protected BigDecimal ageOfDependent;
    @XmlElement(name = "Work_Related")
    protected Boolean workRelated;
    @XmlElement(name = "Stop_Payment_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stopPaymentDate;
    @XmlElement(name = "Social_Security_Disability_Code")
    protected String socialSecurityDisabilityCode;
    @XmlElement(name = "Location_During_Leave")
    protected String locationDuringLeave;
    @XmlElement(name = "Caesarean_Section_Birth")
    protected Boolean caesareanSectionBirth;
    @XmlElement(name = "Leave_Percentage")
    protected BigDecimal leavePercentage;
    @XmlElement(name = "Week_of_Confinement")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar weekOfConfinement;
    @XmlElement(name = "Leave_Entitlement_Override")
    protected BigDecimal leaveEntitlementOverride;
    @XmlElement(name = "Date_of_Recall")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfRecall;

    /**
     * Gets the value of the lastDateForWhichPaid property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDateForWhichPaid() {
        return lastDateForWhichPaid;
    }

    /**
     * Sets the value of the lastDateForWhichPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDateForWhichPaid(XMLGregorianCalendar value) {
        this.lastDateForWhichPaid = value;
    }

    /**
     * Gets the value of the expectedDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDueDate() {
        return expectedDueDate;
    }

    /**
     * Sets the value of the expectedDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDueDate(XMLGregorianCalendar value) {
        this.expectedDueDate = value;
    }

    /**
     * Gets the value of the childSBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChildSBirthDate() {
        return childSBirthDate;
    }

    /**
     * Sets the value of the childSBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChildSBirthDate(XMLGregorianCalendar value) {
        this.childSBirthDate = value;
    }

    /**
     * Gets the value of the stillbirthBabyDeceased property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStillbirthBabyDeceased() {
        return stillbirthBabyDeceased;
    }

    /**
     * Sets the value of the stillbirthBabyDeceased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStillbirthBabyDeceased(Boolean value) {
        this.stillbirthBabyDeceased = value;
    }

    /**
     * Gets the value of the dateBabyArrivedHomeFromHospital property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateBabyArrivedHomeFromHospital() {
        return dateBabyArrivedHomeFromHospital;
    }

    /**
     * Sets the value of the dateBabyArrivedHomeFromHospital property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateBabyArrivedHomeFromHospital(XMLGregorianCalendar value) {
        this.dateBabyArrivedHomeFromHospital = value;
    }

    /**
     * Gets the value of the adoptionPlacementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdoptionPlacementDate() {
        return adoptionPlacementDate;
    }

    /**
     * Sets the value of the adoptionPlacementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdoptionPlacementDate(XMLGregorianCalendar value) {
        this.adoptionPlacementDate = value;
    }

    /**
     * Gets the value of the adoptionNotificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdoptionNotificationDate() {
        return adoptionNotificationDate;
    }

    /**
     * Sets the value of the adoptionNotificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdoptionNotificationDate(XMLGregorianCalendar value) {
        this.adoptionNotificationDate = value;
    }

    /**
     * Gets the value of the dateChildEnteredCountry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateChildEnteredCountry() {
        return dateChildEnteredCountry;
    }

    /**
     * Sets the value of the dateChildEnteredCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateChildEnteredCountry(XMLGregorianCalendar value) {
        this.dateChildEnteredCountry = value;
    }

    /**
     * Gets the value of the multipleChildIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipleChildIndicator() {
        return multipleChildIndicator;
    }

    /**
     * Sets the value of the multipleChildIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleChildIndicator(Boolean value) {
        this.multipleChildIndicator = value;
    }

    /**
     * Gets the value of the numberOfBabiesAdoptedChildren property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfBabiesAdoptedChildren() {
        return numberOfBabiesAdoptedChildren;
    }

    /**
     * Sets the value of the numberOfBabiesAdoptedChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfBabiesAdoptedChildren(BigDecimal value) {
        this.numberOfBabiesAdoptedChildren = value;
    }

    /**
     * Gets the value of the numberOfPreviousBirths property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfPreviousBirths() {
        return numberOfPreviousBirths;
    }

    /**
     * Sets the value of the numberOfPreviousBirths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfPreviousBirths(BigDecimal value) {
        this.numberOfPreviousBirths = value;
    }

    /**
     * Gets the value of the numberOfPreviousMaternityLeaves property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfPreviousMaternityLeaves() {
        return numberOfPreviousMaternityLeaves;
    }

    /**
     * Sets the value of the numberOfPreviousMaternityLeaves property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfPreviousMaternityLeaves(BigDecimal value) {
        this.numberOfPreviousMaternityLeaves = value;
    }

    /**
     * Gets the value of the numberOfChildDependents property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfChildDependents() {
        return numberOfChildDependents;
    }

    /**
     * Sets the value of the numberOfChildDependents property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfChildDependents(BigDecimal value) {
        this.numberOfChildDependents = value;
    }

    /**
     * Gets the value of the singleParentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSingleParentIndicator() {
        return singleParentIndicator;
    }

    /**
     * Sets the value of the singleParentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSingleParentIndicator(Boolean value) {
        this.singleParentIndicator = value;
    }

    /**
     * Gets the value of the ageOfDependent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgeOfDependent() {
        return ageOfDependent;
    }

    /**
     * Sets the value of the ageOfDependent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgeOfDependent(BigDecimal value) {
        this.ageOfDependent = value;
    }

    /**
     * Gets the value of the workRelated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkRelated() {
        return workRelated;
    }

    /**
     * Sets the value of the workRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkRelated(Boolean value) {
        this.workRelated = value;
    }

    /**
     * Gets the value of the stopPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStopPaymentDate() {
        return stopPaymentDate;
    }

    /**
     * Sets the value of the stopPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStopPaymentDate(XMLGregorianCalendar value) {
        this.stopPaymentDate = value;
    }

    /**
     * Gets the value of the socialSecurityDisabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityDisabilityCode() {
        return socialSecurityDisabilityCode;
    }

    /**
     * Sets the value of the socialSecurityDisabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityDisabilityCode(String value) {
        this.socialSecurityDisabilityCode = value;
    }

    /**
     * Gets the value of the locationDuringLeave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDuringLeave() {
        return locationDuringLeave;
    }

    /**
     * Sets the value of the locationDuringLeave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDuringLeave(String value) {
        this.locationDuringLeave = value;
    }

    /**
     * Gets the value of the caesareanSectionBirth property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCaesareanSectionBirth() {
        return caesareanSectionBirth;
    }

    /**
     * Sets the value of the caesareanSectionBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaesareanSectionBirth(Boolean value) {
        this.caesareanSectionBirth = value;
    }

    /**
     * Gets the value of the leavePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLeavePercentage() {
        return leavePercentage;
    }

    /**
     * Sets the value of the leavePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLeavePercentage(BigDecimal value) {
        this.leavePercentage = value;
    }

    /**
     * Gets the value of the weekOfConfinement property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWeekOfConfinement() {
        return weekOfConfinement;
    }

    /**
     * Sets the value of the weekOfConfinement property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWeekOfConfinement(XMLGregorianCalendar value) {
        this.weekOfConfinement = value;
    }

    /**
     * Gets the value of the leaveEntitlementOverride property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLeaveEntitlementOverride() {
        return leaveEntitlementOverride;
    }

    /**
     * Sets the value of the leaveEntitlementOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLeaveEntitlementOverride(BigDecimal value) {
        this.leaveEntitlementOverride = value;
    }

    /**
     * Gets the value of the dateOfRecall property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfRecall() {
        return dateOfRecall;
    }

    /**
     * Sets the value of the dateOfRecall property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfRecall(XMLGregorianCalendar value) {
        this.dateOfRecall = value;
    }

}
