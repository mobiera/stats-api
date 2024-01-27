package com.mobiera.ms.commons.stats.api;

import java.util.List;

public interface StatDiscovery {
	public StatClass getStatClass(Integer index);
	public StatClass getStatClass(String name);
	public StatEnum getStatEnum(StatClass statClass, String statEnumStr);
	public List<StatEnum> getStatEnums(StatClass statClass, List<String> statEnumStr);
	
}
