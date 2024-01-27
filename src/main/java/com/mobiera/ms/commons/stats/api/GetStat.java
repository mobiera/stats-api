package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(Include.NON_NULL)
public class GetStat implements Serializable {

	private static final long serialVersionUID = 4829415845298862375L;

	private Instant ts;
	private Long entityFk;
	private StatGranularity statGranularity;
	private String statClass;
	
	public Instant getTs() {
		return ts;
	}
	public void setTs(Instant ts) {
		this.ts = ts;
	}
	public Long getEntityFk() {
		return entityFk;
	}
	public void setEntityFk(Long entityFk) {
		this.entityFk = entityFk;
	}
	public StatGranularity getStatGranularity() {
		return statGranularity;
	}
	public void setStatGranularity(StatGranularity statGranularity) {
		this.statGranularity = statGranularity;
	}
	public String getStatClass() {
		return statClass;
	}
	public void setStatClass(String statClass) {
		this.statClass = statClass;
	}
	
		
	
}
