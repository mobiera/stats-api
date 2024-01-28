package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class GetStat implements Serializable {

	private static final long serialVersionUID = 4829415845298862375L;

	private Instant ts;
	private String entityId;
	private StatGranularity statGranularity;
	private String statClass;
	
}
