<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String projectpath=basePath+"view";
%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <link href="<%=projectpath %>/css/Account.css" rel="stylesheet" />
    <link href="<%=projectpath %>/css/bootstrap.min.css" rel="stylesheet" />
    <link href="<%=projectpath %>/css/Eworks.css" rel="stylesheet" />
    <!-- 展示图片-->
    <script src="<%=projectpath %>/js/jquery-1.8.3.min.js"></script>
    <link href="<%=projectpath %>/control/css/zyUpload.css" rel="stylesheet" />
    <script src="<%=projectpath %>/control/js/zyUpload.js"></script>
    <script src="<%=projectpath %>/js/demo.js"></script>
    <script src="<%=projectpath %>/core/zyFile.js"></script>
     <script src="<%=projectpath%>/js/area.js"></script>
	<script src="<%=projectpath%>/js/location.js"></script>
</head>

<!--办公设备发布-->

<body>
    <div class="container">

        <div class="header">
            <div class="title">
                <span>e创中心</span>
            </div>
        </div>

        <div class=" e_works_con">
            <div>
                <label>标题：</label><input type="text" class="input" />
            </div>
            <div>
                <label class="e_works_con_label">来源：</label>
                <div style="float:left; width:50%;">
                    <ul class="gq">
                        <li><input type="radio" name="supply" />个人转让</li>
                        <li><input type="radio" name="supply" />商家转让</li>
                    </ul>
                </div>
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
                <label>详细地址</label>
                <input type="text" class="input" />
            </div>
            <div>
                <label>类型：</label><select id="Select1" class="input">
                    <option>选择办公设备类型</option>

                </select>
            </div>
            <div>
                <label>新旧：</label> <select id="Select1" class="input">
                    <option>选择办公设备新旧程度</option>

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
                <input type="button" value="提交" class="submit" />
            </div>


        </div>
    </div>
    
</body>
</html>
<script>
	$("document").ready(function(){
	
		showLocation();
	});
</script>
<script>
var successpath = new Array();




</script>
