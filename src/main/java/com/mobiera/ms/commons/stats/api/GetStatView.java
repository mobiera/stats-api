package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(Include.NON_NULL)
public class GetStatView implements Serializable
{
	
	
	private static final long serialVersionUID = 1241060034966633284L;
	
	
	//@JsonSerialize(using = InstantSerializer.class)
	//@JsonDeserialize(using = InstantDeserializer.class)
	private Instant from;
	//@JsonSerialize(using = InstantSerializer.class)
	//@JsonDeserialize(using = InstantDeserializer.class)
	private Instant to;
	private List<Long> entityFks;
	private String statClass;
	private StatGranularity statGranularity;
	private StatResultType statResultType;
	@JsonDeserialize(using = StatEnumsDeserializer.class)
	@JsonSerialize(using = StatEnumsSerializer.class)
	private List<StatEnum> statEnums;
	
	public String toString() {
		
		return "from: " + from + " to: " + to + " sc: " + statClass + " sg: " + statGranularity + " sr: " + statResultType + " enums: " + statEnums + " entities: " + entityFks; 
 	}
	
	public final List<Long> getEntityFks() {
		return entityFks;
	}
	public final void setEntityFks(List<Long> entityFks) {
		this.entityFks = entityFks;
	}
	
	public final StatGranularity getStatGranularity() {
		return statGranularity;
	}
	public final void setStatGranularity(StatGranularity statGranularity) {
		this.statGranularity = statGranularity;
	}
	
	public final StatResultType getStatResultType() {
		return statResultType;
	}
	public final void setStatResultType(StatResultType statResultType) {
		this.statResultType = statResultType;
	}
	
	
	public String getStatClass() {
		return statClass;
	}
	public void setStatClass(String statClass) {
		this.statClass = statClass;
	}
	public Instant getFrom() {
		return from;
	}
	public void setFrom(Instant from) {
		this.from = from;
	}
	public Instant getTo() {
		return to;
	}
	public void setTo(Instant to) {
		this.to = to;
	}
	public List<StatEnum> getStatEnums() {
		return statEnums;
	}
	public void setStatEnums(List<StatEnum> statEnums) {
		this.statEnums = statEnums;
	}
	
	
	
}
