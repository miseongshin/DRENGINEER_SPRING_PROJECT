package com.drengineer.spring.member.dao;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.drengineer.spring.member.Member;


@Component
//@Repository
public class MemberDao implements IMemberDao {

	private HashMap<String, Member> dbMap;

	@Override
	public void memberInsert(Member member) {
		// TODO Auto-generated method stub

	}

	@Override
	public void memberSelect(Member member) {
		// TODO Auto-generated method stub
		
	}

}
