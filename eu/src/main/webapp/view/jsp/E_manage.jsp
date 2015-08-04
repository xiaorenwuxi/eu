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
<title>e众管理</title>
<!-- Bootstrap -->
<link href="../css/bootstrap.min.css" rel="stylesheet" />
<link href="../css/E_manage.css" rel="stylesheet" />
</head>
<body>
<div class="clearfix"></div>
<div class="eu_E_manage_you">
  <div class="eu_E_manage_you_One">e众管理</div>
  <div class="eu_E_manage_you_Tow">
    <ul>
      <li>微信公众号设置</li>
      <li>易信公众号设置</li>
    </ul>
  </div>
</div>
</body>
</html>