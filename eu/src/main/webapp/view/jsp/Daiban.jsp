<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String projectPath=basePath+"view";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Daiban.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <link href="<%=projectPath %>/css/bootstrap.min.css" rel="stylesheet" />
    <link href="<%=projectPath %>/css/Eworks.css" rel="stylesheet" />


    <!-- 展示图片-->
    <script src="<%=projectPath %>/js/jquery-1.8.3.min.js"></script>

    <link href="<%=projectPath %>/control/css/zyUpload.css" rel="stylesheet" />
    <script src="<%=projectPath %>/control/js/zyUpload.js"></script>
    <script src="<%=projectPath %>/js/demo.js"></script>
    <script src="<%=projectPath %>/core/zyFile.js"></script>
    <script src="<%=projectPath %>/js/location.js"></script>
	<script src="<%=projectPath %>/js/area.js"></script>
</head>

 <!--代办服务发布-->
<body>
    <div class="container">

        <div class="header">
            <div class="title">
                <span>e创中心</span>
            </div>
        </div>

        <div class="e_works_con">
            <div>
                <label>标题：</label><input type="text" class="input" />
            </div>
            <div class="address">
                <label class="e_works_con_label">服务区域：</label>
                <div style="float:left;width:50%;">
                    <select id="loc_province">

                        <option>选择省份</option>
                    </select>&nbsp;&nbsp;&nbsp;
                    <select id="loc_city">
                        <option>选择城市</option>

                    </select>&nbsp;&nbsp;&nbsp;
                    <select id="loc_town">
                        <option>选择区域</option>

                    </select>
                </div>
            </div>
            <div class="clear">
                <label>详细地址：</label>
                <input type="text" class="input" />
            </div>
            <div class="clear">
                <label>类型：</label><select id="Select1" class="input">
                    <option>选择代办服务类型</option>

                </select>
            </div>
            <div>
                <label>价格：</label> <input type="text" class="insert" />
            </div>
            <div>
                <label class="label_align" style="float:left">展示：</label>
                <div id="show" class="show"></div>
            </div>
            <div class="clear">
                <label class="label_align">补充说明：</label> <textarea></textarea>
            </div>
            <div>
                <label>电话：</label> <input type="text" class="insert" />
            </div>
            <div>
                <label>联系人：</label> <input type="text" class="insert" />
            </div>
            <div>
                <label></label>
                <input id="button_submit" type="button" value="提交" class="submit" />
            </div>


        </div>
    </div>
    <script>
/**
选择城市
**/
$(document).ready(function(){
		showLocation();
	});
	
	$("#button_submit").click(function(){
	$.post("url",{},function(){
	
	});
	});
    </script>
</body>
</html>
