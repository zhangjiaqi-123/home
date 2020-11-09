<%--
  Created by IntelliJ IDEA.
  User: 86133
  Date: 2020/11/9
  Time: 14:01
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
    <table border="1">
        <tr>
            <td>id</td>
            <td>用户名</td>
            <td>密码</td>
            <td>性别</td>
            <td>email</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.pass}</td>
            <td>${user.sex}</td>
            <td>${user.email}</td>
            <td><a href="/selectById?id=${user.id}">update</a>|<a href="deleteOne?id=${user.id}">del</a></td>
        </tr>
        </c:forEach>
        <tr>
            <th><a href="addone.jsp">新增</a></th>
        </tr>
    </table>
</div>
</body>
</html>
