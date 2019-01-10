package spring_step2.customers.service;

import java.util.List;
import java.util.Map;

public class EmployeesService {

	List<String> employees;

	public void printEmployees(List<String> employees, Map<String, String> administrators) {
		System.out.println(this.toString() );
	}

	@Override
	public String toString() {
		return "EmployeesService [employees=" + employees.toString() + "]";
	}

	public void setEmployees(List<String> employees) {

		this.employees = employees;

	}

}
