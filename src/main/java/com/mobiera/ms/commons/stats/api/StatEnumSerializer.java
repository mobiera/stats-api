package com.mobiera.ms.commons.stats.api;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class StatEnumSerializer extends JsonSerializer<StatEnum> {
    


	@Override
	public void serialize(StatEnum value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		
		
			gen.writeStartObject();
			if (value.getIndex() != null) gen.writeObjectField("index", value.getIndex());
			if (value.getDescription() != null) gen.writeObjectField("description", value.getDescription());
			if (value.getLabel() != null) gen.writeObjectField("label", value.getLabel());
			if (value.getValue() != null) gen.writeObjectField("value", value.getValue());
			gen.writeEndObject();
		
		
	}}