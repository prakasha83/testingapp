package com.xcodefix.travels.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xcodefix.entity.model.ActiveMenu;
import com.xcodefix.entity.model.Menu;
import com.xcodefix.entity.model.process.LoginForm;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/index")
	public ModelAndView getIndex() {
		System.out.println("In Index");
		ModelAndView mav = new ModelAndView("pages/login");
		
		return mav;
	}
	
	
	@RequestMapping(value = "/login")
	public String getLogin(@RequestParam(value="error", required=false) boolean error, 
			@ModelAttribute("loginForm") LoginForm loginForm, ModelMap model) {
		System.out.println("In login");
		ModelAndView mav = new ModelAndView("login");

		if (error == true) {
			mav.addObject("error", "Unable to authenticate");
			model.put("error", "Unable to authenticate");
		} else {
			mav.addObject("error", "");
			model.put("error", "");
		}
		return "login";
	}
	
	@RequestMapping(value = "/home")
	public ModelAndView getHome() {
		System.out.println("In home");
		ModelAndView mav = new ModelAndView("index");
		ActiveMenu menu = new ActiveMenu();
		menu.setDashboard("active");
		
		Menu customer = new Menu();
		
		System.out.println("Customer : " + customer.getCustomer());
		
		mav.addObject("activeMenu", menu);
		mav.addObject("menu",customer);
		return mav;
	}
	
}
