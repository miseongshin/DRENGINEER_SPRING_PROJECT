package spring_step3.ems.member.service;

import java.util.List;
import java.util.Map;

import spring_step3.ems.member.DataBaseConnectionInfo;

public class EMSInformationService {
	
	private String info;
	private String copyRight;
	private String ver;
	private String sYear;
	private String sMonth;
	private String sDay;
	private Map<String, String> administrators;
	private List<String> employees;
	private Map<String, DataBaseConnectionInfo> dbInfos;
	
	public String outputEmsInformation() {
		return this.toString();
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getCopyRight() {
		return copyRight;
	}

	public void setCopyRight(String copyRight) {
		this.copyRight = copyRight;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public String getsYear() {
		return sYear;
	}

	public void setsYear(String sYear) {
		this.sYear = sYear;
	}

	public String getsMonth() {
		return sMonth;
	}

	public void setsMonth(String sMonth) {
		this.sMonth = sMonth;
	}

	public String getsDay() {
		return sDay;
	}

	public void setsDay(String sDay) {
		this.sDay = sDay;
	}

	public Map<String, String> getAdministrators() {
		return administrators;
	}

	public void setAdministrators(Map<String, String> administrators) {
		this.administrators = administrators;
	}

	public List<String> getEmployees() {
		return employees;
	}

	public void setEmployees(List<String> employees) {
		this.employees = employees;
	}
	

	public Map<String, DataBaseConnectionInfo> getDbInfos() {
		return dbInfos;
	}

	public void setDbInfos(Map<String, DataBaseConnectionInfo> dbInfos) {
		this.dbInfos = dbInfos;
	}

	@Override
	public String toString() {
		return "EMSInformationService [info=" + info + ", copyRight=" + copyRight + ", ver=" + ver + ", sYear=" + sYear
				+ ", sMonth=" + sMonth + ", sDay=" + sDay + ", administrators=" + administrators + ", employees="
				+ employees + ", dbInfos=" + dbInfos + "]";
	}


}
