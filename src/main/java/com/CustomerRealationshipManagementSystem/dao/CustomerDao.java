package com.CustomerRealationshipManagementSystem.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CustomerRealationshipManagementSystem.entity.Customer;

@Repository
public class CustomerDao 
{

	//database ka code
	
	@Autowired
	SessionFactory sf;

	public CustomerDao(SessionFactory sf)
	{
		super();
		this.sf = sf;
	}
	
	public String insertCustomer(Customer customer )
	{
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		//insert , update , delete , -> you need to use Transaction
		//save nam ki method -> session
		
		session.save(customer);
		tr.commit();
		session.close();
		
		return "Customer insert Successfully";
		
		
	}

	public List<Customer> getCustomersList() {
		// TODO Auto-generated method stub
		
		Session session = sf.openSession();
		return  session.createQuery("from Customer").list();
	}

	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		//get -> It will return null if object not found in db
	    //load -> it will return objectNotfoundException if object not found in db
				
		Session session = sf.openSession();
		Customer customer = session.get(Customer.class, id);
		return customer;
	}
 
	public String updateCustomer(Customer customer)
	{
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.update(customer);
		tr.commit();
		session.close();
		return "customer updated successfully";
		
	}
	public String deleteCustomerById(int id)
	{
		
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Customer customer=session.get(Customer.class, id);
		session.delete(customer);
		tr.commit();
		session.close();
		return "customer delete successfully";
	}
	
	public String insertMultipleCustomers(List<Customer> customers)
	{
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		for(Customer customer:customers)
		{
			session.save(customer);
		}
		tr.commit();
		session.close();
		return "customer are inserted successfully";
	}
	
	public List<Customer> getCustomerByFirstName(String firstName)
	{
		Session session=sf.openSession();
		Query<Customer> customers=session.createQuery("from Customer c where c.firstName=:firstName",Customer.class);
		customers.setParameter("firstName", firstName);
		List<Customer> list= customers.list();
		return list;	
	}
	
	public List<Customer> getCustomerByLessThanAge(int age)
	{
		Session session=sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c where c.age<:age",Customer.class);
		customers.setParameter("age", age);
		List<Customer> list= customers.list();
		return list;
	}

	public List<Customer> getCustomerByGreaterThanAge(int age) 
	{
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c where c.age>:age",Customer.class);
		customers.setParameter("age", age);
		List<Customer> list= customers.list();
		return list;
	}

	public List<Customer> getCustomerByAge(int age) 
	{
		// TODO Auto-generated method stub
	
		Session session=sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c where c.age=:age",Customer.class);
		customers.setParameter("age", age);
		List<Customer> list= customers.list();
		return list;
	}

	public List<Customer> getCustomerByLastName(String name) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Query<Customer> customers=session.createQuery("from Customer c where c.lastName=:lastName",Customer.class);
		customers.setParameter("lastName", name);
		List<Customer> list= customers.list();
		return list;
	}
	
	public List<Customer> getCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Query<Customer> customers=session.createQuery("from Customer c where c.email=:email",Customer.class);
		customers.setParameter("email", email);
		List<Customer> list= customers.list();
		return list;
	}
	

	public List<Customer> getCustomerPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Query<Customer> customers=session.createQuery("from Customer c where c.phoneNumber=:phoneNumber",Customer.class);
		customers.setParameter("phoneNumber", phoneNumber);
		List<Customer> list= customers.list();
		return list;
	}

	public String updateFirstName(int id, String firstName) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		// Transaction, we can used to insert and update and delete.
		
		Transaction tr=session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setFirstName(firstName);
		tr.commit();
		session.close();
		return "FirstName updated successfully";
	}

	public String updateLasttName(int id, String lastName) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		// Transaction, we can used to insert and update and delete.
		
		Transaction tr=session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setLastName(lastName);
		tr.commit();
		session.close();
		return "LastName updated successfully";
	}

	public String updateEmailId(int id, String emailId) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		// Transaction, we can used to insert and update and delete.
		
		Transaction tr=session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setEmail(emailId);
		tr.commit();
		session.close();
		return "EmailId updated successfully";
	}
	

	public String updatePhoneNumber(int id, String phoneNumber) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		// Transaction, we can used to insert and update and delete.
		
		Transaction tr=session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setPhoneNumber(phoneNumber);
		tr.commit();
		session.close();
		return "phoneNumber updated successfully";
	}

	public String updateAge(int id, int age) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		// Transaction, we can used to insert and update and delete.
		
		Transaction tr=session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setAge(age);
		tr.commit();
		session.close();
		return "Age has been updated successfully";
	}

	public List<String> getCustomerByFirstNames() {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		return session.createQuery("select c.firstName from Customer c").list();
	}

	public List<String> getCustomerByLastNames() {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		return session.createQuery("select c.lastName from Customer c").list();
	}
	
	
	
	




	



	
}