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
 * <p>Java class for createActivationCodeEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createActivationCodeEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activationCodeParam" type="{http://ws.asm.ssms.kobil.com/}activationCodeParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createActivationCodeEx", propOrder = {
    "activationCodeParam"
})
public class CreateActivationCodeEx {

    protected ActivationCodeParam activationCodeParam;

    /**
     * Gets the value of the activationCodeParam property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationCodeParam }
     *     
     */
    public ActivationCodeParam getActivationCodeParam() {
        return activationCodeParam;
    }

    /**
     * Sets the value of the activationCodeParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationCodeParam }
     *     
     */
    public void setActivationCodeParam(ActivationCodeParam value) {
        this.activationCodeParam = value;
    }

}
