package spring_step2.customers.service;

import java.util.List;
import java.util.Map;

public class CustomerService {

	public void printCustomer(List<String> employees, Map<String, String> administrators) {
		System.out.println("CustomerService" + this.toString());
	}


}
