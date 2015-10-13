package com.xcodefix.travels.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.xcodefix.entity.model.ActiveMenu;
import com.xcodefix.entity.model.Customer;
import com.xcodefix.entity.model.Menu;
import com.xcodefix.entity.model.Travels;
import com.xcodefix.entity.model.common.ObjectWrapper;
import com.xcodefix.travels.service.CustomerService;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "")
	public ModelAndView getCustomers() {
		
		ModelAndView mav = new ModelAndView("customer/all-customers");
		
		
		ActiveMenu menu = new ActiveMenu();
		menu.setCustomer("active");
		
		Menu customer = new Menu();

		mav.addObject("activeMenu", menu);
		mav.addObject("menu", customer);
		return mav;

	}
	
	@RequestMapping(value = "/add-customer")
	public ModelAndView addCustomer() {
		
		ModelAndView mav = new ModelAndView("customer/add-customer");
		
		
		ActiveMenu menu = new ActiveMenu();
		menu.setCustomer("active");
		
		Menu customer = new Menu();

		mav.addObject("activeMenu", menu);
		mav.addObject("menu", customer);
		mav.addObject("customer", new Customer());
		return mav;
		
	}
	
	@RequestMapping(value="/all-customers", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody ObjectWrapper getAllTravels()	{
		
		System.out.println("Getting all travels");
		List<Customer> allTravels = customerService.getAllCustomers();
		ObjectWrapper wrapper = new ObjectWrapper();
		wrapper.setData(allTravels);
		System.out.println("Travels list : " + allTravels.size());
		System.out.println("Travels list : " + wrapper.getData().size());
		return wrapper;
	}


}
