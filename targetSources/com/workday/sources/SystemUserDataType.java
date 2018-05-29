
package com.workday.sources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The data necessary to create or update a user's account in the Workday system.
 * 
 * <p>Java class for System_User_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="System_User_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="User_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Session_Timeout_Minutes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Account_Disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Account_Expiration_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Account_Locked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Required_New_Password_At_Next_Login" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Show_User_Name_in_Browser_Window" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Display_XML_Icon_on_Reports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Enable_Workbox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Locale_Reference" type="{urn:com.workday/bsvc}LocaleObjectType" minOccurs="0"/>
 *         &lt;element name="User_Language_Reference" type="{urn:com.workday/bsvc}User_LanguageObjectType" minOccurs="0"/>
 *         &lt;element name="Preferred_Search_Scope_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Delegated_Authentication_Integration_System_Reference" type="{urn:com.workday/bsvc}Integration_System__Audited_ObjectType" minOccurs="0"/>
 *         &lt;element name="Allow_Mixed-Language_Transactions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Notification_Sub_Type_Configurations" type="{urn:com.workday/bsvc}Notification_Sub_Category_Configurations_for_UsersType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="Generate_Random_Password" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Exempt_from_Delegated_Authentication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Passcode_Exempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Passcode_Grace_Period_Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Passcode_Grace_Period_Login_Remaining_Count" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="12"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OpenID_Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpenID_Internal_Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpenID_Connect_Internal_Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Simplified_View" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "System_User_DataType", propOrder = {
    "userName",
    "sessionTimeoutMinutes",
    "accountDisabled",
    "accountExpirationDate",
    "accountLocked",
    "requiredNewPasswordAtNextLogin",
    "showUserNameInBrowserWindow",
    "displayXMLIconOnReports",
    "enableWorkbox",
    "localeReference",
    "userLanguageReference",
    "preferredSearchScopeReference",
    "delegatedAuthenticationIntegrationSystemReference",
    "allowMixedLanguageTransactions",
    "notificationSubTypeConfigurations",
    "password",
    "generateRandomPassword",
    "exemptFromDelegatedAuthentication",
    "passcodeExempt",
    "passcodeGracePeriodEnabled",
    "passcodeGracePeriodLoginRemainingCount",
    "openIDIdentifier",
    "openIDInternalIdentifier",
    "openIDConnectInternalIdentifier",
    "simplifiedView"
})
public class SystemUserDataType {

    @XmlElement(name = "User_Name", required = true)
    protected String userName;
    @XmlElement(name = "Session_Timeout_Minutes")
    protected BigDecimal sessionTimeoutMinutes;
    @XmlElement(name = "Account_Disabled")
    protected Boolean accountDisabled;
    @XmlElement(name = "Account_Expiration_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accountExpirationDate;
    @XmlElement(name = "Account_Locked")
    protected Boolean accountLocked;
    @XmlElement(name = "Required_New_Password_At_Next_Login")
    protected Boolean requiredNewPasswordAtNextLogin;
    @XmlElement(name = "Show_User_Name_in_Browser_Window")
    protected Boolean showUserNameInBrowserWindow;
    @XmlElement(name = "Display_XML_Icon_on_Reports")
    protected Boolean displayXMLIconOnReports;
    @XmlElement(name = "Enable_Workbox")
    protected Boolean enableWorkbox;
    @XmlElement(name = "Locale_Reference")
    protected LocaleObjectType localeReference;
    @XmlElement(name = "User_Language_Reference")
    protected UserLanguageObjectType userLanguageReference;
    @XmlElement(name = "Preferred_Search_Scope_Reference")
    protected UniqueIdentifierObjectType preferredSearchScopeReference;
    @XmlElement(name = "Delegated_Authentication_Integration_System_Reference")
    protected IntegrationSystemAuditedObjectType delegatedAuthenticationIntegrationSystemReference;
    @XmlElement(name = "Allow_Mixed-Language_Transactions")
    protected Boolean allowMixedLanguageTransactions;
    @XmlElement(name = "Notification_Sub_Type_Configurations")
    protected List<NotificationSubCategoryConfigurationsForUsersType> notificationSubTypeConfigurations;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "Generate_Random_Password")
    protected Boolean generateRandomPassword;
    @XmlElement(name = "Exempt_from_Delegated_Authentication")
    protected Boolean exemptFromDelegatedAuthentication;
    @XmlElement(name = "Passcode_Exempt")
    protected Boolean passcodeExempt;
    @XmlElement(name = "Passcode_Grace_Period_Enabled")
    protected Boolean passcodeGracePeriodEnabled;
    @XmlElement(name = "Passcode_Grace_Period_Login_Remaining_Count")
    protected BigDecimal passcodeGracePeriodLoginRemainingCount;
    @XmlElement(name = "OpenID_Identifier")
    protected String openIDIdentifier;
    @XmlElement(name = "OpenID_Internal_Identifier")
    protected String openIDInternalIdentifier;
    @XmlElement(name = "OpenID_Connect_Internal_Identifier")
    protected String openIDConnectInternalIdentifier;
    @XmlElement(name = "Simplified_View")
    protected Boolean simplifiedView;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the sessionTimeoutMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSessionTimeoutMinutes() {
        return sessionTimeoutMinutes;
    }

    /**
     * Sets the value of the sessionTimeoutMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSessionTimeoutMinutes(BigDecimal value) {
        this.sessionTimeoutMinutes = value;
    }

    /**
     * Gets the value of the accountDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountDisabled() {
        return accountDisabled;
    }

    /**
     * Sets the value of the accountDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountDisabled(Boolean value) {
        this.accountDisabled = value;
    }

    /**
     * Gets the value of the accountExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccountExpirationDate() {
        return accountExpirationDate;
    }

    /**
     * Sets the value of the accountExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccountExpirationDate(XMLGregorianCalendar value) {
        this.accountExpirationDate = value;
    }

    /**
     * Gets the value of the accountLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountLocked() {
        return accountLocked;
    }

    /**
     * Sets the value of the accountLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountLocked(Boolean value) {
        this.accountLocked = value;
    }

    /**
     * Gets the value of the requiredNewPasswordAtNextLogin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiredNewPasswordAtNextLogin() {
        return requiredNewPasswordAtNextLogin;
    }

    /**
     * Sets the value of the requiredNewPasswordAtNextLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiredNewPasswordAtNextLogin(Boolean value) {
        this.requiredNewPasswordAtNextLogin = value;
    }

    /**
     * Gets the value of the showUserNameInBrowserWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowUserNameInBrowserWindow() {
        return showUserNameInBrowserWindow;
    }

    /**
     * Sets the value of the showUserNameInBrowserWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowUserNameInBrowserWindow(Boolean value) {
        this.showUserNameInBrowserWindow = value;
    }

    /**
     * Gets the value of the displayXMLIconOnReports property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayXMLIconOnReports() {
        return displayXMLIconOnReports;
    }

    /**
     * Sets the value of the displayXMLIconOnReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayXMLIconOnReports(Boolean value) {
        this.displayXMLIconOnReports = value;
    }

    /**
     * Gets the value of the enableWorkbox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableWorkbox() {
        return enableWorkbox;
    }

    /**
     * Sets the value of the enableWorkbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableWorkbox(Boolean value) {
        this.enableWorkbox = value;
    }

    /**
     * Gets the value of the localeReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocaleObjectType }
     *     
     */
    public LocaleObjectType getLocaleReference() {
        return localeReference;
    }

    /**
     * Sets the value of the localeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleObjectType }
     *     
     */
    public void setLocaleReference(LocaleObjectType value) {
        this.localeReference = value;
    }

    /**
     * Gets the value of the userLanguageReference property.
     * 
     * @return
     *     possible object is
     *     {@link UserLanguageObjectType }
     *     
     */
    public UserLanguageObjectType getUserLanguageReference() {
        return userLanguageReference;
    }

    /**
     * Sets the value of the userLanguageReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLanguageObjectType }
     *     
     */
    public void setUserLanguageReference(UserLanguageObjectType value) {
        this.userLanguageReference = value;
    }

    /**
     * Gets the value of the preferredSearchScopeReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getPreferredSearchScopeReference() {
        return preferredSearchScopeReference;
    }

    /**
     * Sets the value of the preferredSearchScopeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setPreferredSearchScopeReference(UniqueIdentifierObjectType value) {
        this.preferredSearchScopeReference = value;
    }

    /**
     * Gets the value of the delegatedAuthenticationIntegrationSystemReference property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationSystemAuditedObjectType }
     *     
     */
    public IntegrationSystemAuditedObjectType getDelegatedAuthenticationIntegrationSystemReference() {
        return delegatedAuthenticationIntegrationSystemReference;
    }

    /**
     * Sets the value of the delegatedAuthenticationIntegrationSystemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationSystemAuditedObjectType }
     *     
     */
    public void setDelegatedAuthenticationIntegrationSystemReference(IntegrationSystemAuditedObjectType value) {
        this.delegatedAuthenticationIntegrationSystemReference = value;
    }

    /**
     * Gets the value of the allowMixedLanguageTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowMixedLanguageTransactions() {
        return allowMixedLanguageTransactions;
    }

    /**
     * Sets the value of the allowMixedLanguageTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowMixedLanguageTransactions(Boolean value) {
        this.allowMixedLanguageTransactions = value;
    }

    /**
     * Gets the value of the notificationSubTypeConfigurations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationSubTypeConfigurations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationSubTypeConfigurations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationSubCategoryConfigurationsForUsersType }
     * 
     * 
     */
    public List<NotificationSubCategoryConfigurationsForUsersType> getNotificationSubTypeConfigurations() {
        if (notificationSubTypeConfigurations == null) {
            notificationSubTypeConfigurations = new ArrayList<NotificationSubCategoryConfigurationsForUsersType>();
        }
        return this.notificationSubTypeConfigurations;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the generateRandomPassword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerateRandomPassword() {
        return generateRandomPassword;
    }

    /**
     * Sets the value of the generateRandomPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerateRandomPassword(Boolean value) {
        this.generateRandomPassword = value;
    }

    /**
     * Gets the value of the exemptFromDelegatedAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExemptFromDelegatedAuthentication() {
        return exemptFromDelegatedAuthentication;
    }

    /**
     * Sets the value of the exemptFromDelegatedAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExemptFromDelegatedAuthentication(Boolean value) {
        this.exemptFromDelegatedAuthentication = value;
    }

    /**
     * Gets the value of the passcodeExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPasscodeExempt() {
        return passcodeExempt;
    }

    /**
     * Sets the value of the passcodeExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPasscodeExempt(Boolean value) {
        this.passcodeExempt = value;
    }

    /**
     * Gets the value of the passcodeGracePeriodEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPasscodeGracePeriodEnabled() {
        return passcodeGracePeriodEnabled;
    }

    /**
     * Sets the value of the passcodeGracePeriodEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPasscodeGracePeriodEnabled(Boolean value) {
        this.passcodeGracePeriodEnabled = value;
    }

    /**
     * Gets the value of the passcodeGracePeriodLoginRemainingCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPasscodeGracePeriodLoginRemainingCount() {
        return passcodeGracePeriodLoginRemainingCount;
    }

    /**
     * Sets the value of the passcodeGracePeriodLoginRemainingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPasscodeGracePeriodLoginRemainingCount(BigDecimal value) {
        this.passcodeGracePeriodLoginRemainingCount = value;
    }

    /**
     * Gets the value of the openIDIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDIdentifier() {
        return openIDIdentifier;
    }

    /**
     * Sets the value of the openIDIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDIdentifier(String value) {
        this.openIDIdentifier = value;
    }

    /**
     * Gets the value of the openIDInternalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDInternalIdentifier() {
        return openIDInternalIdentifier;
    }

    /**
     * Sets the value of the openIDInternalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDInternalIdentifier(String value) {
        this.openIDInternalIdentifier = value;
    }

    /**
     * Gets the value of the openIDConnectInternalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDConnectInternalIdentifier() {
        return openIDConnectInternalIdentifier;
    }

    /**
     * Sets the value of the openIDConnectInternalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDConnectInternalIdentifier(String value) {
        this.openIDConnectInternalIdentifier = value;
    }

    /**
     * Gets the value of the simplifiedView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSimplifiedView() {
        return simplifiedView;
    }

    /**
     * Sets the value of the simplifiedView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSimplifiedView(Boolean value) {
        this.simplifiedView = value;
    }

}
