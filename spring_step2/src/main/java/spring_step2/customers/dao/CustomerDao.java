package spring_step2.customers.dao;

import java.util.Map;


public class CustomerDao {

	Map<String, Object> dbInfo;

	public Map<String, Object> getDbInfo() {
		return dbInfo;
	}

	public void setDbInfo(Map<String, Object> dbInfo) {
		this.dbInfo = dbInfo;
	}
	
	
}
