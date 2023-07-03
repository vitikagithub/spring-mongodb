package com.example.demo.model;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "viewers_mdb")
public class Viewers {
	private int id;
	private String name;
	private int age;
	private String country;
	
	public Viewers() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
