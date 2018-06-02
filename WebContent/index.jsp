<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/index.css" rel = "stylesheet" type = "text/css">
<title>首页</title>
</head>
	<%@ page import="com.wyu.severlet.Counter" %>
		<%
		Counter CountFileHandler=new Counter();//创建对象
		int count=1;
		if(application.getAttribute("count")==null){
			count=CountFileHandler.readFile(request.getRealPath("/")+"count.txt"); //读取文件获取数据赋给count
			application.setAttribute("count",new Integer(count));
		}
		count=(Integer)application.getAttribute("count");
		if(session.isNew()) ++count;
		//System.out.println(count);
			application.setAttribute("count",count);
			CountFileHandler.writeFile(request.getRealPath("/")+"count.txt",count);//更新文件记录
		%>
	<frameset rows = "5%,90%,5%">
		<frameset cols="50%,50%">
			<frame  style="padding-top: 20px;padding-left: 20px" scrolling="no"  frameborder="0"  src="http://i.tianqi.com/index.php?c=code&id=10&icon=1&num=3"></frame>
			<frame src = "showDate.jsp" id="showDate" frameborder="0" noresize="noresize" scrolling="no">
		</frameset>		
		<frame src = "pagebody.jsp" id="pagebody" frameborder="0" noresize="noresize">
		<frame src = "footer.jsp" id="footer" frameborder="0" noresize="noresize" scrolling="no">
	</frameset>
</html>