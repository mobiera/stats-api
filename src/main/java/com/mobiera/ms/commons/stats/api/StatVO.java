package com.mobiera.ms.commons.stats.api;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class StatVO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;

	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant ts;
	private String entityId;
	private String statClass;
	private StatGranularity statGranularity;
	private Long long0 = 0l;
	private Long long1 = 0l;
	private Long long2 = 0l;
	private Long long3 = 0l;
	private Long long4 = 0l;
	private Long long5 = 0l;
	private Long long6 = 0l;
	private Long long7 = 0l;
	private Long long8 = 0l;
	private Long long9 = 0l;
	private Long long10 = 0l;
	private Long long11 = 0l;
	private Long long12 = 0l;
	private Long long13 = 0l;
	private Long long14 = 0l;
	private Long long15 = 0l;
	private Long long16 = 0l;
	private Long long17 = 0l;
	private Long long18 = 0l;
	private Long long19 = 0l;
	private Long long20 = 0l;
	private Long long21 = 0l;
	private Long long22 = 0l;
	private Long long23 = 0l;
	private Long long24 = 0l;
	private Long long25 = 0l;
	private Long long26 = 0l;
	private Long long27 = 0l;
	private Long long28 = 0l;
	private Long long29 = 0l;
	private Long long30 = 0l;
	private Long long31 = 0l;
	private Long long32 = 0l;
	private Long long33 = 0l;
	private Long long34 = 0l;
	private Long long35 = 0l;
	private Long long36 = 0l;
	private Long long37 = 0l;
	private Long long38 = 0l;
	private Long long39 = 0l;
	private Long long40 = 0l;
	private Long long41 = 0l;
	private Long long42 = 0l;
	private Long long43 = 0l;
	private Long long44 = 0l;
	private Long long45 = 0l;
	private Long long46 = 0l;
	private Long long47 = 0l;
	private Long long48 = 0l;
	private Long long49 = 0l;
	private Long long50 = 0l;
	private Long long51 = 0l;
	private Long long52 = 0l;
	private Long long53 = 0l;
	private Long long54 = 0l;
	private Long long55 = 0l;
	private Long long56 = 0l;
	private Long long57 = 0l;
	private Long long58 = 0l;
	private Long long59 = 0l;
	private Long long60 = 0l;
	private Long long61 = 0l;
	private Long long62 = 0l;
	private Long long63 = 0l;
	private Long long64 = 0l;
	private Long long65 = 0l;
	private Long long66 = 0l;
	private Long long67 = 0l;
	private Long long68 = 0l;
	private Long long69 = 0l;
	private Long long70 = 0l;
	private Long long71 = 0l;
	private Long long72 = 0l;
	private Long long73 = 0l;
	private Long long74 = 0l;
	private Long long75 = 0l;
	private Long long76 = 0l;
	private Long long77 = 0l;
	private Long long78 = 0l;
	private Long long79 = 0l;
	private Long long80 = 0l;
	private Long long81 = 0l;
	private Long long82 = 0l;
	private Long long83 = 0l;
	private Long long84 = 0l;
	private Long long85 = 0l;
	private Long long86 = 0l;
	private Long long87 = 0l;
	private Long long88 = 0l;
	private Long long89 = 0l;
	private Long long90 = 0l;
	private Long long91 = 0l;
	private Long long92 = 0l;
	private Long long93 = 0l;
	private Long long94 = 0l;
	private Long long95 = 0l;
	private Long long96 = 0l;
	private Long long97 = 0l;
	private Long long98 = 0l;
	private Long long99 = 0l;
	
	private Double double128 = 0d;
	private Double double129 = 0d;
	private Double double130 = 0d;
	private Double double131 = 0d;
	private Double double132 = 0d;
	private Double double133 = 0d;
	private Double double134 = 0d;
	private Double double135 = 0d;
	private Double double136 = 0d;
	
}