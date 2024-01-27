package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;

@JsonInclude(Include.NON_NULL)
public class GetTestView implements Serializable
{
	
	
	private static final long serialVersionUID = 1241060034966633284L;
	
	
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant from;
	
	
	public Instant getFrom() {
		return from;
	}
	public void setFrom(Instant from) {
		this.from = from;
	}
	
	
}
