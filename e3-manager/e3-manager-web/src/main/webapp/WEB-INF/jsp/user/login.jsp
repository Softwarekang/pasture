<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<link href="${pageContext.request.contextPath }/static/css/login/login.css" rel="stylesheet" type="text/css">
<body>
	<div class="title">
		<pre>
"健康是我们努力的前提，天然是我们不变的底线."
	</pre>
		<div class="ath">---智慧农场</div>
	</div>
	<!--内容-->
	<div class="wrapper">
		<div class="header">欢迎您的到来</div>

		<form action="${pageContext.request.contextPath }/user/login.action" method="post">
			<ul>
				<li>
					<div class="text">
						<span class="yonghu">${loginInfo }</span><input type="text" name="userName"
							placeholder="请输入用户名">
					</div>
				</li>
				<li>
					<div class="password">
						<span class="mima"></span><input type="password" name="passWord"
							placeholder="请输入密码">
					</div>
				</li>
				<li class="remember"><input type="checkbox">记住我</li>

				<li><a href="主页面.html"><input type="submit" value="登陆"></a>
				</li>
			</ul>
		</form>

	</div>
</body>
</html>