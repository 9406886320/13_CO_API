package com.primesoft.binding;

import lombok.Data;

@Data
public class CoResponse {


	private Long totalTriggers;
	
	private Long succTriggers;
	
	private Long failedTrigger;
}
