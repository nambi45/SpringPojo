package com.example.SpringPojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class SpringPojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPojoApplication.class, args);
		
		User customer=new User(1, "Nambiraj", "J", "nambi@gamil.com");
		
		System.out.println("Printing the Java Object ");
		
		System.out.println(customer.toString());
		
		ObjectMapper obj=new ObjectMapper();
		
		
		
		System.out.println("Printing as JSON");
		
		try {
				
			System.out.println(obj.writeValueAsString(customer));
		
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	}


