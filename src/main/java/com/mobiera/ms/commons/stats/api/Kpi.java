package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@JsonInclude(Include.NON_NULL)
public class Kpi  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6094857915773645178L;
	private Long entityFk;
	private String entityClass;
	private String label;
	@JsonDeserialize(using = StatEnumDeserializer.class)
	@JsonSerialize(using = StatEnumSerializer.class)
	private StatEnum stat;
	private String type;
	
	public Long getEntityFk() {
		return entityFk;
	}
	public void setEntityFk(Long entityFk) {
		this.entityFk = entityFk;
	}
	public String getEntityClass() {
		return entityClass;
	}
	public void setEntityClass(String entityClass) {
		this.entityClass = entityClass;
	}
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public StatEnum getStat() {
		return stat;
	}
	public void setStat(StatEnum stat) {
		this.stat = stat;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
