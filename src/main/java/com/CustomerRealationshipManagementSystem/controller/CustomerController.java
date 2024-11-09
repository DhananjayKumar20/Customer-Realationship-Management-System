package com.CustomerRealationshipManagementSystem.controller;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
//import org.hibernate.mapping.Map;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerRealationshipManagementSystem.entity.Customer;
import com.CustomerRealationshipManagementSystem.service.CustomerService;

import jakarta.transaction.Transaction;

@RestController
@RequestMapping("/api/customers")
public class CustomerController 
{
	
	CustomerService customerService;

	public CustomerController(CustomerService customerService) 
	{
		super();
		this.customerService = customerService;
	}
	
	@PostMapping("/insert")
	public String insertCustomer(@RequestBody Customer customer)
	{
		String msg = customerService.insertCustomer(customer);
		return msg;
	}
	
	@GetMapping
	public List<Customer> getCustomerList()
	{
		List<Customer> list = customerService.getCustomerList();
		return list;
	}

	@GetMapping("/{id}")
	public Customer getcustomerById(@PathVariable int id)
	{
		return customerService.getCustomerById(id);	
	}
	
	@PutMapping
	public String customerUpdate(@RequestBody Customer customer)
	{
		return customerService.customerUpdate(customer);
	}
	
	@DeleteMapping("/{id}")
	public String customerDelete(@PathVariable int id)
	{
		return customerService.customerdeleteById(id);
	}
	
	@PostMapping
	public String insertMultipleCustomers(@RequestBody List<Customer> customers)
	{
		return customerService.insertMultipleCustomer(customers);
	}
	
	@GetMapping("/byname/{firstName}")
	public List<Customer> getCustomerByFirstName(@PathVariable String firstName)
	{
		return customerService.getCustomerByFirstName(firstName);	
	}
	
	@GetMapping("/bylessthanage/{age}")
	public List<Customer> getCustomerByLessThanAge(@PathVariable int age)
	{
		return customerService.getCustomerByLessThanAge(age);
	}
	
	@GetMapping("/bygreaterthanage/{age}")
	public List<Customer> getCustomerByGreaterThanAge(@PathVariable int age)
	{
		return customerService.getCustomerByGreaterThanAge(age);
		
	}

	@GetMapping("/byage/{age}")
	public List<Customer> getCustomerByAge(@PathVariable int age)
	{
		return customerService.getCustomerByAge(age);
	}
	
	@GetMapping("/bylastname/{name}")
	public List<Customer> getCustomerByLastName(@PathVariable String name)
	{
		return customerService.getCustomerByLastName(name);
	}

	@GetMapping("/byemail/{email}")
	public List<Customer> getCustomerByEmail(@PathVariable String email)
	{
		return customerService.getCustomerByEmail(email);
	}
	
	@GetMapping("/byphonenumber/{phoneNumber}")
	public List<Customer> getCustomerByPhoneNumber(@PathVariable String phoneNumber)
	{
		return customerService.getCustomerByPhoneNumber(phoneNumber);
	}
	
	@PutMapping("/firstname/{id}")
	public String updateFirstName(@PathVariable int id,@RequestBody Map<String, String> request)
	{
		String firstName = request.get("firstName");
		
		return customerService.updateFirstName(id, firstName);
	}
	
	@PutMapping("/lastname/{id}")
	public String updateLastName(@PathVariable int id,@RequestBody Map<String, String> request)
	{
		String lastName = request.get("lastName");
		
		return customerService.updateLasttName(id, lastName);
	}
	
	@PutMapping("/email/{id}")
	public String updateEmailId(@PathVariable int id,@RequestBody Map<String, String> request)
	{
		String emailId = request.get("email");
		
		return customerService.updateEmailId(id, emailId);
	}

	@PutMapping("/phonenumber/{id}")
	public String updatePhoneNumber(@PathVariable int id,@RequestBody Map<String, String> request)
	{
		String phoneNumber = request.get("phoneNumber");
		
		return customerService.updatePhoneNumber(id, phoneNumber);
	}
	
	@PutMapping("/age/{id}")
	public String updateAGe(@PathVariable int id,@RequestBody Map<String, Integer> request)
	{
		int age = request.get("age");
		
		return customerService.updateAge(id, age);
	}
	
	@GetMapping("/firstname")
	public List<String> getCustomersFirstNames()
	{
		return customerService.getCustomerByFirstName();
		
	}

	@GetMapping("/lastname")
	public List<String> getCustomersLastNames()
	{
		return customerService.getCustomerByLastName();
		
	}
}

 