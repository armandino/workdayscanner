
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Notification Type configurations for a particular user
 * 
 * <p>Java class for Notification_Sub_Category_Configurations_for_UsersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Notification_Sub_Category_Configurations_for_UsersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Notification_Sub_Type_Configuration" type="{urn:com.workday/bsvc}Notification_Sub_Type_ConfigurationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notification_Sub_Category_Configurations_for_UsersType", propOrder = {
    "notificationSubTypeConfiguration"
})
public class NotificationSubCategoryConfigurationsForUsersType {

    @XmlElement(name = "Notification_Sub_Type_Configuration")
    protected List<NotificationSubTypeConfigurationType> notificationSubTypeConfiguration;

    /**
     * Gets the value of the notificationSubTypeConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationSubTypeConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationSubTypeConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationSubTypeConfigurationType }
     * 
     * 
     */
    public List<NotificationSubTypeConfigurationType> getNotificationSubTypeConfiguration() {
        if (notificationSubTypeConfiguration == null) {
            notificationSubTypeConfiguration = new ArrayList<NotificationSubTypeConfigurationType>();
        }
        return this.notificationSubTypeConfiguration;
    }

}
