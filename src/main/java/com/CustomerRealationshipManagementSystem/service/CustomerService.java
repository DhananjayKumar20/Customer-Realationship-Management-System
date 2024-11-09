package com.CustomerRealationshipManagementSystem.service;

import java.util.List;
import java.util.Map;

import com.CustomerRealationshipManagementSystem.entity.Customer;

public interface CustomerService {
	
	String insertCustomer(Customer customer);
	
	List<Customer> getCustomerList();

	Customer getCustomerById(int id);
	
	String customerUpdate(Customer customer);

	String customerdeleteById(int id);
	
	String insertMultipleCustomer(List<Customer> customers);

	List<Customer> getCustomerByFirstName(String firstName);

	List<Customer> getCustomerByLessThanAge(int age);

	List<Customer> getCustomerByGreaterThanAge(int age);

	List<Customer> getCustomerByAge(int age);
	
	List<Customer> getCustomerByLastName(String name);

	List<Customer> getCustomerByEmail(String email);

	List<Customer> getCustomerByPhoneNumber(String phoneNumber);
	
	String updateFirstName(int id, String firstName);

	String updateLasttName(int id, String lastName);

	String updateEmailId(int id, String emailId);
	
	String updatePhoneNumber(int id, String phoneNumber);
	
    String updateAge(int id, int age);

	List<String> getCustomerByFirstName();

	List<String> getCustomerByLastName();

	


    
   

}