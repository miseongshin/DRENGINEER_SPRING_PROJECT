<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login OK</title>
</head>
<body>
	<h1>memberLoginOk</h1>
	ID: ${member.memberId }<br/>
	PW: ${member.memberPw }<br/>
	IP: ${memberIp}
	
	    selected member : ${selectMember.MemberId }/ ${selectMember.MemberPw }
    <a href="/spring/member/memberJoin">LOGOUT</a>
</body>
</html>