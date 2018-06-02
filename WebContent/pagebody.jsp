<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/pagebody.css" rel = "stylesheet" type = "text/css">
<title>首页主体部分</title>
</head>
<body>
<hr>
<div id="mainBody" >
	<div id="logo">
		<p style="text-align:center; font-size:50px; margin-top:30px;">图书检索</p>
	</div>
	<div id="search">
		<form action="searchSubmit" method="post" > 
			<input type="text" name="searchContent" id="searchContent"  style="font-size:20px;"/>
			<input type="submit" value="搜索" id="searchButton_" style="font-size:20px;color:rgb(255,255,255);"/>
		</form>
	</div>
<!--  
	<s:form action="searchSubmit" method="post" id="search"> 
		<div id="searchBox">
			<s:textfield name="searchContent" id="searchContent"/>
		</div>
		<div id="searchButton" >			
				<s:submit id="searchButton_" value="搜索" cssStyle="font-size:20px;color:rgb(255,255,255);" />	
		</div>
	  </s:form>	
-->

</div>
</body>
</html>