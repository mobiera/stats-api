package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;

public enum StatResultType implements Serializable {

	LIST(0), SUM(1), LIST_AND_SUM(2);

	private StatResultType(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static StatResultType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return LIST;
			case 1: return SUM;
			case 2: return LIST_AND_SUM;
			
			default: return null;
		}
	}

}