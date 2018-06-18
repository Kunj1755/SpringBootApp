package com.kunj.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;

// With @Entity annotation JPA knows to create a table with name Topic
@Entity
public class Course {
	
	@Id // To declare a primary key
	private String id;
	private String name;
	private String description;

	public Course() {

	}

	public Course(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
