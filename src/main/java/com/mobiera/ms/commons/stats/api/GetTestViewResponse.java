package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class GetTestViewResponse implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6297798713620249354L;
	private String errorMessage;
	private String testRes;

}
