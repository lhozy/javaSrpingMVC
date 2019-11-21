<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/20
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--封装到基本数据及对象
<form action="param/saveAccount" method="post">
    账号：<input type="text" name="accountName"><br/>
    密码：<input type="text" name="psw"><br/>
    余额：<input type="text" name="money"><br/>
    用户名：<input type="text" name="user.uname"><br/>
    年龄：：<input type="text" name="user.age"><br/>
    <input type="submit" value="提交">
</form>
--%>
<%--封装到集合
<form action="param/saveAccountListMap" method="post">
    账号：<input type="text" name="accountName"><br/>
    密码：<input type="text" name="psw"><br/>
    余额：<input type="text" name="money"><br/>
    List用户名：<input type="text" name="userList[0].uname"><br/>
    List年龄：：<input type="text" name="userList[0].age"><br/>
    Map用户名：<input type="text" name="userMap['one'].uname"><br/>
    Map年龄：：<input type="text" name="userMap['one'].age"><br/>
    <input type="submit" value="提交">
</form>
--%>
<%--自定义日期类型转换器--%>
<form action="param/saveAccountDate" method="post">
    账号：<input type="text" name="accountName"><br/>
    密码：<input type="text" name="psw"><br/>
    余额：<input type="text" name="money"><br/>
    date：<input type="text" name="date"><br/>
    <input type="submit" value="提交">
</form>

</body>
</html>
