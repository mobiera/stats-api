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
import lombok.ToString;

@Getter
@Setter
@ToString
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
	private List<String> entityIds;
	private String statClass;
	private StatGranularity statGranularity;
	private StatResultType statResultType;
	@JsonDeserialize(using = StatEnumsDeserializer.class)
	@JsonSerialize(using = StatEnumsSerializer.class)
	private List<StatEnum> statEnums;
	
}
