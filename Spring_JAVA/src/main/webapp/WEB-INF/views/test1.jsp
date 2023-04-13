<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TEST1</title>
</head>
<body>
<h1>Test1</h1>
<h3>aaa.a1 : <spring:message code='aaa.a1'/> </h3>
<h3>bbb.b1 : <spring:message code='bbb.b1'/> </h3>
<!-- {}=> 매크로 세팅값 출력 -->
<h3>aaa.a2 : <spring:message code='aaa.a2' arguments="${requestScope.args }"/></h3>

<h3>aaa.a3 : <spring:message code='aaa.a3'/> </h3>
</body>
</html>