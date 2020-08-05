//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 08:30:26 AM EET 
//


package com.kobil.ssms.asm.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reportingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reportingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moreResultsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="reportingFilterUsed" type="{http://ws.asm.ssms.kobil.com/}reportingFilter" minOccurs="0"/>
 *         &lt;element name="reportingInfoItems" type="{http://ws.asm.ssms.kobil.com/}reportingInfoItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reportingInfo", propOrder = {
    "moreResultsAvailable",
    "reportingFilterUsed",
    "reportingInfoItems"
})
public class ReportingInfo {

    protected boolean moreResultsAvailable;
    protected ReportingFilter reportingFilterUsed;
    @XmlElement(nillable = true)
    protected List<ReportingInfoItem> reportingInfoItems;

    /**
     * Gets the value of the moreResultsAvailable property.
     * 
     */
    public boolean isMoreResultsAvailable() {
        return moreResultsAvailable;
    }

    /**
     * Sets the value of the moreResultsAvailable property.
     * 
     */
    public void setMoreResultsAvailable(boolean value) {
        this.moreResultsAvailable = value;
    }

    /**
     * Gets the value of the reportingFilterUsed property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingFilter }
     *     
     */
    public ReportingFilter getReportingFilterUsed() {
        return reportingFilterUsed;
    }

    /**
     * Sets the value of the reportingFilterUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingFilter }
     *     
     */
    public void setReportingFilterUsed(ReportingFilter value) {
        this.reportingFilterUsed = value;
    }

    /**
     * Gets the value of the reportingInfoItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportingInfoItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportingInfoItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportingInfoItem }
     * 
     * 
     */
    public List<ReportingInfoItem> getReportingInfoItems() {
        if (reportingInfoItems == null) {
            reportingInfoItems = new ArrayList<ReportingInfoItem>();
        }
        return this.reportingInfoItems;
    }

}
