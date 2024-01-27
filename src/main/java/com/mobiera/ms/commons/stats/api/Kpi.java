package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class Kpi  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6094857915773645178L;
	private String entityId;
	private Long entityFk;
	private String entityClass;
	private String label;
	@JsonDeserialize(using = StatEnumDeserializer.class)
	@JsonSerialize(using = StatEnumSerializer.class)
	private StatEnum stat;
	private String type;
	
}
