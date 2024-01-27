package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(Include.NON_NULL)
public class StatView implements Serializable {

	private static final long serialVersionUID = 4829415845298862375L;

	private Instant from;
	private Instant to;
	private List<Long> entityFks;
	private String statClass;
	private StatGranularity statGranularity;
	@JsonDeserialize(using = StatEnumsDeserializer.class)
	@JsonSerialize(using = StatEnumsSerializer.class)
	private List<StatEnum> statEnums;
	private List<String> statLabels;
	private List<List<String>> stats;
	private List<List<Object>> numericStats;
	private List<String> sum;
	//@JsonIgnore
	private List<Object> numericSum;
	
	public final Instant getFrom() {
		return from;
	}
	public final void setFrom(Instant from) {
		this.from = from;
	}
	public final Instant getTo() {
		return to;
	}
	public final void setTo(Instant to) {
		this.to = to;
	}
	
	
	public final StatGranularity getStatGranularity() {
		return statGranularity;
	}
	public final void setStatGranularity(StatGranularity statGranularity) {
		this.statGranularity = statGranularity;
	}
	public final List<StatEnum> getStatEnums() {
		return statEnums;
	}
	public final void setStatEnums(List<StatEnum> statEnums) {
		this.statEnums = statEnums;
	}
	
	public List<Long> getEntityFks() {
		return entityFks;
	}
	public void setEntityFks(List<Long> entityFks) {
		this.entityFks = entityFks;
	}
	public final List<List<String>> getStats() {
		return stats;
	}
	public final void setStats(List<List<String>> stats) {
		this.stats = stats;
	}
	public final List<String> getSum() {
		return sum;
	}
	public final void setSum(List<String> sum) {
		this.sum = sum;
	}
	public List<String> getStatLabels() {
		return statLabels;
	}
	public void setStatLabels(List<String> statLabels) {
		this.statLabels = statLabels;
	}
	public List<Object> getNumericSum() {
		return numericSum;
	}
	public void setNumericSum(List<Object> numericSum) {
		this.numericSum = numericSum;
	}
	public List<List<Object>> getNumericStats() {
		return numericStats;
	}
	public void setNumericStats(List<List<Object>> numericStats) {
		this.numericStats = numericStats;
	}
	public String getStatClass() {
		return statClass;
	}
	public void setStatClass(String statClass) {
		this.statClass = statClass;
	}
	
	
}
