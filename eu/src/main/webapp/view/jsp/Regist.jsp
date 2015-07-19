<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String projectpath=basePath+"view";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
    <link href="<%=projectpath %>/css/Register.css" rel="stylesheet" />
</head>
<body>

    <div class="container">
        <div class="content">

            <div class="header_logo">
                <img src="../images/u0.png" />
            </div>
            <div class="button">
                <div class="left">
                    <a href="<%=projectpath %>/jsp/Main.jsp">返回首页</a>
                </div>
                <div class="right">
                    <a href="<%=projectpath %>/jsp/Login.jsp">立即登录</a>
                </div>
            </div>
            <div class="clear"style="height:10px;"></div>
            <div class="choose clear" >
                <div class="options ">

                    <button class="card " onclick="Choose('register_con_phone')">手机注册</button>
                    <button class="card email " onclick="Choose('register_con_email')">邮箱注册</button>
                </div>
            </div>


            <!--手机注册-->
            <form action="<%=basePath %>usercontroller/regist.do" method="post" id="form_phone" onsubmit="return check();">
            <div class="register_con " id="register_con_phone">
                <div>
                    <label>手机号：</label>
                    <input type="text" name="mobile" id="mobile_phone" pattern="^0?1[3|4|5|8][0-9]\d{8}$" required="required"
  title="请输入正确的电话号码"/>
                </div>
                <div>
                    <label>密码：</label>
                    <input type="password" name="password" id="password_phone"/>
                </div>
                <div>
                    <label>确认密码：</label>
                    <input type="password" id="ispassword_phone"/>
                </div>
                <div>
                    <div style="width:270px;margin-top:0px;" class="left">
                        <label>验证码：</label>
                        <input type="text" style="width:120px;" id="verification"/>
                    </div>

                    <div style="width: 220px; float: left; margin-top: 0px;">
                    <img src="../images/u24.png" /> <a style="font-size:12px;" href="#">换一张</a>
                    </div>
                </div>
                <div style="clear:both">
                    <input type="checkbox" class="checkbox" style="width:15px;height:15px;" id="checkbox_mobile" checked="checked" disabled="true"/> 我接受
                    <span style="margin-left:30px;"><a>服务条款</a></span>

                </div>

                <div class="register_button">
                    <input type="submit" value="确认注册"></button>
                </div>
            </div>
</form>

     <form action="<%=basePath %>usercontroller/regist.do" method="post" id="form_email" onsubmit="return check();">
            <!--邮箱注册-->
            <div class="register_con" id="register_con_email" style="display:none;">
                <div>
                    <label>用户名：</label>
                    <input type="text" name="userName" id="userName"/>
                </div>

                <div>
                    <label>电子邮箱：</label>
                    <input type="text" name="email" id="email" pattern="^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$" title="请输入正确的邮箱" />
                </div>
                <div>
                    <label>密码：</label>
                    <input type="password" name="password" id="password_email"/>
                </div>
                <div>
                    <label>确认密码：</label>
                    <input type="password" id="ispassword_email"/>
                </div>
                <div>
                    <div style="width: 270px; margin-top: 0px;" class="left">
                        <label>验证码：</label>
                        <input type="text" style="width:120px;" id="verification_email"/>
                    </div>

                    <div style="width: 220px; float: left; margin-top: 0px;">
                        <img src="../images/u24.png" /> <a style="font-size:12px;" href="#">换一张</a>
                    </div>
                    <div style="clear:both">
                        <input type="checkbox" class="checkbox" style="width:15px;height:15px;" id="checkbox_email" checked="checked" disabled="true"/> 我接受
                        <span style="margin-left:30px;"><a>服务条款</a></span>

                    </div>

                    <div class="register_button">
                         <input type="submit" value="确认注册"></button>
                    </div>
                </div>
            </div>
            </form>
        </div>
        <!--<footer></footer>-->

    </div>
</body>
</html>


<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>

<script>


    //改变选项卡点击过后的样式
    $(".card").click(function () {
        $(".card").removeClass("click");
        $(this).addClass("click");
    });



    //在手机注册和邮箱注册直接跳转
    function Choose(id) {
        $(".register_con").css("display", "none");
        var id1 = "#" + id;
        $(id1).css("display", "block");
    }
function check(){
var erro="";
if($(".register_con").css("display")=="block")
{
if($("#password_phone").val()!=$("#ispassword_phone").val() ||$("#password_phone").val()=="")
erro="密码有误,"
}
else{
if($("#userName").val()=="")
erro="用户名不能为空,";
if($("#password_email").val()!=$("#ispassword_email").val() || $("#ispassword_email").val()=="")
erro=erro+"密码有误,";
}
if(erro!="")
{
alert(erro);
return false;
}
return true;
}

/**
判断是否是手机号码
**/
 var regBox = {
        regEmail : /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/,//邮箱
        regName : /^[a-z0-9_-]{3,16}$/,//用户名
        regMobile : /^0?1[3|4|5|8][0-9]\d{8}$/,//手机
        regTel : /^0[\d]{2,3}-[\d]{7,8}$/
    }
</script>

