package spring_step2.customers.service;

import java.util.List;
import java.util.Map;

public class AdministratorsService {

	Map<String, String> administrators;

	public void printAdministrators (List<String> employees, Map<String, String> administrators) {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "AdministratorsService [" + administrators.toString() + "]";
	}

	public void setDevelopers(Map<String, String> administrators) {

		this.administrators = administrators;

	}

}
