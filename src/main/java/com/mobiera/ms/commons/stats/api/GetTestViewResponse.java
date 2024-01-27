package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GetTestViewResponse implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6297798713620249354L;
	private String errorMessage;
	private String testRes;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getTestRes() {
		return testRes;
	}
	public void setTestRes(String testRes) {
		this.testRes = testRes;
	}
	
	
	


}
