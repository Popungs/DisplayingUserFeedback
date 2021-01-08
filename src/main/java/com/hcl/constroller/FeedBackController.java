package com.hcl.constroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Feedback;
import com.hcl.service.FeedbackService;

@RestController
public class FeedBackController {
	@Autowired
	private FeedbackService fbService;
	

	@PostMapping("/addFB")
	public String addFBform(@RequestParam("uname") String name,
			@RequestParam("desc") String description,
			@RequestParam("rating") int rating) {
		fbService.addFeedback(name, description, rating);
		
		return "feedback added";
	}
	@GetMapping("/loadfb")
	public List<Feedback> loadfb() {
		return fbService.getAllFb();
	}
	@GetMapping("/deletefb/{id}")
	public String deletefb(@PathVariable("id") int id ) {
		if (fbService.deleteFB(id)) { // returned true
			return "feedback with corresponding id deleted";
		} 
		return "feedback not deleted";
		
	}
	
}
