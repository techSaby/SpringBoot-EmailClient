package com.techsaby.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Avengers_File")
public class FileReaderModel {
	
	@Id
	private String id;
	private String name;
	private String alias;
	private String address;
	
	public FileReaderModel() {
		super();
		
	}
	
	public FileReaderModel(String name, String alias, String address) {
		super();
		this.name = name;
		this.alias = alias;
		this.address = address;
	}

		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
