package com.lavkesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lavkesh.buisness.HelloBuisness;


@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private HelloBuisness helloBuisness;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView helloPage(){
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("message", "Welcome Guest!");
		return modelAndView;
	}
	
	@RequestMapping(value="/{username}", method=RequestMethod.GET)
	public ModelAndView helloUser(@PathVariable String username, Model model){
		ModelAndView modelAndView = new ModelAndView("hello");
		String helloMessage = helloBuisness.getHelloMessage(username);
		modelAndView.addObject("message", helloMessage);
		return modelAndView;
	}
}