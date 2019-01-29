package com.drengineer.spring.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drengineer.spring.member.Member;
import com.drengineer.spring.member.dao.MemberDao;

@Service
//@Component
//@Repository
public class MemberService implements IMemberService{
	
	@Autowired
	MemberDao memberDao;

	@Override
	public void memberRegist(Member member) {
		
		System.out.println(memberDao.memberInsert(member));
	}

	@Override
	public Member memberLogin(Member member) {
		
		return memberDao.memberSelect(member);
	}


}
