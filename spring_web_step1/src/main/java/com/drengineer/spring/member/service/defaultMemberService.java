package com.drengineer.spring.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drengineer.spring.member.Member;
import com.drengineer.spring.member.dao.defaultMemberDao;

@Service
//@Component
//@Repository
public class defaultMemberService implements MemberService{
	
	@Autowired
	defaultMemberDao memberDao;

	@Override
	public void memberRegist(Member member) {
		memberDao.memberInsert(member);
	}


}
