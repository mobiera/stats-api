package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonStatEnum implements StatEnum, Serializable {

	
	private static final long serialVersionUID = -4452902646079369906L;
	private Integer index;
	private String label;
	private String value;
	private String description;
	
	public String toString() {
		return "stat: " + index  + " label: " + label;
	}
	
	public static StatEnum build(Integer index, String description) {
		CommonStatEnum se = new CommonStatEnum();
		se.setIndex(index);
		se.setDescription(description);
		return se;
	}
	
}
