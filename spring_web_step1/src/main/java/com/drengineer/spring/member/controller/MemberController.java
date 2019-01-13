package com.drengineer.spring.member.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.drengineer.spring.member.Member;
import com.drengineer.spring.member.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {

//	MemberService memberService  = new MemberService();
//	@Autowired  스프링 전용, 타입으로 지정
//	@Inject     자바 전용, 타입으로 지정
	@Resource(name = "memberService") // 자바전용 이름으로 지정, java 8부터 annotation 임포트 필요
	MemberService memberService;

	@ModelAttribute("serverTime")
	public String getServicerTime(Locale locale) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		return dateFormat.format(date);
	}
	
	
	@RequestMapping(value = "/memberJoin", method = RequestMethod.POST)
		public String memberJoin(@ModelAttribute("mem") Member member) { // Member :: 커멘드 객체

//     	Member member = new Member();
//		member.setMemberId(request.getParameter("memberId"));
//		member.setMemberPhone2(request.getParameter("memberPhone1"));

//		@RequestParam(value = "memberId", required = true) String memberId,
//		@RequestParam(value = "memberId", required = false, defaultValue = "010") String memberPhone1
//		member.setMemberId(memberId);		
//		member.setMemberPhone1(memberPhone1);		

		memberService.memberRegist(member);

		return "memberJoinOk";
	}
	
	
	@RequestMapping(value = "/memberLogin", method = RequestMethod.GET)
	public String memberLogin(Member member) { // Member :: 커멘드 객체

		memberService.memberLogin(member);

		return "memberLoginOk";
	}

}
