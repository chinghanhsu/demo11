package com.example.demo11;

public class PersonInfo extends BasicInfo{
	
	private int age;
	
	private String city;

	public PersonInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonInfo(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public PersonInfo(int age, String city) {
		super();
		this.age = age;
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}


}
