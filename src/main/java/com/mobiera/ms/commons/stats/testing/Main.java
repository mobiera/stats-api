package com.mobiera.ms.commons.stats.testing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mobiera.ms.commons.stats.api.GetStatView;

public class Main {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		String data = " { "+
				 " \"from\": \"2022-03-14T08:30:41.206Z\","+
				 " \"to\": \"2022-03-14T08:30:41.206Z\","+
				 " \"entityIds\": ["+
				 "   0"+
				 " ],"+
				 " \"statClass\": \"SMPP_ACCOUNT\","+
				 " \"statGranularity\": \"HOUR\","+
				 " \"statResultType\": \"LIST\","+
				 " \"statEnums\": ["+
				 "   {"+
				 "     \"index\": 0,"+
				 "     \"label\": \"DATE_TS\","+
				 "     \"value\": \"DATE_TS\","+
				 "     \"description\": \"DATE_TS\""+
				 "   }"+
				 " ]"+
				"}";
		
		new ObjectMapper().readValue(data, GetStatView.class);
		
		
	}

}
