package com.mobiera.ms.commons.stats.api;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class StatEnumsSerializer extends JsonSerializer<List<StatEnum>> {
    


	@Override
	public void serialize(List<StatEnum> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		
		gen.writeStartArray();
		
		for (StatEnum se: value) {
			gen.writeStartObject();
			if (se.getIndex() != null) gen.writeObjectField("index", se.getIndex());
			if (se.getDescription() != null) gen.writeObjectField("description", se.getDescription());
			if (se.getLabel() != null) gen.writeObjectField("label", se.getLabel());
			if (se.getValue() != null) gen.writeObjectField("value", se.getValue());
			gen.writeEndObject();
		}
		gen.writeEndArray();
		
	}}