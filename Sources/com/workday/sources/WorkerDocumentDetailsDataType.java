
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the details of a worker document.
 * 
 * <p>Java class for Worker_Document_Details_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Document_Details_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Document_Category_Reference" type="{urn:com.workday/bsvc}Document_Category__All_ObjectType"/>
 *         &lt;element name="Filename">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Document_Details_DataType", propOrder = {
    "documentCategoryReference",
    "filename",
    "comment",
    "file"
})
public class WorkerDocumentDetailsDataType {

    @XmlElement(name = "Document_Category_Reference", required = true)
    protected DocumentCategoryAllObjectType documentCategoryReference;
    @XmlElement(name = "Filename", required = true)
    protected String filename;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "File")
    protected byte[] file;

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
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
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

}
