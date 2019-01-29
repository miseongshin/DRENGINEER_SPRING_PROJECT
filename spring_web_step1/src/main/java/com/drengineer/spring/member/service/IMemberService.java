package com.drengineer.spring.member.service;

import com.drengineer.spring.member.Member;

public interface IMemberService {

	
	void memberRegist(Member member);
	Member memberLogin(Member member);
}
