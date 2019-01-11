package spring_step3.ems.member;

import spring_step3.ems.member.dao.StudentDao;
import spring_step3.ems.member.service.StudentRegisterService;
import spring_step3.ems.member.service.StudentSelectService;
import spring_step3.ems.member.service.StudentAllSelectService;
import spring_step3.ems.member.service.StudentDeleteService;
import spring_step3.ems.member.service.StudentModifyService;

public class StudentAssembler {

	private StudentDao studentDao;
	private StudentRegisterService registerService;
	private StudentModifyService modifyService;
	private StudentDeleteService deleteService;
	private StudentSelectService selectService;
	private StudentAllSelectService allSelectService;
	
	
	public StudentAssembler() {
		this.studentDao = new StudentDao();
		this.registerService = new StudentRegisterService(studentDao);
		this.modifyService = new StudentModifyService(studentDao);
		this.deleteService = new StudentDeleteService(studentDao);
		this.selectService = new StudentSelectService(studentDao);
		this.allSelectService = new StudentAllSelectService(studentDao);
	}


	public StudentDao getStudentDao() {
		return studentDao;
	}


	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}


	public StudentRegisterService getRegisterService() {
		return registerService;
	}


	public void setRegisterService(StudentRegisterService registerService) {
		this.registerService = registerService;
	}


	public StudentModifyService getModifyService() {
		return modifyService;
	}


	public void setModifyService(StudentModifyService modifyService) {
		this.modifyService = modifyService;
	}


	public StudentDeleteService getDeleteService() {
		return deleteService;
	}


	public void setDeleteService(StudentDeleteService deleteService) {
		this.deleteService = deleteService;
	}


	public StudentSelectService getSelectService() {
		return selectService;
	}


	public void setSelectService(StudentSelectService selectService) {
		this.selectService = selectService;
	}


	public StudentAllSelectService getAllSelectService() {
		return allSelectService;
	}


	public void setAllSelectService(StudentAllSelectService allSelectService) {
		this.allSelectService = allSelectService;
	}
	
}
