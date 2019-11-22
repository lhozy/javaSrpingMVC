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
                // alert("hello");
                $.ajax({
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"userName":"hehe","password":"123","age":30}',
                    dataType:"json",
                    type:"post",
                    success:function(data){
                        // data服务器端响应的json的数据，进行解析
                        alert("响应返回对象");
                        alert(data);
                        alert(data.userName);
                        alert(data.password);
                        alert(data.age);
                    }
                });
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
