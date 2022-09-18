package com.techsaby.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techsaby.model.FileReaderModel;
import com.techsaby.repository.FileReaderRepository;

@Service
public class FileReaderService {

	@Autowired
	private FileReaderRepository repo;

	public String uploadData() throws IOException, IOException,FileNotFoundException {
		
		List<FileReaderModel> recordList = new ArrayList<FileReaderModel>();
		BufferedReader reader = new BufferedReader(new FileReader("<Path>\\testFile.txt"));
		String line="";
		
		try {
			while((line=reader.readLine())!=null) {
				String[] fields =line.split("\\|");
				FileReaderModel model = new FileReaderModel();
				model.setId(fields[0]);
				model.setName(fields[1]);
				model.setAlias(fields[2]);
				model.setAddress(fields[3]);
				recordList.add(model);
				System.out.println("ID : "+model.getId());
				System.out.println("Name : "+model.getName());
				System.out.println("Alias : "+model.getAlias());
				System.out.println("Address : "+model.getAddress());
				repo.saveAll(recordList);
			}
			
		} catch (IOException e) {
			System.out.println("In Cache block");
			e.printStackTrace();
		}
		
		return "Data Successfully Saved!!";
	}

}
