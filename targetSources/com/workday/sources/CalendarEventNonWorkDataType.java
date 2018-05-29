
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element containing meal times for the Work Schedule Calendar Event.
 * 
 * <p>Java class for Calendar_Event_Non_Work_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Calendar_Event_Non_Work_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Meal_In" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="Meal_Out" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Calendar_Event_Non_Work_DataType", propOrder = {
    "mealIn",
    "mealOut"
})
public class CalendarEventNonWorkDataType {

    @XmlElement(name = "Meal_In", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar mealIn;
    @XmlElement(name = "Meal_Out", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar mealOut;

    /**
     * Gets the value of the mealIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMealIn() {
        return mealIn;
    }

    /**
     * Sets the value of the mealIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMealIn(XMLGregorianCalendar value) {
        this.mealIn = value;
    }

    /**
     * Gets the value of the mealOut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMealOut() {
        return mealOut;
    }

    /**
     * Sets the value of the mealOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMealOut(XMLGregorianCalendar value) {
        this.mealOut = value;
    }

}
