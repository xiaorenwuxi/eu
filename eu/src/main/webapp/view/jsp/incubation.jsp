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
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
    <link href="<%=projectpath %>/css/bootstrap.min.css" rel="stylesheet" />
    <link href="<%=projectpath %>/css/Eworks.css" rel="stylesheet" />
    <script src="<%=projectpath %>/js/jquery-1.8.3.min.js"></script>
 <script src="<%=projectpath%>/js/area.js"></script>
	<script src="<%=projectpath%>/js/location.js"></script>
    <style>
        .file {
            filter: Alpha(opacity=0);
            -moz-opacity: 0;
            opacity: 0;
            position: relative;
            top: -25px;
            width: 100px;
            height: 25px;
        }
    </style>
</head>

<!--孵化合作发布-->
<body>
    <div class="container">

        <div class="header">
            <div class="title">
                <span>e创中心</span>
            </div>
        </div>

        <div class="e_works_con">
            <div>
                <label>标题：</label><input type="text" class="input" name="title" id="title" />
            </div>
            <!--服务类型-->
            <div>
                <label class="e_works_con_label">服务类型：</label>
                <div style="float:left; width:50%;">
                    <ul class="gq">
                        <li><input type="radio" name="Service" checked="checked" onclick="ServiceContent('e_works_4_content_1')" />技术支持</li>
                        <li><input type="radio" name="Service" onclick="ServiceContent('e_works_4_content_2')" />营销支持</li>
                        <li><input type="radio" name="Service" onclick="ServiceContent('e_works_4_content_3')" />联合办公</li>
                        <li><input type="radio" name="Service" onclick="ServiceContent('e_works_4_content_4')" />政策需求</li>
                        <li><input type="radio" name="Service" onclick="ServiceContent('e_works_4_content_5')" />法律合作</li>
                    </ul>
                </div>
            </div>
            <!--技术支持-->
            <div class="e_works_4_content" id="e_works_4_content_1">
                <div class="clear">
                    <label class="e_works_con_label">技术共享：</label>
                    <div style="float:left; width:50%; margin-top:0px;">
                        <ul class="gq">
                            <li><input type="radio" name="supply" />需求</li>
                            <li><input type="radio" name="supply" />供给</li>
                        </ul>
                    </div>
                </div>

                <div class="clear address">
                    <label class="e_works_con_label ">服务区域：</label>
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

                <div>
                    <label>办公地址</label>
                    <input type="text" class="input" />
                </div>
                <div class="clear">
                    <label>类型：</label>
                    <select class="input">
                        <option></option>
                    </select>
                </div>

                <div class="clear">
                    <label class="e_works_con_label">报酬：</label>
                    <div class="price" style="margin-top:0px;">
                        <select id="Select1" class="incubation clear">
                            <option>孵化价格</option>
                        </select>
                        <input type="text" class="insert" />
                    </div>
                </div>
                <div>
                    <div class="clear" style="padding-top:20px;">
                        <label>补充说明：</label> <textarea></textarea>
                    </div>
                    <div>
                        <label>电话：</label><input type="text" class="insert" />
                    </div>

                    <div>
                        <label>联系人：</label><input type="text" style="width:40%" class="insert" />
                    </div>

                    <div>
                        <label></label>
                        <input type="button" value="提交" class="submit" />
                    </div>
                </div>


            </div>

            <!--营销支持-->
            <div class="e_works_4_content" id="e_works_4_content_2" style="display:none">
                <div class="clear">
                    <label class="e_works_con_label">技术共享：</label>
                    <div style="float:left; width:50%; margin-top:0px;">
                        <ul class="gq">
                            <li><input type="radio" name="supply" />需求</li>
                            <li><input type="radio" name="supply" />供给</li>
                        </ul>
                    </div>
                </div>

                <div class="clear address">
                    <label class="e_works_con_label ">服务区域：</label>
                    <div>
                        <select id="Select1">

                            <option>选择省份</option>
                        </select>&nbsp;&nbsp;&nbsp;
                        <select id="Select2">
                            <option>选择城市</option>

                        </select>&nbsp;&nbsp;&nbsp;
                        <select id="Select3">
                            <option>选择区域</option>

                        </select>
                    </div>
                </div>

                <div>
                    <label>办公地址</label>
                    <input type="text" class="input" />
                </div>
                <div class="clear">
                    <label>类型：</label>
                    <select class="input">
                        <option></option>
                    </select>
                </div>

                <div class="clear">
                    <label class="e_works_con_label">报酬：</label>
                    <div class="price" style="margin-top:0px;">
                        <select id="Select1" class="incubation clear">
                            <option>孵化价格</option>
                        </select>
                        <input type="text" class="insert" />
                    </div>
                </div>
                <div>
                    <div class="clear" style="padding-top:20px;">
                        <label>补充说明：</label> <textarea></textarea>
                    </div>
                    <div>
                        <label>电话：</label><input type="text" class="insert" />
                    </div>

                    <div>
                        <label>联系人：</label><input type="text" style="width:40%" class="insert" />
                    </div>

                    <div>
                        <label></label>
                        <input type="button" value="提交" class="submit" />
                    </div>
                </div>


            </div>
            <!--联合办公-->
            <div class="e_works_4_content" id="e_works_4_content_3" style="display:none">
                <div>
                    <label class="e_works_con_label">供求类型：</label>
                    <div style="float:left; width:50%; margin-top:0px; margin-bottom:20px;">
                        <ul class="gq">
                            <li><input type="radio" name="supply" checked="checked" onclick="UnofficeTypeChoose('unoffice_type_1')" />办公房源出租</li>
                            <li><input type="radio" name="supply" onclick="UnofficeTypeChoose('unoffice_type_2')" />办公设备出租</li>
                            <li><input type="radio" name="supply" onclick="" />办公设备出售</li>
                        </ul>
                    </div>

                    <!--联合办公—办公房源出租-->
                    <div class="unoffice_typy" id="unoffice_type_1">
                        <iframe src="Unoffice1.html" scrolling="no" height="900"></iframe>
                    </div>
                    <!--联合办公—办公设备出租-->
                    <div class="unoffice_typy" id="unoffice_type_2" style="display:none">
                        <iframe src="Unoffice2.html" scrolling="no" height="980"></iframe>
                    </div>
                    <!--联合办公—办公设备出租-->
                    <div class="unoffice_typy" id="unoffice_type_3" style="display:none">
                        <iframe></iframe>
                    </div>
                </div>

            </div>
            <!--政策需求-->
            <div class="e_works_4_content" id="e_works_4_content_4" style="display:none">
                <div class=" clear">
                    <label class="e_works_con_label">信息类型：</label>
                    <div style="float:left; width:50%; margin-top:0px; margin-bottom:20px;">
                        <ul class="gq">
                            <li><input type="radio" name="supply" checked="checked" onclick="TypeChoose('e_works_4_content_4_1')" />政策信息发布</li>
                            <li><input type="radio" name="supply" onclick="TypeChoose('e_works_4_content_4_2')" />相关业务代办</li>
                        </ul>
                    </div>


                    <!--政策信息发布-->
                    <div class="e_works_4_content_type" id="e_works_4_content_4_1">
                        <div class="clear">
                            <label class="e_works_con_label">服务区域：</label>
                            <div style="float:left;width:50%;margin-top:0px;margin-bottom:20px; ">
                                <select id="Select1">

                                    <option>选择省份</option>
                                </select>&nbsp;&nbsp;&nbsp;
                                <select id="Select2">
                                    <option>选择城市</option>

                                </select>&nbsp;&nbsp;&nbsp;
                                <select id="Select3">
                                    <option>选择区域</option>

                                </select>
                            </div>
                        </div>
                        <div class="clear">
                            <label>详细地址：</label>
                            <input type="text" class="input" />
                        </div>

                        <div class="clear">
                            <label class="label_align">政策信息：</label> <textarea></textarea>
                        </div>
                        <div>
                            <label class="left">文档上传：</label>
                            <div class="left" style="margin-top:0px;">
                                <input type="button" value="上传相关文档" style="width:100px;height:25px;" />
                                <input type="file" class="file" />
                            </div>

                        </div>
                        <div class="clear">
                            <label></label>
                            <input type="button" value="确认发布" class="submit" />
                        </div>

                    </div>

                    <!--相关业务代办-->
                    <div class="e_works_4_content_type" id="e_works_4_content_4_2" style="display:none">
                        <iframe src="PoliticalDemand2.html" scrolling="no" height="850"></iframe>
                    </div>
                </div>

            </div>


            <!--法律合作-->
            <div class="e_works_4_content" id="e_works_4_content_5" style="display:none">
                <div><iframe src="law.html" scrolling="no" height="850"></iframe></div>

            </div>

        </div>
    </div>

</body>
</html>

<script>

    //点击单选按钮  跳转不同的页面
    function ServiceContent(id) {
        $(".e_works_4_content").css("display", "none");
        var id1 = "#" + id;
        $(id1).css("display", "block");
    }


    function TypeChoose(id) {

        $(".e_works_4_content_type").css("display", "none");
        var id1 = "#" + id;
        $(id1).css("display", "block");
    }


    function UnofficeTypeChoose(id) {

        $(".unoffice_typy").css("display", "none");
        var id1 = "#" + id;
        $(id1).css("display", "block");
    }
</script>
<script>
	$("document").ready(function(){
	
		showLocation();
	});
</script>
<script>
var successpath = new Array();




</script>
