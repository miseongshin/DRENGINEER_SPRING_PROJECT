package spring_step3.ems.member.dao;

import java.util.HashMap;
import java.util.Map;

import spring_step3.ems.member.Student;

public class StudentDao {
	
	private Map<String, Student> studentDb = new HashMap<String, Student>();
	
	public void insert(Student student) {
		studentDb.put(student.getsNum(), student);
	
	}
	
	public Student select(String sNum) {
		return studentDb.get(sNum);
	}
	
	public void update(Student student) {
		studentDb.put(student.getsNum(), student);
	}
	
	public void delete(String sNum) {
		studentDb.remove(sNum);
	}
	
	public Map<String, Student> getStudentDb(){
		return studentDb;
	}
}
