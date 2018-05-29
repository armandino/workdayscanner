
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference Letter Event Element
 * 
 * <p>Java class for Reference_Letter_Event_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reference_Letter_Event_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType"/>
 *         &lt;element name="Document_Language_Reference" type="{urn:com.workday/bsvc}User_LanguageObjectType" minOccurs="0"/>
 *         &lt;element name="Template_Reference" type="{urn:com.workday/bsvc}Reference_Letter_TemplateObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference_Letter_Event_DataType", propOrder = {
    "workerReference",
    "documentLanguageReference",
    "templateReference"
})
public class ReferenceLetterEventDataType {

    @XmlElement(name = "Worker_Reference", required = true)
    protected WorkerObjectType workerReference;
    @XmlElement(name = "Document_Language_Reference")
    protected UserLanguageObjectType documentLanguageReference;
    @XmlElement(name = "Template_Reference", required = true)
    protected ReferenceLetterTemplateObjectType templateReference;

    /**
     * Gets the value of the workerReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerObjectType }
     *     
     */
    public WorkerObjectType getWorkerReference() {
        return workerReference;
    }

    /**
     * Sets the value of the workerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerObjectType }
     *     
     */
    public void setWorkerReference(WorkerObjectType value) {
        this.workerReference = value;
    }

    /**
     * Gets the value of the documentLanguageReference property.
     * 
     * @return
     *     possible object is
     *     {@link UserLanguageObjectType }
     *     
     */
    public UserLanguageObjectType getDocumentLanguageReference() {
        return documentLanguageReference;
    }

    /**
     * Sets the value of the documentLanguageReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLanguageObjectType }
     *     
     */
    public void setDocumentLanguageReference(UserLanguageObjectType value) {
        this.documentLanguageReference = value;
    }

    /**
     * Gets the value of the templateReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLetterTemplateObjectType }
     *     
     */
    public ReferenceLetterTemplateObjectType getTemplateReference() {
        return templateReference;
    }

    /**
     * Sets the value of the templateReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLetterTemplateObjectType }
     *     
     */
    public void setTemplateReference(ReferenceLetterTemplateObjectType value) {
        this.templateReference = value;
    }

}
