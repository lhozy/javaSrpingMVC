<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/21
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
        // 页面加载，绑定单击事件
        $(function () {
            $("#btn").click(function(){
                alert("hello");
            });
        });


    </script>
</head>
<body>
<a href="user/testString">test string</a><br/>
<a href="user/testVoid">testVoid</a><br/>
<a href="user/testModelAndView">testModelAndView</a><br/>
<a href="user/testForwardAndRedirect">test 使用关键字转发重定向</a><br/>

<button name="btn" id="btn">ajax</button>

</body>
</html>
