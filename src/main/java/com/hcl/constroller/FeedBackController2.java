package com.hcl.constroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FeedBackController2 {

	@RequestMapping(value ="/addFB", method = RequestMethod.GET)
	public String addFB() {
		return "addFB";
	}
}	
