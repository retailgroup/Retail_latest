package com.Services.Retail.Retail.Shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Services.Retail.Retail.Shopping.model.Customer;
import com.Services.Retail.Retail.Shopping.repo.Cart_Repo;
import com.Services.Retail.Retail.Shopping.repo.Customer_Repo;
import com.Services.Retail.Retail.Shopping.repo.Product_Repo;

@RestController
public class Retail_Shopping {
	
	@Autowired
	private Customer_Repo customObj;
	
	@Autowired
	private Product_Repo productObj;
	
	@Autowired
	private Cart_Repo cartObj;

	//Method to add new user
	@PostMapping("/addUser")
	public void addUsers(@RequestBody Customer person)
	{
	customObj.save(person);

}
	//Method to delete user
	@DeleteMapping("/deleteUser/{customer_id}")
	public void deleteUsers(@PathVariable Integer customer_id)
	{
		customObj.deleteById(customer_id);
	}
	
	//Method to update user
	@PutMapping("/updateUser/{customer_id}")
	public void updateUsers() {
		
	}
	
	

	}
