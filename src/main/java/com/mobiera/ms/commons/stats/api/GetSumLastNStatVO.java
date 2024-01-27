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
public class GetSumLastNStatVO implements Serializable
{
	
	
	private static final long serialVersionUID = 1241060034966633284L;
	
	
	
	private String statClass;
	private Long entityId;
	private StatGranularity statGranularity;
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant currentDateTime;
	private Integer n;
	public String getStatClass() {
		return statClass;
	}
	public void setStatClass(String statClass) {
		this.statClass = statClass;
	}
	public Long getEntityId() {
		return entityId;
	}
	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}
	public StatGranularity getStatGranularity() {
		return statGranularity;
	}
	public void setStatGranularity(StatGranularity statGranularity) {
		this.statGranularity = statGranularity;
	}
	public Instant getCurrentDateTime() {
		return currentDateTime;
	}
	public void setCurrentDateTime(Instant currentDateTime) {
		this.currentDateTime = currentDateTime;
	}
	public Integer getN() {
		return n;
	}
	public void setN(Integer n) {
		this.n = n;
	}
	
	
	
	
	
}
