<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
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
  <form action="usercontroller/login.do">
<input type="text" name="data"> 
<input type="text" name="password">
<input type="submit">
</form>
  <%
    Cookie[] cookies=request.getCookies();
if(cookies!=null)
{
System.out.println("cookies长度：+"+cookies.length);
    for(Cookie cookie:cookies)
    {
      System.out.println("cookie名称："+cookie.getName());
    System.out.println("cookie值："+cookie.getValue().toString());
//     cookie.setMaxAge(0);
//     if((cookie.getName()).equals("Islogin"))
//     {
//      System.out.println("您已经登陆"+cookie.getValue().toString());
//        if(cookie.getValue().toString().equals("true"));
//        System.out.println("您已经登陆");
//        }
    }
    }
    %>
  </body>
</html>
