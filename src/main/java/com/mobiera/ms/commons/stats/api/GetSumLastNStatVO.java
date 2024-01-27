package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class GetSumLastNStatVO implements Serializable
{
	
	private static final long serialVersionUID = 1241060034966633284L;
	
	private String statClass;
	private String entityId;
	private StatGranularity statGranularity;
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant currentDateTime;
	private Integer n;
	
}
