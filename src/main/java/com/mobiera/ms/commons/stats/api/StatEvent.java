package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
public class StatEvent implements Serializable {

	//statService.stat(AircastStatClass.SMPP_ACCOUNT, mo.getSmppAccountId(), enums, now, 1);
	
	private static final long serialVersionUID = 4246621501701317823L;
	private String statClass;
	private Long entityFk;
	private List<StatEnum> enums;
	private Instant ts;
	private Integer increment = 0;
	private Double doubleIncrement = 0d;
	
	public String getStatClass() {
		return statClass;
	}
	public void setStatClass(String statClass) {
		this.statClass = statClass;
	}
	public Long getEntityFk() {
		return entityFk;
	}
	public void setEntityFk(Long entityFk) {
		this.entityFk = entityFk;
	}
	public List<StatEnum> getEnums() {
		return enums;
	}
	public void setEnums(List<StatEnum> enums) {
		this.enums = enums;
	}
	public Instant getTs() {
		return ts;
	}
	public void setTs(Instant ts) {
		this.ts = ts;
	}
	public Integer getIncrement() {
		return increment;
	}
	public void setIncrement(Integer increment) {
		this.increment = increment;
	}
	public Double getDoubleIncrement() {
		return doubleIncrement;
	}
	public void setDoubleIncrement(Double doubleIncrement) {
		this.doubleIncrement = doubleIncrement;
	}
	
	
	
}
