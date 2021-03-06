//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 08:30:26 AM EET 
//


package com.kobil.ssms.asm.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statisticTypeInfo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statisticTypeInfo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APP_CLIENT_TYPES"/>
 *     &lt;enumeration value="APP_CLIENT_VERSIONS"/>
 *     &lt;enumeration value="FIRMWARE_VERSIONS"/>
 *     &lt;enumeration value="DEVICE_RISKS"/>
 *     &lt;enumeration value="DEVICE_TYPES"/>
 *     &lt;enumeration value="LOCKED_USERS"/>
 *     &lt;enumeration value="LOCKED_DEVICES"/>
 *     &lt;enumeration value="OS_VERSIONS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statisticTypeInfo")
@XmlEnum
public enum StatisticTypeInfo {

    APP_CLIENT_TYPES,
    APP_CLIENT_VERSIONS,
    FIRMWARE_VERSIONS,
    DEVICE_RISKS,
    DEVICE_TYPES,
    LOCKED_USERS,
    LOCKED_DEVICES,
    OS_VERSIONS;

    public String value() {
        return name();
    }

    public static StatisticTypeInfo fromValue(String v) {
        return valueOf(v);
    }

}
