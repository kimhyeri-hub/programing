<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("admin") && pw.equals("1234")) { //아이디와 비번이 맞으면
		//쿠키 생성
		Cookie cookie = new Cookie("userId", "admin");
		cookie.setMaxAge(-1); // 브라우저 종료 시 만료 (세션 쿠키)
		response.addCookie(cookie);
		
		response.sendRedirect("8-1.jsp");
		return;
	}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
 <script>
	alert('아이디 또는 비밀번호가 틀렸습니다.');
	history.back();
	</script>
</body>
</html>