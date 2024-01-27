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

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
	
}
