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
    <title>发布房源信息</title>
    <link href="<%=projectpath %>/css/bootstrap.min.css" rel="stylesheet" />
    <link href="<%=projectpath %>/css/Eworks.css" rel="stylesheet" />
    <script src="<%=projectpath %>/js/jquery-1.8.3.min.js"></script>
    <link href="<%=projectpath %>/control/css/zyUpload.css" rel="stylesheet" />
    <script src="<%=projectpath %>/control/js/zyUpload.js"></script>
    <script src="<%=projectpath %>/js/demo.js"></script>
    <script src="<%=projectpath %>/core/zyFile.js"></script>
     <script src="<%=projectpath%>/js/area.js"></script>
	<script src="<%=projectpath%>/js/location.js"></script>
</head>

   <!--房源发布信息-->
<body>
    <div class="container">

        <div class="header">
            <div class="title">
                <span>e创中心</span>
            </div>
        </div>
	<form action="/eu/houseinfo/add.do" method="post">
        <div class=" e_works_con">
            <div>
                <label>标题：</label><input type="text" class="input" name="title" id="title" />
            </div>
            <div>
                <label class="e_works_con_label">供求：</label>
                <div style="float:left; width:50%;">
                    <ul class="gq">
                        <li><input type="radio" name="supply" id="1"/>出租</li>
                        <li><input type="radio" name="supply" id="2"/>求租</li>
                        <li><input type="radio" name="supply" id="3"/>转让</li>
                        <li><input type="radio" name="supply" id="4"/>求购</li>
                        <li><input type="radio" name="supply" id="5"/>出售</li>
                    </ul>
                </div>
            </div>
            <div class="clear address">
                <label class="e_works_con_label ">所在区域：</label>
                <div>
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
                <input type="text" class="input" name="address" id="address"/>
            </div>
            <div>
                <label>类型：</label><select id="Select1" class="input">
                    <option name="houseTypeId" id="houseTypeId">选择房源类型</option>

                </select>
            </div>
            <div class="clear">
                <label>适用：</label><select id="Select1" class="input" name="apply" id="apply">
                    <option></option>

                </select>
            </div>
            <div class="clear">
                <label>面积：</label>
                <input type="text" class="insert" name="acreage" id="acreage"/>
            </div>
            <div>
                <label>价格：</label>
                <input type="text" class="insert"  name="price" id="price"/>
            </div>
            <div>
                <label class="label_align" style="float:left">展示：</label>
                <div id="show" class="show" name="picarr" ></div>
            </div>
            <div class="clear">
                <label class="label_align">补充说明：</label> <textarea name="content"></textarea>
            </div>
            <div>
                <label>电话：</label> <input type="text" class="insert"  name="telphone" id="telphone"/>
            </div>
            <div>
                <label>联系人：</label>
                <input type="text" class="insert"  name="contact" id="contact"/>
                <!-- <input type="checkbox" /> 我是经纪人 -->
            </div>
            <div>
                <label></label>
                <input type="submit" value="确认发布" class="submit" />
            </div>
        </div>
        </form>
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