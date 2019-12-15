package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcTesting {
	
	@RequestMapping("/")
	public String welcome() {
		System.out.println("welcome to spring mvc");
		return "main";
		
	}

}
