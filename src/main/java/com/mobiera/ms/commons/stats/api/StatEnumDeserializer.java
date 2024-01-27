package com.mobiera.ms.commons.stats.api;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class StatEnumDeserializer extends JsonDeserializer<StatEnum> {
    @Override
    public StatEnum deserialize(JsonParser arg0, DeserializationContext arg1) throws IOException, JsonProcessingException {
        //String se = arg0.getText();
    	
    	JsonNode node = arg0.getCodec().readTree(arg0);
    	//System.out.println(node.toString());
    	StatEnum  res = null;
        if (arg0!=null) {
        	ObjectMapper mapper = new ObjectMapper();
             ObjectReader objectReader = mapper.reader().forType(CommonStatEnum.class);
             res = objectReader.readValue(node);
             
        }
        
       // System.out.println(res);
    	return res;
    }
}