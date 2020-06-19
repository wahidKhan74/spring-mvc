package com.simplilearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	String message = "Welocme to Spring MVC!";
	
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value="name", required = false, defaultValue ="World") String name) {
		System.out.println("In Home Controller");
		
		ModelAndView  mv = new ModelAndView("helloworld");
		mv.addObject("message",message);
		mv.addObject("name",name);
		return mv;
	}
	
}
