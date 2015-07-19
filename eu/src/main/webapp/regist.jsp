<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'user.jsp' starting page</title>

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
	<form action="usercontroller/addUser.do" method="post">
		用户名: <input type="text" name="data"><br> 密 码:<input
			type="text" name="password"><br> <input type="submit"
			value="注册">
	</form>
	<br>
	<form action="usercontroller/login.do" method="post">
		用户名: <input type="text" name="data"><br>
		 密码:<input type="text" name="password"><br>
		  <input type="submit" value="获取">
	</form>
	<br>
	<%=(request.getSession()).getAttribute("Islogin") %>
	<%
   Cookie[] cookies= request.getCookies();
   if(cookies!=null)
   {
  for(Cookie cookie:cookies)
  {
  if(cookie.getName().equals("Islogin"))
  {
System.out.println(cookie.getName());
System.out.println(cookie.getValue().toString());
}
}
  %>

	<%
  }
   %>
	<a href="index.jsp">跳转测试</a>
</body>
</html>
