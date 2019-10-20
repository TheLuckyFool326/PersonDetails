package com.rest.person.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
	
	private String name;
	private int age;
	private int id;
	
	public Person() {}
	
	public Person(String personName, int personAge, int personId) {
		this.name = personName;
		this.age = personAge;
		this.id = personId;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
