<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String projectPath=basePath+"view";
Long time=System.currentTimeMillis();
System.out.println("${alltraining_types}");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Training.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="<%=projectPath %>/css/bootstrap.min.css" rel="stylesheet" />
    <link href="<%=projectPath %>/css/Eworks.css" rel="stylesheet" />



    <script src="<%=projectPath %>/js/jquery-1.8.3.min.js"></script>

    <link href="<%=projectPath %>/control/css/zyUpload.css" rel="stylesheet" />
    <script src="<%=projectPath %>/control/js/zyUpload.js"></script>
    <script src="<%=projectPath %>/js/demo.js"></script>
    <script src="<%=projectPath %>/js/location.js"></script>
	<script src="<%=projectPath %>/js/area.js"></script>
    <script src="<%=projectPath %>/core/zyFile.js"></script>
  </head>
<body>
    <div class="container">
        <div class="header">
            <div class="title">
                <span>e创中心</span>
            </div>
        </div>
        <div class="e_works_con">
            <div>
                <label>标题：</label><input type="text" class="input" id="titile"/>
            </div>
            <div class="clear address">
                <label class="e_works_con_label">所在区域：</label>
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
                <input type="text" class="input" id="detailed_address"/>
            </div>
            <div class="clear">
                <label class="e_works_con_label">类型：</label>
                <div style="float:left; width:50%; margin-top:0px;">
                    <ul class="gq">
                    <c:forEach items="${alltraining_types}" var="training_type"> 
                     <li><input type="radio" name="supply" value=${training_type.trainingTypeId} />${training_type.title}</li>
                    </c:forEach> 
                    </ul>
                </div>
            </div>
            <div class="clear">
                <label>价格：</label>
                <input type="text" class="insert" id="price"/>
            </div>

            <div>
                <label class="label_align" style="float:left">培训展示：</label>
                <div id="show" class="show"></div>
                
            </div>


            <div class="clear">
                <label class="label_align" style="margin-top:20px;" id="content">详细说明：</label> <textarea style="margin-top:20px;"></textarea>
            </div>
            <div>
                <label>电话：</label> <input type="text" class="insert" id="telphone"/>
            </div>
            <div>
                <label>联系人：</label> <input type="text" class="insert" id="contact"/>
            </div>
            <div>
                <label></label>
                <input type="button" value="确认发布" class="submit" />
            </div>


        </div>
    </div>
   
</body>
<script type="text/javascript">
/**
记录成功的数据
**/
var successpath=new Array();
/**
选择城市
**/
$(document).ready(function(){
		showLocation();
	});

	$(".submit").click(function(){
	$.post("<%=basePath %>TrainingController/addTraining.do",{
	titile:$("#titile").val(),
	provinceId:$('#loc_province option:selected').val(),
	cityId:$('#loc_city option:selected').val(),
	areaId:$('#loc_town option:selected').val(),
	trainingTypeId:$("input[name='supply']:checked").val(),
	userId:3,
	price:$("#price").val(),
	telphone:$("#price").val(),
	contact:$("#contact").val(),
	createTime:<%=34 %>,
	trainingPicture:JSON.stringify(successpath),
	content:$("#price").val(),
	detailedAddress:$("#detailed_address").val()
	},function(data){
	   alert(data);
	});
	});
</script>
</html>
