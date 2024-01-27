package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;

public class CommonStatEnum implements StatEnum, Serializable {

	
	private static final long serialVersionUID = -4452902646079369906L;
	private Integer index;
	private String label;
	private String value;
	private String description;
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
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
