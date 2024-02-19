package com.bvr.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@RequestMapping("/hello")
	public String getHello() {
		return "Hello....";
	}

}
