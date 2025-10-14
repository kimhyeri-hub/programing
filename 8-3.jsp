<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		Cookie cookie = new Cookie("userId", "null");
		cookie.setMaxAge(0); // 브라우저 종료 시 만료 (세션 쿠키)
		response.addCookie(cookie);
		
		response.sendRedirect("8-1.jsp");
%>

</body>
</html>