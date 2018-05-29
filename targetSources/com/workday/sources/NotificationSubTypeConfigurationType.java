
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Notification sub type configuration for each notification sub type
 * 
 * <p>Java class for Notification_Sub_Type_ConfigurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Notification_Sub_Type_ConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Notification_Sub_Type_Reference" type="{urn:com.workday/bsvc}Notification_CategorizableObjectType" minOccurs="0"/>
 *         &lt;element name="Notification_channels_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notification_Sub_Type_ConfigurationType", propOrder = {
    "notificationSubTypeReference",
    "notificationChannelsReference"
})
public class NotificationSubTypeConfigurationType {

    @XmlElement(name = "Notification_Sub_Type_Reference")
    protected NotificationCategorizableObjectType notificationSubTypeReference;
    @XmlElement(name = "Notification_channels_Reference")
    protected List<UniqueIdentifierObjectType> notificationChannelsReference;

    /**
     * Gets the value of the notificationSubTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationCategorizableObjectType }
     *     
     */
    public NotificationCategorizableObjectType getNotificationSubTypeReference() {
        return notificationSubTypeReference;
    }

    /**
     * Sets the value of the notificationSubTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationCategorizableObjectType }
     *     
     */
    public void setNotificationSubTypeReference(NotificationCategorizableObjectType value) {
        this.notificationSubTypeReference = value;
    }

    /**
     * Gets the value of the notificationChannelsReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationChannelsReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationChannelsReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIdentifierObjectType }
     * 
     * 
     */
    public List<UniqueIdentifierObjectType> getNotificationChannelsReference() {
        if (notificationChannelsReference == null) {
            notificationChannelsReference = new ArrayList<UniqueIdentifierObjectType>();
        }
        return this.notificationChannelsReference;
    }

}
