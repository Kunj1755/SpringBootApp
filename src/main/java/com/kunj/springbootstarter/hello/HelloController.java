package com.kunj.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// This means you can have methods in this class that can be mapped to the url requests
@RestController
public class HelloController {
	
	@RequestMapping(value="/hello")
	public String sayHi() {
		return "Hi";
	}

}
