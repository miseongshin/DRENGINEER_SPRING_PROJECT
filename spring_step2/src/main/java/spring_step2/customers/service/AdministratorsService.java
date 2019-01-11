package spring_step2.customers.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

public class AdministratorsService {

	private Map<String, String> administrators;

	public void printAdministrators () {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "AdministratorsService [" + administrators.toString() + "]";
	}

	@Required
	public Map<String, String> getAdministrators() {
		return administrators;
	}

	public void setAdministrators(Map<String, String> administrators) {
		this.administrators = administrators;
	}
	

}
