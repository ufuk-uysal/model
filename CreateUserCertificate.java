//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 08:30:26 AM EET 
//


package com.kobil.ssms.asm.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createUserCertificate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createUserCertificate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="certProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pkcs10B64" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUserCertificate", propOrder = {
    "certProfile",
    "pkcs10B64"
})
public class CreateUserCertificate {

    @XmlElement(required = true)
    protected String certProfile;
    @XmlElement(required = true)
    protected String pkcs10B64;

    /**
     * Gets the value of the certProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertProfile() {
        return certProfile;
    }

    /**
     * Sets the value of the certProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertProfile(String value) {
        this.certProfile = value;
    }

    /**
     * Gets the value of the pkcs10B64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkcs10B64() {
        return pkcs10B64;
    }

    /**
     * Sets the value of the pkcs10B64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkcs10B64(String value) {
        this.pkcs10B64 = value;
    }

}
