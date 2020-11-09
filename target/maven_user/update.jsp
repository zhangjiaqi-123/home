<%--
  Created by IntelliJ IDEA.
  User: 86133
  Date: 2020/11/9
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="/update" method="post">
        <input type="hidden" value="${user.id}" name="id"><br>
        用户名:<input type="text" name="user" value="${user.name}"><br>
        密码:<input type="text" name="pass" value="${user.pass}"><br>
        性别:<input type="text" name="sex" value="${user.sex}"><br>
        邮箱:<input type="text" name="email" value="${user.email}"><br>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>
