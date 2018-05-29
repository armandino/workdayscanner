
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The information about the former worker document, such as the category and file.
 * 
 * <p>Java class for Former_Worker_Attachment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Former_Worker_Attachment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="File_Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Former_Worker_Reference" type="{urn:com.workday/bsvc}Former_WorkerObjectType" minOccurs="0"/>
 *         &lt;element name="Document_Category_Reference" type="{urn:com.workday/bsvc}Document_Category__All_ObjectType" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content_Type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Former_Worker_Attachment_DataType", propOrder = {
    "id",
    "fileName",
    "file",
    "formerWorkerReference",
    "documentCategoryReference",
    "comment",
    "contentType"
})
public class FormerWorkerAttachmentDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "File_Name")
    protected String fileName;
    @XmlElement(name = "File")
    protected byte[] file;
    @XmlElement(name = "Former_Worker_Reference")
    protected FormerWorkerObjectType formerWorkerReference;
    @XmlElement(name = "Document_Category_Reference")
    protected DocumentCategoryAllObjectType documentCategoryReference;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "Content_Type")
    protected String contentType;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFile(byte[] value) {
        this.file = value;
    }

    /**
     * Gets the value of the formerWorkerReference property.
     * 
     * @return
     *     possible object is
     *     {@link FormerWorkerObjectType }
     *     
     */
    public FormerWorkerObjectType getFormerWorkerReference() {
        return formerWorkerReference;
    }

    /**
     * Sets the value of the formerWorkerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormerWorkerObjectType }
     *     
     */
    public void setFormerWorkerReference(FormerWorkerObjectType value) {
        this.formerWorkerReference = value;
    }

    /**
     * Gets the value of the documentCategoryReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentCategoryAllObjectType }
     *     
     */
    public DocumentCategoryAllObjectType getDocumentCategoryReference() {
        return documentCategoryReference;
    }

    /**
     * Sets the value of the documentCategoryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentCategoryAllObjectType }
     *     
     */
    public void setDocumentCategoryReference(DocumentCategoryAllObjectType value) {
        this.documentCategoryReference = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

}
