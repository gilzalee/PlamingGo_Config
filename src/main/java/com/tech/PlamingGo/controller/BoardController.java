package com.tech.PlamingGo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping("/drama")
	public String drama() {
		return "drama";
	}
	
	@RequestMapping("drama_review")
	public String drama_review() {
		return "drama_review";
	}
	
	
}
