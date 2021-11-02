<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>login.jsp<br>
	${login }<br>
	${requestScope.login }<br>
	<!-- 위의 두가지만 알면 된다 
	mycontroller에서 model을 통한 값을 얻어오는 코드이다
	-->
	
	attr : <%=request.getAttribute("login") %><br>
	param : <%= request.getParameter("login") %>
</body>
</html>