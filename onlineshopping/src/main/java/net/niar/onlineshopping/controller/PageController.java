package net.niar.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/", "home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("greeting", "Welcome to spring mvc");
		
		return mv;
	}
	
	@RequestMapping(value="/test1")
	public ModelAndView test1(@RequestParam("greeting")String greeting) {
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("greeting", greeting);
		
		return mv;
	}
	
	@RequestMapping(value="/test2/{greeting}-{name}")
	public ModelAndView test2(@PathVariable("greeting")String greeting, @PathVariable("name")String name) {
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("greeting", greeting + ", " + name);
		
		return mv;
	}
}
