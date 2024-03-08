<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- forward할 때 username 값만 저장 -->
	${username }<br>
	<!-- password란 값은 없다 -> null -> 출력하지 않는다 -->
	${password }<br>
	${username==null }<br>
	${password==null }<br>
	<hr>
	<!-- 출력 작업할 때 전달받은 객체를 찍어라 -->
	${pagination }
	<!-- 객체의 값을 꺼낼때 : 게터 -->
	${pagination.start }
	<!-- 아래 코드는 자바로 pagination.getTop() -> 에러
		답을 객체로 받고 그 객체를 꺼내려면 게터를 써야하는데
		객체가 없는걸 게터로 꺼내려하면 오류가 뜬다 객체가 없기 때문에
	 -->
	${pagination.top }
</body>
</html>