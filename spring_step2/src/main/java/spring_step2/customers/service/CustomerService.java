package spring_step2.customers.service;

import org.springframework.beans.factory.annotation.Autowired;

import spring_step2.customers.dao.CustomerDao;

public class CustomerService {

	private CustomerDao customerDao;
	
	@Autowired
	public CustomerService(CustomerDao customerDao) {
	}

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	
}
