package com.techsaby.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techsaby.model.SaveIdea;
import com.techsaby.service.SaveIdeaService;

@RestController

public class SaveIdeaController {
	
	@Autowired
	private SaveIdeaService service;
	
	@PostMapping("/saveIdea")
	public String saveIdea(@RequestBody SaveIdea ideaDetails) {
		
		return service.save(ideaDetails);
		//return "Successfully Inserted!";
	}
}
