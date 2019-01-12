package com.drengineer.spring.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.drengineer.spring.member.Member;
import com.drengineer.spring.member.service.defaultMemberService;

@Controller
public class MemberController {

	defaultMemberService memberService;

	@RequestMapping(value = "/memberJoin", method = RequestMethod.POST)
	public String memberJoin(Model model, HttpServletRequest request) {

		Member member = new Member();
		member.setMemberId(request.getParameter("memberId"));
		member.setMemberPw(request.getParameter("memberPw"));
		member.setMemberMail(request.getParameter("memberMail"));
		member.setMemberPhone1(request.getParameter("memberPhone1"));
		member.setMemberPhone2(request.getParameter("memberPhone2"));
		member.setMemberPhone3(request.getParameter("memberPhone3"));
		
		memberService.memberRegist(member);

		return "memberJoinOk";
	}

}
