package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class StatView implements Serializable {

	private static final long serialVersionUID = 4829415845298862375L;

	private Instant from;
	private Instant to;
	private List<String> entityIds;
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
	
}
