package com.spring.rest.person.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.rest.person.model.Person;

@Controller
public class ResourceDetailsController {
	
private static Map<Integer,Person> persons = new HashMap<Integer,Person>();
	
	static {
		Person p1 = new Person("John", 25, 1);
		persons.put(1,  p1);
		
		Person p2 = new Person("Dwayne", 26, 2);
		persons.put(2,  p2);
		
		Person p3 = new Person("Jim", 27, 3);
		persons.put(3,  p3);
	}
	
	@RequestMapping(value = "/person/getAll", method = RequestMethod.GET)
	@ResponseBody
	public String getAllPersons(HttpServletRequest request, HttpServletResponse response) {
		Set<Integer> ids = persons.keySet();
		Person[] p = new Person[ids.size()];
		int i=0;
		for(Integer id : ids){
			p[i] = persons.get(id);
			i++;
		}
		
		Gson gson = new Gson();
		String jsonData = gson.toJson(p);
		System.out.println("Json Object Data in Spring: " + jsonData);
		return jsonData;
	}
}
