<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%-- <%
	request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request,response);
 %>
 --%><html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <table width="60%" border="1" cellpadding="2" cellspacing="0">
  	<tr>
  		<th>sysevent_id</th>
  		<th>uname</th>
  		<th>action</th>
  		<th>create_time</th>
  		<th>ip</th>
  	</tr>
  	<c:forEach items="${emps }" var="emp">
  		<tr>
  			<td>${emp.sysevent_id }</td>
  			<td>${emp.uname }</td>
  			<td>${emp.action }</td>
  			<td>${emp.create_time }</td>
  			<td>${emp.ip }</td>
  		
  		</tr>	
  	</c:forEach>
  </table>
  </body>
</html>
