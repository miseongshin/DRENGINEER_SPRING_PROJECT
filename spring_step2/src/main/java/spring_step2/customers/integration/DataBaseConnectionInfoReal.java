package spring_step2.customers.integration;

public class DataBaseConnectionInfoReal {

	String jdbcUrl;
	String userId;
	String userPw;

	
	
	public void printDataBaseConnectionInfo(String jdbcUrl, String userId, String userPw) {

		System.out.println(this.toString());
		
	}

	@Override
	public String toString() {
		return "CustomerDao [jdbcUrl=" + jdbcUrl + ", userId=" + userId + ", userPw=" + userPw + "]";
	}

	public void setJdbcUrl(String jdbcUrl) {

		this.jdbcUrl = jdbcUrl;

	}

	public void setUserId(String userId) {

		this.userId = userId;

	}

	public void setUserPw(String userPw) {

		this.userPw = userPw;

	}


}
