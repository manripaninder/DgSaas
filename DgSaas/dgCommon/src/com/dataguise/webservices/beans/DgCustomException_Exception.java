package com.dataguise.webservices.beans;

import javax.xml.ws.WebFault;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "DgCustomException", targetNamespace = "http://masker.webservices.dataguise.com/")
public class DgCustomException_Exception extends Exception {

	/**
	 * Java type that goes as soapenv:Fault detail element.
	 * 
	 */
	private DgCustomException faultInfo;

	/**
	 * 
	 * @param message
	 * @param faultInfo
	 */
	public DgCustomException_Exception(String message,
			DgCustomException faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @param message
	 * @param faultInfo
	 * @param cause
	 */
	public DgCustomException_Exception(String message,
			DgCustomException faultInfo, Throwable cause) {
		super(message, cause);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @return returns fault bean:
	 *         com.dataguise.webservices.beans.DgCustomException
	 */
	public DgCustomException getFaultInfo() {
		return faultInfo;
	}

}
