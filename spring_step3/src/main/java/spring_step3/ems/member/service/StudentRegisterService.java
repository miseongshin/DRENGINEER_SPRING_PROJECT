package spring_step3.ems.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import spring_step3.ems.member.Student;
import spring_step3.ems.member.dao.StudentDao;

public class StudentRegisterService {
	@Autowired
	private StudentDao studentDao;

	public StudentRegisterService(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	public void register(Student student){
		
	}
	
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

}
