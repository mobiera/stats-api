package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class StatEvent implements Serializable {

	//statService.stat(AircastStatClass.SMPP_ACCOUNT, mo.getSmppAccountId(), enums, now, 1);
	
	private static final long serialVersionUID = 4246621501701317823L;
	private String statClass;
	private String entityId;
	@Deprecated
	private Long entityFk;
	private List<StatEnum> enums;
	private Instant ts;
	private Integer increment = 0;
	private Double doubleIncrement = 0d;
	
}
