<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/21
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>注解</h3>
<a href="anno/testRequestParam?name=wangwu">testRequestParam</a>
<br>

<form action="anno/testRequestBody" method="post">
    用户姓名：<input type="text" name="username" /><br/>
    用户年龄：<input type="text" name="age" /><br/>
    <input type="submit" value="提交" />
</form>
<br>
<br>
<a href="anno/testPathVariable/10">testPathVariable</a>
<br>

<a href="anno/testRequestHeader">RequestHeader</a>

<br>

<a href="anno/testCookieValue">CookieValue</a>

<br>

<form action="anno/testModelAttribute" method="post">
    用户姓名：<input type="text" name="uname" /><br/>
    用户年龄：<input type="text" name="age" /><br/>
    <input type="submit" value="提交" />
</form>

<br>


<a href="anno/testSessionAttributes">testSessionAttributes</a>
<a href="anno/getSessionAttributes">getSessionAttributes</a>
<a href="anno/delSessionAttributes">delSessionAttributes</a>

<br>
</body>
</html>
