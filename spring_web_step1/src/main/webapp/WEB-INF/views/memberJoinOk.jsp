<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join OK</title>
</head>
<body>
	<h1>memberJoinOk</h1>
	
	ID: ${mem.memberId }<br/>
	PW: ${mem.memberPw }<br/>
	Mail: ${mem.memberMail }<br/>
	Phone: ${mem.phoneList[0].memberPhone1}-${mem.phoneList[0].memberPhone2}-${mem.phoneList[0].memberPhone3}<br/> 
	Phone2: ${mem.phoneList[1].memberPhone1}-${mem.phoneList[1].memberPhone2}-${mem.phoneList[1].memberPhone3}<br/> 
     
     
    ${serverTime }
    
	
</body>
</html>