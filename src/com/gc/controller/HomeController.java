package com.gc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Mercyllia Harmon
 *
 */

@Controller
public class HomeController {

	@RequestMapping("/welcome")//url doesent have to match the jsp look at /welcome and welcome
	public ModelAndView helloWorld() {//this is a method

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>This message is coming from HomeController.java</h3></div>";
		return new ModelAndView("welcome", "message2", message);//welcome=name of JSP in spring-servlet
	}
}