<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div style="float:right; "><p style="float:right">
		<%@ page import="com.wyu.severlet.Counter" %>
		<%
			int count = (Integer)application.getAttribute("count");
		%>
		访问人数：<%=count %>
	</p></div>
		<div style="float:right;  margin-right:20px;">	<p style="float:right"><% Date date=new Date(); SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");%> <p><%=sdf.format(date)%></p></div>
	</div>
	
</body>
</html>