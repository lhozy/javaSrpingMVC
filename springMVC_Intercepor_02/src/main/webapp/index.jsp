<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/22
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>test</h3>
<a href="user/testUser">登录</a><br/>
<a href="user/testUser2">注册</a><br/><br/>
<a href="user/testException">异常</a><br/><br/>

<form action="user/logon" method="post">
    账号：<input type="text" name="userName"><br/>
    密码：<input type="text" name="password"><br/>
    <input type="submit" value="注册">
</form>
<br/>
<br/>
<form action="user/login" method="post">
    账号：<input type="text" name="userName"><br/>
    密码：<input type="text" name="password"><br/>
    <input type="submit" value="登录">
</form>
</body>
</html>
