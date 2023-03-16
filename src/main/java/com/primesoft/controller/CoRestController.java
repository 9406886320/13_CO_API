package com.primesoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primesoft.binding.CoResponse;
import com.primesoft.service.CoService;

@RestController
public class CoRestController {
	
	@Autowired
	private CoService service;
	
	@GetMapping("/process")
	public CoResponse processTriggers() {
		return service.processPendingTriggers();
	}

}
