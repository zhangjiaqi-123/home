<%--
  Created by IntelliJ IDEA.
  User: 86133
  Date: 2020/11/9
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="addone" method="post">
        <input type="hidden" name="id">
        用户名:<input type="text" name="user"><br>
        密码:<input type="text" name="pass"><br>
        性别:<input type="text" name="sex"><br>
        邮箱:<input type="text" name="email"><br>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>
