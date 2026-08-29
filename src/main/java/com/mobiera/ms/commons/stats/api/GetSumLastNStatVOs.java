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

/**
 * Batch variant of {@link GetSumLastNStatVO}: the sum of the last n units of one
 * statClass / granularity for many entities in a single call.
 *
 * The answer is a list of {@link StatVO}, one per requested entityId (entityId set on
 * each, zeros when the entity has no stats), in no particular order.
 */
@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class GetSumLastNStatVOs implements Serializable
{
	private static final long serialVersionUID = 1241060034966633285L;

	private String statClass;
	private List<String> entityIds;
	private StatGranularity statGranularity;
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant currentDateTime;
	private Integer n;
}
