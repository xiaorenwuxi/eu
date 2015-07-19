<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String projectpath=basePath + "view";
%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
    <link href="<%=projectpath %>/css/bootstrap.min.css" rel="stylesheet" />
    <link href="<%=projectpath %>/css/Eworks.css" rel="stylesheet" />



    <script src="<%=projectpath %>/js/jquery-1.8.3.min.js"></script>
    <script src="<%=projectpath %>/js/jquery-ui.min.js"></script>
	<script src="<%=projectpath %>/js/jquery-ui.js"></script>
	<script src="<%=projectpath %>/js/location.js"></script>
	<script src="<%=projectpath %>/js/area.js"></script>
	<link href="<%=projectpath %>/control/css/zyUpload.css" rel="stylesheet" />
    <link href="<%=projectpath %>/css/jquery-ui.min.css" rel="stylesheet" />
    <link href="<%=projectpath %>/css/jquery-ui.css" rel="stylesheet" />
     <link href="<%=projectpath %>/css/common.css" rel="stylesheet" />
    <script src="<%=projectpath %>/control/js/zyUpload.js"></script>
    <script src="<%=projectpath %>/js/demo.js"></script>
    <script src="<%=projectpath %>/core/zyFile.js"></script>

    <!--上传图片样式-->
    <style type="text/css">
        #preview_img {
            width: 120px;
            height: 120px;
            border: 1px solid #797979;
            overflow: hidden;
        }

        #imghead {
            filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=image);
        }

        .file {
            filter: Alpha(opacity=0);
            -moz-opacity: 0;
            opacity: 0;
            position: relative;
            top: -30px;
            width: 100px;
            height: 25px;
        }
    </style>

</head>
<!--创业信息发布-->
<body>
	<form action="ec/submit.do" method="post" enctype="multipart/form-data">
    <div class="container">

        <div class="header">
            <div class="title">
                <span>e创中心</span>
            </div>
        </div>

        <div class="e_works_con" style="border:0px;">
            <div class="project" style="height:730px;">
                <div class="left" style="width: 150px; height: 100%; padding: 20px 50px;">
                    <div id="preview_img">
                        <img id="imghead" border=0 src="<%=projectpath %>/images/head_180.jpg" width="120" height="120" />
                    </div>
                        <div style=" margin-top:20px;padding-left:20px">
                            <input type="button" value="上传图片" style="width:100px;height:25px;" />
                            <input type="file" class="file" onchange="previewImage(this)" />
                        </div>

                </div>
                <div class="left" style="width:840px;padding-left:30px;">
                    <div>
                        <label>项目名称：</label><input type="text" class="input" id="title"/>
                    </div>
                    <div>
                        <label class="e_works_con_label">所在区域：</label>
                        <div style="float:left;">
                            <select id="loc_province">

                                <option>选择省份</option>
                            </select>&nbsp;&nbsp;
                            <select id="loc_city">
                                <option>选择城市</option>

                            </select>&nbsp;&nbsp;
                            <select id="loc_town">
                                <option>选择区域</option>
                            </select>
                        </div>
                    </div>

                    <div class="clear">
                        <label>详细地址：</label>
                        <input type="text" class="input" />
                    </div>
                    <div>
                        <label>项目方向</label>
                        <input type="text" class="input" id="prodirection"/>
                    </div>
                    <div>
                        <label>简述：</label>
                        <textarea id="proinfo"></textarea>
                    </div>
                    <div class="zhanshi">
                        <label class="label_align" style="float:left">展示：</label>
                        <div id="show" class="show"></div>
                    </div>
                </div>

            </div>


                <div class="project" style="padding-left:170px;">
                    <div>
                        <label class="e_works_con_label">项目阶段</label>
                        <div style="float:left; width:50%;">
                            <ul class="gq">
                                <li><input type="radio" name="supply"  value="1"/>有个好主意</li>
                                <li><input type="radio" name="supply"  value="2"/>产品开发中</li>
                                <li><input type="radio" name="supply"  value="3"/>上线运营</li>

                            </ul>
                        </div>
                    </div>

                    <div class="clear">
                        <label class=" e_works_con_label">项目远景：</label>
                        <div style="float:left;">
                            <ul class="gq">
                                <li>预计&nbsp;&nbsp;<input type="text" style="width:150px" id="valuationTime"> </li>
                                <li>项目估值<input type="text" id="valuationValue"/>&nbsp; 万元</li>
                            </ul>
                        </div>
                    </div>
                    <div class="clear">
                        <label class=" e_works_con_label">融资情况;</label>
                        <div style="float:left;width:50%; padding-top:0px;">
                            <ul class="gq">
                                <li><input type="radio" name="supply" value="1"/>等待预设</li>
                                <li><input type="radio" name="supply" value="2"/> 个人出资</li>
                                <li><input type="radio" name="supply" value="3"/>  天使投资</li>
                            </ul>
                        </div>
                    </div>

                    <div class="clear">
                        <label>融资需求</label>
                        <input type="text" class="insert" id="investmentValue" />万元&nbsp; &nbsp;<span style="color:red">*留空则表示不需要融资</span>
                    </div>
                </div>

                <div class="project" style="padding-left:180px;">

                    <div>
                        <label>团队人数：</label>
                        <input type="text" class="insert" id="tdnumber"/>
                    </div>
                    <div>
                        <label>创始人亮点：</label>
                        <input type="text" class="input" />
                    </div>
                    <div>
                        <label>团队概念:</label>
                        <textarea id="tdconcept"></textarea>
                    </div>

                    <div>
                        <label class="e_works_con_label">合伙召唤：</label>
                        <div style="float:left;width:50%;" class="hehuo">
                            <ul>
                                <li><input type="checkbox" value="1"/> 技术合伙人</li>
                                <li><input type="checkbox" value="2"/> 营销合伙人</li>
                                <li><input type="checkbox" value="3"/> 产品合伙人</li>
                                <li><input type="checkbox" value="4"/> 运营合伙人</li>
                                <li><input type="checkbox" value="5"/> 设计合伙人</li>
                                <li><input type="checkbox" value="6"/> 其他合伙人</li>
                            </ul>
                        </div>
                    </div>


                    <div class="clear">
                        <label>召唤宣言：</label>
                        <textarea></textarea>
                    </div>

                    <div>
                        <label></label>
                        <input type="button" value="提交" class="submit" />
                    </div>
                </div>
        </div>
    </div>
    </form>
</body>
</html>

<script type="text/javascript">
    //图片上传预览    IE是用了滤镜。
    function previewImage(file) {
        var MAXWIDTH = 260;
        var MAXHEIGHT = 180;
        var div = document.getElementById('preview');
        if (file.files && file.files[0]) {
            div.innerHTML = '<img id=imghead>';
            var img = document.getElementById('imghead');
            img.onload = function () {
                var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);
                img.width = rect.width;
                img.height = rect.height;
            }
            var reader = new FileReader();
            reader.onload = function (evt) { img.src = evt.target.result; }
            reader.readAsDataURL(file.files[0]);
        }
        else //兼容IE
        {
            var sFilter = 'filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src="';
            file.select();
            var src = document.selection.createRange().text;
            div.innerHTML = '<img id=imghead>';
            var img = document.getElementById('imghead');
            img.filters.item('DXImageTransform.Microsoft.AlphaImageLoader').src = src;
            var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);
            status = ('rect:' + rect.top + ',' + rect.left + ',' + rect.width + ',' + rect.height);
            div.innerHTML = "<div id=divhead style='width:" + rect.width + "px;height:" + rect.height + sFilter + src + "\"'></div>";
        }
    }
    function clacImgZoomParam(maxWidth, maxHeight, width, height) {
        var param = { top: 0, left: 0, width: width, height: height };
        if (width > maxWidth || height > maxHeight) {
            rateWidth = width / maxWidth;
            rateHeight = height / maxHeight;

            if (rateWidth > rateHeight) {
                param.width = maxWidth;
                param.height = Math.round(height / rateWidth);
            } else {
                param.width = Math.round(width / rateHeight);
                param.height = maxHeight;
            }
        }

        param.left = Math.round((maxWidth - param.width) / 2);
        param.top = Math.round((maxHeight - param.height) / 2);
        return param;
    }
</script>

<script type="text/javascript">
	$(document).ready(function(){
		$("#valuationTime").datepicker();
	});
</script>
<script>
	$(document).ready(function(){
		showLocation();
	});
</script>


<script type="text/javascript">
	
	var successpath = new Array();
	
	$(".submit").click(function(){
		$.post("<%=basePath %>ec/submit.do",{
		title:$("#title").val(),
		provinceId:$('#loc_province option:selected').val(),
		cityId:$('#loc_city option:selected').val(),
		areaId:$('#loc_area option:selected').val(),
		prodirection:$("#prodirection").val(),
		proinfo:$("#proinfo").val(),
		prophase:$("input[name='supply']:checked").val(),
		valuationTime:$("#valuationTime").val(),
		valuationValue:$("#valuationValue").val(),
		/* investment:("input[name='supply']:checked").val(), */
		picurl:JSON.stringify(successpath),
		investmentValue:$("#investmentValue").val(),
		tdnumber:$("#tdnumber").val(),
		tdconcept:$("#tdconcept").val(),
		},
		function(data){
		alert(data)
		});
	});
</script>