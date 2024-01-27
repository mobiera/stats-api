package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;

public enum StatGranularity implements Serializable {

	HOUR(0),DAY(1), MONTH(2);

	private StatGranularity(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static StatGranularity getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return HOUR;
			case 1: return DAY;
			case 2: return MONTH;
			default: return null;
		}
	}

}