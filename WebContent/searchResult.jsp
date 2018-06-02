<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/searchResult.css" rel = "stylesheet" type = "text/css">
<title>查询结果</title>
</head>
<body>
	<!-- 导航 -->
		<center>
			<div class="daohang">
				<div>
					<a href="<%=path%>/pagebody.jsp" class="whitea">回到首页</a> >>>>
					<a href="#" class="whitea">查询结果</a>
				</div>
			</div>
		</center>
		<!-- 搜索框 -->
		<center>
			<div id="search">
				<form action="searchSubmit" method="post" > 
					<input type="text" name="searchContent" id="searchContent"  style="font-size:15px;"/>
					<input type="submit" value="搜索" id="searchButton_" style="font-size:15px;color:rgb(255,255,255);"/>
				</form>
			</div>
		</center>
	<!-- 查询结果 -->
	<c:if test="${fn:length(books)>0}" var="hasBooks">
		<table border="0" align="center" width="950px"
				style="margin-top: 10px;border:1px solid #336699;" cellpadding="0"
				cellspacing="0">
				<tr style="height:40px;background:#E6E6FA">
					<td style="width:15%;text-align:center;border:1px solid #336699;">
						书名
					</td>
					<td style="width:20%;text-align:center;border:1px solid #336699;">
						作者
					</td>
					<td  style="width:15%;text-align:center;border:1px solid #336699;">
						出版社
					</td>
					<td  style="width:8%;text-align:center;border:1px solid #336699;">
						图书类别
					</td>
					<td  style="width:8%;text-align:center;border:1px solid #336699;">
						图书数量
					</td>
					<td  style="width:8%;text-align:center;border:1px solid #336699;">
						图书编号
					</td>
					<td  style="width:20%;text-align:center;border:1px solid #336699;">
						图书位置
					</td>
					<td style="text-align:center;border:1px solid #336699;">
						备注
					</td>
				</tr>
			<c:forEach var="books" items="${books}" varStatus="status">
				<tr 
					<c:if test="${status.count%2==0}"> bgcolor="#E6E6FA"</c:if>
				>
					<td style="width:15%;height:40px;text-align:center;border:1px solid #336699;"><a href="<%=path%>/bookDetail?id=${books.bookID}"> ${books.bookName} </a></td>
					<td style="width:20%;height:40px;text-align:center;border:1px solid #336699;">${books.author}</td>
					<td style="width:15%;height:40px;text-align:center;border:1px solid #336699;">${books.publish}</td>
					<td style="width:8%;height:40px;text-align:center;border:1px solid #336699;">${books.bookType}</td>
					<td style="width:8%;height:40px;text-align:center;border:1px solid #336699;">${books.bookCount}</td>
					<td style="width:8%;height:40px;text-align:center;border:1px solid #336699;">${books.bookNumber}</td>
					<td style="width:20%;height:40px;text-align:center;border:1px solid #336699;">${books.bookAddress_library}-${books.bookAddress_floor}-${books.bookAddress_number}</td>
					<td style="text-align:center;border:1px solid #336699;">&nbsp;</td>
				</tr>
			</c:forEach>		
		</table>
	</c:if>
	<c:if test="${!hasBooks}">
			<div align="center" style="color:red;font-size: 20px">
				未查询到任何内容！
			</div>
			<br />
			<br />
			<br />
			<br />
			<br />
		</c:if>
</body>
</html>