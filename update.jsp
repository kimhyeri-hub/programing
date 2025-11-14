<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>  
<%@ page import="java.time.*" %>
<%@ page import="com.board.dto.*"%>
<%@ page import="com.board.dao.*"%>

<%
    request.setCharacterEncoding("utf-8");

    int    num     = Integer.parseInt(request.getParameter("num"));
    String writer  = request.getParameter("writer");
    String title   = request.getParameter("title");
    String content = request.getParameter("content");

    if (writer != null && writer.length() > 0 &&
        title != null && title.length() > 0 &&
        content != null && content.length() > 0) {

        BoardDto dto = new BoardDto();
        dto.setWriter(writer);
        dto.setTitle(title);
        dto.setContent(content);

        new BoardDao().insertOne(dto);

        response.sendRedirect("view.jsp?num=" + num);
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>입력 오류</title>
</head>
<body>
    <h2>입력값이 부족합니다. 모든 항목을 입력해주세요.</h2>
    <a href="form.jsp">돌아가기</a>
</body>
</html>

	