package spring_step2.customers.integration;


public class DataBaseConnectionInfoReal {

	String jdbcUrl;
	String userId;
	String userPw;


	@Override
	public String toString() {
		return "CustomerDao [jdbcUrl=" + jdbcUrl + ", userId=" + userId + ", userPw=" + userPw + "]";
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

}
