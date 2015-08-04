<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-CN">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>我的发布</title>
<!-- Bootstrap -->
<link href="../css/bootstrap.min.css" rel="stylesheet" />
<link href="../css/fabu1.css" rel="stylesheet" />
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
      <![endif]-->
</head>
<body>
<div class="clearfix"></div>
<div class="eu_fabu_you">
  <div class="eu_fabu_you_One">我的发布</div>
  <div class="eu_fabu_you_Tow">
    <ul>
      <li><a href="index.jsp">最新</a></li>
      <li><a href="index.jsp">展示中</a></li>
      <li><a href="index.jsp">审核中</a></li>
      <li><a href="index.jsp">已删除</a></li>
    </ul>
  </div>
</div>
</body>
</html>
