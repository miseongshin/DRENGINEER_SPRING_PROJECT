package com.drengineer.spring.member.dao;

import com.drengineer.spring.member.Member;

public interface IMemberDao {
	
	void memberInsert(Member member);
	void memberSelect(Member member);
	//void memberUpdate();
	//void memberDelete();
	
}
