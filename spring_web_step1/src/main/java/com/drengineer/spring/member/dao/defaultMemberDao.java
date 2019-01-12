package com.drengineer.spring.member.dao;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.drengineer.spring.member.Member;


@Component
//@Repository
public class defaultMemberDao implements MemberDao {

	private HashMap<String, Member> dbMap;

	@Override
	public void memberInsert(Member member) {
		// TODO Auto-generated method stub

	}


}
