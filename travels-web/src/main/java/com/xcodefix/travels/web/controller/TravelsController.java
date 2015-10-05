package com.xcodefix.travels.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.xcodefix.entity.model.ActiveMenu;
import com.xcodefix.entity.model.Menu;
import com.xcodefix.entity.model.Travels;
import com.xcodefix.entity.model.common.ObjectWrapper;
import com.xcodefix.travels.service.TravelsService;

@Controller
@RequestMapping("/travels")
public class TravelsController {
	
	@Autowired
	private TravelsService travelService;
	
	@RequestMapping("")
	public ModelAndView getTravels() {

		
		ModelAndView mav = new ModelAndView("travels/all-travels");
		
		
		ActiveMenu menu = new ActiveMenu();
		menu.setTravels("active");
		
		Menu customer = new Menu();

		mav.addObject("activeMenu", menu);
		mav.addObject("menu", customer);
		return mav;
		
	}
	
	@RequestMapping(value="/all-travels", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody ObjectWrapper getAllTravels()	{
		
		System.out.println("Getting all travels");
		List<Travels> allTravels = travelService.getAllTravels();
		ObjectWrapper wrapper = new ObjectWrapper();
		wrapper.setData(allTravels);
		System.out.println("Travels list : " + allTravels.size());
		System.out.println("Travels list : " + wrapper.getData().size());
		return wrapper;
	}

}
