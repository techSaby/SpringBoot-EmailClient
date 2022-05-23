package com.techsaby.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class SaveIdea {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long ID;
	
	@NotNull
	private String idea;
	
	@NotNull
	private String ideaDescription;
	
	private Date createdDate;
	
	
	public long getID() {
		return ID;
	}
	
	public void setID(long iD) {
		this.ID = iD;
	}
	
	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String getIdeaDescription() {
		return ideaDescription;
	}
	public void setIdeaDescription(String ideaDescription) {
		this.ideaDescription = ideaDescription;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
	
}

