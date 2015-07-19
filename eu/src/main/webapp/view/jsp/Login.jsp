<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String projectpath=basePath+"view";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link href="<%=basePath %>/view/css/login.css" rel="stylesheet" />

</head>
<body>
	<div class="container">

		<div class="login_con">

			<div class="header_logo">
				<img src="../images/u0.png" />
			</div>
			<div class="button">
				<div class="left">
					<a href="<%=projectpath %>/jsp/Main.jsp">返回首页</a>
				</div>
				<div class="right">
					<a href="Regist.jsp">立即注册</a>
				</div>
			</div>
			<div class="login_con_right">
				<div>

					<label>用户名/邮箱/手机号：</label> <input type="text" name="data" id="data" />
				</div>
				<div>
					<label>密码：</label> <input type="password" name="password"
						id="password" />
				</div>
				<div style="text-align:left">
					<input type="checkbox" class="checkbox"
						style="width:15px; height:15px;" />下次自动登录 <span
						style="margin-left:150px;"><a href="#">忘记密码？</a></span>
				</div>
				<div>
					<input type="submit" id="login_post" value="登陆">
					</button>
				</div>

				<div>
					<hr />
					<div style="margin-top:3px;">
						<label style="margin-left:0px;">合作网站账号登录</label>
					</div>
				</div>

				<div style="clear:both;">
					<div class="Cooperation left">
						<a href="#"><img src="../images/u22.png" /></a>
					</div>
					<div class="Cooperation left">
						<a href="#"><img src="../images/u22.png" /></a>
					</div>
					<div class="Cooperation left">
						<a href="#"><img src="../images/u22.png" /></a>
					</div>
					<div class="Cooperation left">
						<a href="#"><img src="../images/u22.png" /></a>
					</div>

				</div>
			</div>
		</div>
	</div>
	<script language="javascript" type="text/javascript"
		src="<%=projectpath %>/js/jquery-1.4.2.js"></script>
	<script>
$("#login_post").click(function(){
         var data=$("#data").val();
         var password=$("#password").val();
         if(data.length!=0&&password.length!=0)
         {
          $.post("<%=basePath %>usercontroller/login.do",{data:data,password:password},function(data){
               if(data!="登陆失败")
               {
               $.cookie("Islogin", "true");
               $.cookie("user",data); 
                window.location.href='<%=projectpath%>/jsp/Main.jsp';
                    }
               else
                alert(data);
            });
         }else{
         if(data.length==0)
         alert("请输入账户名");
         else
         alert("请输入密码");
         }
        
})
jQuery.cookie = function(name, value, options) {
	if (typeof value != 'undefined') {
		options = options || {};
		if (value === null) {
			value = '';
			options = $.extend({}, options);
			options.expires = -1;
		}
		var expires = '';
		if (options.expires && (typeof options.expires == 'number' || options.expires.toUTCString)) {
			var date;
			if (typeof options.expires == 'number') {
				date = new Date();
				date.setTime(date.getTime() + (options.expires * 24 * 60 * 60 * 1000));
			} else {
				date = options.expires;
			}
			expires = '; expires=' + date.toUTCString();
		}
		var path = options.path ? '; path=' + (options.path) : '';
		var domain = options.domain ? '; domain=' + (options.domain) : '';
		var secure = options.secure ? '; secure' : '';
		document.cookie = [name, '=', encodeURIComponent(value), expires, path, domain, secure].join('');
		} else {
			var cookieValue = null;
			if (document.cookie && document.cookie != '') {
			var cookies = document.cookie.split(';');
			for (var i = 0; i < cookies.length; i++) {
				var cookie = jQuery.trim(cookies[i]);
				if (cookie.substring(0, name.length + 1) == (name + '=')) {
					cookieValue = decodeURIComponent(cookie.substring(name.length + 1));
					break;
				}
			}
		}
		return cookieValue;
	}
};
</script>
</body>
</html>
