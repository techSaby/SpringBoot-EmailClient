package com.techsaby.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techsaby.service.FileReaderService;

@RestController
public class FileReaderController {
	
	@Autowired
	private FileReaderService service;
	
	@GetMapping("/uploadData")
	public String uploadData() throws Exception,FileNotFoundException,IOException {
		return service.uploadData();
	}
	
}
