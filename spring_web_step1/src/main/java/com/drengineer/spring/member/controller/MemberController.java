package com.drengineer.spring.member.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping(value = "/memberLogin", method = RequestMethod.POST)
	public ModelAndView memberLogin(Member member, Locale locale, HttpServletRequest request,
			HttpServletResponse response) {

		HttpSession HttpServletRequestSession = request.getSession();
		HttpServletRequestSession.setAttribute("member", member);

/*		Cookie historyCookie = new Cookie("loginHistory", getServicerTime(locale).toString());
		historyCookie.setMaxAge(60 * 60 * 24 * 30);// ms
		response.addCookie(historyCookie);*/

		ModelAndView mav = new ModelAndView();
		mav.addObject("memberIp", request.getRemoteAddr());
		mav.setViewName("memberLoginOk");

		return mav;
	}

	@RequestMapping(value = "/memberLogout", method = RequestMethod.GET)
	public String memberLogout(HttpSession session) { // Member :: 커멘드 객체

		session.invalidate();

		return "redirect:/spring/resources/html/memberJoin.html";
	}

	@RequestMapping(value = "/memberInfo", method = RequestMethod.GET)
	public String memberInfo(HttpServletRequest request, Model model) { // Member :: 커멘드 객체
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("member");

	/*	if (member == null) {
			return "redirect:/spring/resources/html/memberLogin.html";

		} else {
			model.addAttribute("member", member);
		}*/

		return "memberInfo";
	}

}
