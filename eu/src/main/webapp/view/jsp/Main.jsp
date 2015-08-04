<%@page import="org.apache.tomcat.util.http.Cookies"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String projectpath=basePath+"view";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-CN">
<base href="<%=basePath %>">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>优轩eu</title>
<!-- Bootstrap -->
<link href="<%=projectpath %>/css/bootstrap.min.css" rel="stylesheet" />
<link href="<%=projectpath %>/css/index.css" rel="stylesheet" />
<link href="<%=projectpath %>/css/lanrenzhijia.css" rel="stylesheet" type="text/css" />
<script language="javascript" type="text/javascript" src="<%=projectpath %>/js/jquery-1.4.2.js"></script>
<script language="javascript" type="text/javascript" src="<%=projectpath %>/js/lanrenzhijia.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
      <![endif]-->
</head>
<body>
<div class="container-fluid">
  <div class="clearfix"></div>
  <div class="header">
    <div id="menu">
      <ul id="nav">
        <li class="mainlevel"><span class="note">Chocolate Bar</span></li>
        <li class="mainlevel"><a href="#" target="Main">主页</a><!--input an em tag as a space,IE is gread need--> 
        </li>
        <li class="mainlevel"><a href="<%=projectpath %>/jsp/chuangye.jsp">e创中心</a>
          <ul class="sub_nav_01">
            <li><a href="#">e优孵化</a></li>
            <li><a href="#">e客融资</a></li>
            <li><a href="#">e合伙</a></li>
            <li><a href="<%=basePath%>training_typeController/getallform.do">e优培训</a></li>
          </ul>
        </li>
        <li class="mainlevel"><a href="#">We-works中心</a>
          <ul class="sub_nav_01">
            <li><a href="#">e房源</a></li>
            <li><a href="#">e设备</a></li>
            <li><a href="#">e代办</a></li>
            <li><a href="#">We-works定制</a></li>
          </ul>
        </li>
        <li class="mainlevel"><a href="#">e办公系统</a> </li>
        <li class="mainlevel"><a href="#">SME联盟</a> </li>
        <li class="mainlevel"><a href="#">e营销系统</a></li>
        <li class="mainlevel"><a href="#">e客社区</a></li>
      </ul>
    </div>
    <div class="header_input">
      <input type="button" value="登录" id="login_input" style="margin-right:15px;"/>
      <input type="button" value="注册" id="regist_input"/>
    </div>
  </div>
  <div class="header_list">
    <div class="header_list_One">
      <div class="header_list_One_select">
        <select>
          <option>房源搜索</option>
          <option>代办公服务搜索</option>
        </select>
        <input type="text" style="width:54.6%; outline:none; float:left;"/>
        <input type="button" value="提交" style="float:left;"/>
      </div>
      <input id="release" type="button" value="免费发布信息"  class="but"/>
    </div>
    <div class="header_list_Three">
      <h1>图片</h1>
    </div>
    <div class="header_list_Four">
      <div class="header_list_Four_list">
        <div class="header_list_Four_list_we_zuo"><img src="../images/u49.png"/> </div>
        <div class="header_list_Four_list_we_you">
          <h5>We-works服务</h5>
          <span>Lorem ipsum dolor sit amet, consectetur adipiscing elit.<br />
          Aenean euismod bibendum<br />
          laoreet. Proin </span> </div>
      </div>
      <div class="header_list_Four_list">
        <div class="header_list_Four_list_we_zuo"><img src="../images/u49.png"/> </div>
        <div class="header_list_Four_list_we_you">
          <h5>e优系统</h5>
          <span>Lorem ipsum dolor sit amet, consectetur adipiscing elit.<br />
          Aenean euismod bibendum<br />
          laoreet. Proin </span> </div>
      </div>
      <div class="header_list_Four_list">
        <div class="header_list_Four_list_we_zuo"><img src="../images/u49.png"/> </div>
        <div class="header_list_Four_list_we_you">
          <h5>e创中心</h5>
          <span>Lorem ipsum dolor sit amet, consectetur adipiscing elit.<br />
          Aenean euismod bibendum<br />
          laoreet. Proin </span> </div>
      </div>
      <div class="header_list_Four_list">
        <div class="header_list_Four_list_we_zuo"><img src="../images/u49.png"/> </div>
        <div class="header_list_Four_list_we_you">
          <h5>SME联盟</h5>
          <span>Lorem ipsum dolor sit amet, consectetur adipiscing elit.<br />
          Aenean euismod bibendum<br />
          laoreet. Proin </span> </div>
      </div>
    </div>
    <div class="header_list_Five">
      <div class="header_list_Five_zuo">
        <div class="header_list_Five_zuo1">
          <div class="header_list_Five_zuo1_1">1</div>
          <div class="header_list_Five_zuo1_2">2</div>
        </div>
        <div class="header_list_Five_zuo2">
          <div class="header_list_Five_zuo2_1">1</div>
          <div class="header_list_Five_zuo2_2">2</div>
          <div class="header_list_Five_zuo2_3">3</div>
        </div>
        <div class="header_list_Five_zuo3">
          <div class="header_list_Five_zuo3_1">1</div>
          <div class="header_list_Five_zuo3_2">2</div>
        </div>
      </div>
      <div class="header_list_Five_you">
        <div class="header_list_Five_you1">
          <div class="header_list_Five_you1_1">1</div>
          <div class="header_list_Five_you1_2">2</div>
          <div class="header_list_Five_you1_3">3</div>
        </div>
        <div class="header_list_Five_you2">
          <div class="header_list_Five_you2_1">1</div>
          <div class="header_list_Five_you2_2">2</div>
          <div class="header_list_Five_you2_3">3</div>
        </div>
        <div class="header_list_Five_you3">
          <div class="header_list_Five_you3_1">1</div>
          <div class="header_list_Five_you3_2">2</div>
        </div>
      </div>
    </div>
    <div class="footer"></div>
  </div>
</div>
<script type="text/javascript">
    $("#login_input").click(function(){
        window.location.href='<%=projectpath%>/jsp/Login.jsp';
    });
        $("#regist_input").click(function(){
        window.location.href='<%=projectpath%>/jsp/Regist.jsp';
    });
    $("#release").click(function(){
    	window.location.href='<%=projectpath%>/jsp/fabu.jsp'
    });
</script>
</body>
</html>
