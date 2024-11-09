package com.CustomerRealationshipManagementSystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CustomerRealationshipManagementSystem.dao.CustomerDao;
import com.CustomerRealationshipManagementSystem.entity.Customer;
import com.CustomerRealationshipManagementSystem.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	CustomerDao customerDao;

	public CustomerServiceImpl(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}
	@Override
	public String insertCustomer(Customer customer) {
		
		 String msg = customerDao.insertCustomer(customer);
		return msg;
	}

	@Override
	public List<Customer> getCustomerList() {
		// TODO Auto-generated method stub
		
		List<Customer> list = customerDao.getCustomersList();
		return list;
	}
	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		Customer customer = customerDao.getCustomerById(id);
		return customer;
	
	}
	@Override
	public String customerUpdate(Customer customer) {
		// TODO Auto-generated method stub
		
		return customerDao.updateCustomer(customer);
	}
	@Override
	public String customerdeleteById(int id) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomerById(id);
	}
	@Override
	public String insertMultipleCustomer(List<Customer> customers) {
		// TODO Auto-generated method stub
		return customerDao.insertMultipleCustomers(customers);
	}
	@Override
	public List<Customer> getCustomerByFirstName(String firstName) {
		// TODO Auto-generated method stub
	    return customerDao.getCustomerByFirstName(firstName);
	}
	@Override
	public List<Customer> getCustomerByLessThanAge(int age) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByLessThanAge(age);
	}
	@Override
	public List<Customer> getCustomerByGreaterThanAge(int age) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByGreaterThanAge(age);
	}
	@Override
	public List<Customer> getCustomerByAge(int age) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByAge(age);
	}

	@Override
	public List<Customer> getCustomerByLastName(String name) {
		// TODO Auto-generated method stub
		return  customerDao.getCustomerByLastName(name);
	}
	@Override
	public List<Customer> getCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByEmail(email);
	
	}
	@Override
	public List<Customer> getCustomerByPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerPhoneNumber(phoneNumber);
	}
	@Override
	public String updateFirstName(int id, String firstName) {
		// TODO Auto-generated method stub
		return customerDao.updateFirstName(id, firstName);
	}
	@Override
	public String updateLasttName(int id, String lastName) {
		// TODO Auto-generated method stub
		return customerDao.updateLasttName(id, lastName);
	}
	@Override
	public String updateEmailId(int id, String emailId) {
		// TODO Auto-generated method stub
		return  customerDao.updateEmailId(id, emailId);
	}
	@Override
	public String updatePhoneNumber(int id, String phoneNumber) {
		// TODO Auto-generated method stub
		return customerDao.updatePhoneNumber(id, phoneNumber);
	}
	@Override
	public String updateAge(int id, int age) {
		// TODO Auto-generated method stub
		return customerDao.updateAge(id, age);
	}
	@Override
	public List<String> getCustomerByFirstName() {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByFirstNames();
	}
	@Override
	public List<String> getCustomerByLastName() {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByLastNames();
	}
	
	
}
	