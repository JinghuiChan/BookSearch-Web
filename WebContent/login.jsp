<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% 
	String basePath= application.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户登录</title>
</head>
<body>
	<s:form action="login" method="post" namespace="/">
		<s:textfield name="username" label="用户名" cssStyle="width:160px;height:26px;" />
		<s:textfield name="password" label="密码" cssStyle="width:160px;height:26px;" />
		<s:submit value="登陆" />
	</s:form>
</body>
</html>