package com.learnshare;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoApplicationController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hi Friend, I am running in AWS EC2 Instance.";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}

}