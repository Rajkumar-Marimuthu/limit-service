package com.rojatech.services.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rojatech.services.limitsservice.bean.Limits;
import com.rojatech.services.limitsservice.configuration.Configuration;

@RestController
public class LimitsServiceController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits getLimits() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}
}
