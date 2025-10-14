<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>로그인 예제</title>
</head>
<body>

<%
    String userId = null;

    // 쿠키에서 userId를 읽어오기
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("userId")) {
                userId = cookie.getValue(); // 쿠키 값 저장!!
            }
        }
    }

    if (userId != null) { // 로그인 된 상태
%>
    <!-- 로그인된 상태일 때 -->
    <form action="8-3.jsp" method="post">
        <%= userId %>님 로그인 중
        <input type="submit" value="로그아웃">
    </form>
<%
    } else {
%>
    <!-- 로그인되지 않은 상태일 때 -->
    <form action="8-2.jsp" method="post">
        아이디: <input type="text" name="id">
        비밀번호: <input type="password" name="pw">
        <input type="submit" value="로그인">
    </form>
<%
    }
%>

</body>
</html>

 