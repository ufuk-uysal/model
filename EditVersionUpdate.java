//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 08:30:26 AM EET 
//


package com.kobil.ssms.asm.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for editVersionUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editVersionUpdate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versionUpdateParam" type="{http://ws.asm.ssms.kobil.com/}versionUpdateParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editVersionUpdate", propOrder = {
    "versionUpdateParam"
})
public class EditVersionUpdate {

    protected VersionUpdateParam versionUpdateParam;

    /**
     * Gets the value of the versionUpdateParam property.
     * 
     * @return
     *     possible object is
     *     {@link VersionUpdateParam }
     *     
     */
    public VersionUpdateParam getVersionUpdateParam() {
        return versionUpdateParam;
    }

    /**
     * Sets the value of the versionUpdateParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionUpdateParam }
     *     
     */
    public void setVersionUpdateParam(VersionUpdateParam value) {
        this.versionUpdateParam = value;
    }

}
