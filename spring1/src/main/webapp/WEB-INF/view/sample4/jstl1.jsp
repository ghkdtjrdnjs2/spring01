<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- c:if문에는 else if 또는 else가 없다 c:if를 또 써야한다 -->
	<c:if test="${username==null }">
		로그인이 필요합니다
	</c:if>
	<c:if test="${username!=null }">
		${username }님 환영합니다
	</c:if>
</body>
</html>