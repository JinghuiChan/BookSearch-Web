<%@ page language="java" contentType="text/html; charset=UTF-8"
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
<link href="css/bookDetail.css" rel = "stylesheet" type = "text/css">
<title>图书详细内容</title>
</head>
<body>
	<!-- 导航 -->
		<center>
			<div class="daohang">
				<div>
					<a href="<%=path%>/pagebody.jsp" class="whitea">回到首页</a> >>>>
					<a href="#" class="whitea">图书详细内容</a>
				</div>
			</div>
		</center>
	<!-- 图书详细内容 -->
		<hr width="950px">
		<center>${book.bookName}详细信息</center>
		<center>
			<div style="width:950px;text-align:left;">
				${book.bookName}	/	${book.author} ;	--${book.publish} , 2007.9
				178页； 图； 24cm，	--(${book.bookType})
				<br>
				<br>
				<br>
					本书内容包括:论战争的性质、战争理论、战略概论、战斗、军队、防御、进攻(草稿)、战争计划(草稿)。
				<br>
				<br>
				<br>
				ISBN ${book.isbn};	CNY ${book.isbn};
				Ⅰ.① ${book.bookName}	Ⅱ.① ${book.author} 		Ⅲ. ${book.bookType} 	Ⅳ.① ${book.bookType}
			</div>
		</center>
		
		<br>	
		<hr width="950px">	
		<center>相关资源</center>
		<center>
			<div style="width:950px;text-align:left;">
				目录: 编者的话<br>
				拨开战争的迷雾——《战争论》导读<br>
				初版序<br>
				说明<br>
				作者自序<br>
				第一篇 论战争的性质	<br>
			</div>	
		</center>
			<hr width="950px">
		<center>藏书情况</center>
		<!-- 查询结果 -->
		<table border="0" align="center" width="950px"
				style="margin-top: 10px;border:1px solid #336699;" cellpadding="0"
				cellspacing="0">
				<tr style="height:40px;background:#E6E6FA">
					<td style="width:15%;text-align:center;border:1px solid #336699;">
						书名
					</td>
					<td style="width:20%;text-align:center;border:1px solid #336699;">
						馆藏地
					</td>
					<td  style="width:15%;text-align:center;border:1px solid #336699;">
						索取号
					</td>
					<td  style="width:10%;text-align:center;border:1px solid #336699;">
						状态
					</td>
					<td  style="width:15%;text-align:center;border:1px solid #336699;">
						ISBN
					</td>
					<td  style="width:10%;text-align:center;border:1px solid #336699;">
						借阅类型
					</td>
					<td style="text-align:center;border:1px solid #336699;">
						备注
					</td>
				</tr>
				<% 
					int i=0;
					for(i=0;i<5;i++){
						if(i % 2 ==1){
							%>
							<tr  bgcolor="#E6E6FA" >
				<%			
						}else{					
				%>
					<tr>
				<%
						}
				%>
					<td style="width:15%;height:40px;text-align:center;border:1px solid #336699;">${book.bookName}</td>
					<td style="width:20%;height:40px;text-align:center;border:1px solid #336699;">${book.bookAddress_library}-${book.bookAddress_floor}</td>
					<td style="width:15%;height:40px;text-align:center;border:1px solid #336699;">${book.bookNumber}</td>
					<td style="width:10%;height:40px;text-align:center;border:1px solid #336699;">可供借出</td>
					<td style="width:15%;height:40px;text-align:center;border:1px solid #336699;">${book.isbn}</td>
					<td style="width:10%;height:40px;text-align:center;border:1px solid #336699;">普通图书</td>
					<td style="text-align:center;border:1px solid #336699;">&nbsp;</td>
				</tr>	
			<% 
				}
			%>	
		</table>
</body>
</html>