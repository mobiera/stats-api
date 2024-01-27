package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;

@JsonInclude(Include.NON_NULL)
public class CompareStatView implements Serializable
{
	
	
	private static final long serialVersionUID = 1241061034966633284L;
	
	
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant from;
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant to;
	private List<Kpi> kpis;
	private StatGranularity statGranularity;
	private StatResultType statResultType;
	
	
	
	
	public List<Kpi> getKpis() {
		return kpis;
	}
	public void setKpis(List<Kpi> kpis) {
		this.kpis = kpis;
	}
	public StatGranularity getStatGranularity() {
		return statGranularity;
	}
	public void setStatGranularity(StatGranularity statGranularity) {
		this.statGranularity = statGranularity;
	}
	public StatResultType getStatResultType() {
		return statResultType;
	}
	public void setStatResultType(StatResultType statResultType) {
		this.statResultType = statResultType;
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
	
	
}
