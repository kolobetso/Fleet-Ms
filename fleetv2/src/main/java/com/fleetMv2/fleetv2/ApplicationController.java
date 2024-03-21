package com.fleetMv2.fleetv2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	
	
	@GetMapping("/index.html")
	public String home() {
		return "index";
	}
}
