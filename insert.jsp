<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.time.*" %>


<%
	String writer = request.getParameter("writer");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
    Class.forName("org.mariadb.jdbc.Driver");//자바 클라이언트 로드
    try(
    	Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3308/jspdb", "jsp", "1234"); // DB 접속
        Statement stmt = conn.createStatement(); // 쿼리 문장 객체
    ){
    	String curTime = LocalDate.now() + " "+LocalTime.now().toString().substring(0,8) ; 
    					//2025-10-16		 "12:23:08.243214134343".substring(시작위치, 끝날위치)
    									   // 012345678 (자리)
		stmt.executeUpdate(String.format("insert into board (writer, title, content, regtime, hits) values ('%s','%s','%s','%s', 0)", 
				writer, title, content, curTime));
			
    } catch (Exception e){
    	e.printStackTrace();
    	out.println(e.getMessage());
    }
    
    response.sendRedirect("list.jsp");
%>