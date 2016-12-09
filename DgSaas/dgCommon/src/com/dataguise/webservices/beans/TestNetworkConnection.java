package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for testNetworkConnection complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="testNetworkConnection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://webservices.dataguise.com/}dgSearchFileNetworkMapping" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testNetworkConnection", propOrder = { "arg0" })
public class TestNetworkConnection {

	protected DgSearchFileNetworkMapping arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link DgSearchFileNetworkMapping }
	 * 
	 */
	public DgSearchFileNetworkMapping getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link DgSearchFileNetworkMapping }
	 * 
	 */
	public void setArg0(DgSearchFileNetworkMapping value) {
		this.arg0 = value;
	}

}
