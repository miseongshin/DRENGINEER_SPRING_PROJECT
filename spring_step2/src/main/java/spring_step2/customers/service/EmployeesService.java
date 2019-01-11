package spring_step2.customers.service;

import java.util.List;


public class EmployeesService {

	private List<String> employees;


	@Override
	public String toString() {
		return "EmployeesService [employees=" + employees.toString() + "]";
	}

	public List<String> getEmployees() {
		return employees;
	}

	public void setEmployees(List<String> employees) {
		this.employees = employees;
	}



}
