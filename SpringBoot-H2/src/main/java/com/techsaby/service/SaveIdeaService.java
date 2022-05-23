package com.techsaby.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techsaby.model.SaveIdea;
import com.techsaby.repo.JPARepo;

@Service
public class SaveIdeaService {
	
	@Autowired
	private JPARepo repo;

	public String save(SaveIdea ideaDetails) {
		System.out.println(ideaDetails.getIdeaDescription());
		System.out.println(ideaDetails.getIdea());
		
		ideaDetails.setCreatedDate(new Date());
		repo.save(ideaDetails);

		return "Success";
	} 
	
	
	
	
}
