package com.xcodefix.travels.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xcodefix.entity.model.process.LoginForm;

@Controller
public class IndexController {
	
	@RequestMapping(value = "")
	public ModelAndView getIndex() {
		ModelAndView mav = new ModelAndView("pages/login");
		
		return mav;
	}
	
	
	@RequestMapping(value = "/login")
	public ModelAndView getLogin(@RequestParam(value="error", required=false) boolean error, 
			@ModelAttribute("loginForm") LoginForm loginForm, ModelMap model) {
		ModelAndView mav = new ModelAndView("login");
		
		return mav;
	}
	
	@RequestMapping(value = "/home")
	public ModelAndView getHome() {
		ModelAndView mav = new ModelAndView("index");
		
		return mav;
	}
	
}
