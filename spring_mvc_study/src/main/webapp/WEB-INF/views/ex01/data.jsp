<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>data.jsp</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>data.jsp 실행....</P>

	<h4>MemberVO 아이디 : ${member.userid }</h4>
	<h4>MemberVO 비밀번호 : ${member.userpw }</h4>

	<h4>==========================================</h4>

	<h4>Map 아이디 : ${map.userid }</h4>
	<h4>Map 비밀번호 : ${map.userpw }</h4>
</body>
</html>

<!-- doD( ) 메소드에서 model.addAttribute("member", member) 로 데이터를 담았으므로 data.jsp 에서는 member 이란 이름으로 MemberVO 의 값을 사용하는게 가능하다.
마찬가지로 Map의 경우 map란 이름으로 담겨있는 값을 가져와 사용할 수 있다. -->
