<%@ page import="entity.Car" %><%--
  Created by IntelliJ IDEA.
  User: 瓜皮
  Date: 2018/8/25
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% Car car = (Car) request.getAttribute("car"); %>

<form action="/update" method="post">
    <div><input type="text" name="brand" placeholder="brand" value="<%= car.getBrand()%>"></div>
    <div><input type="text" name="name" placeholder="name" value="<%= car.getName()%>"></div>
    <div><input type="number" name="price" placeholder="price" value="<%= car.getPrice()%>"></div>
    <div><input type="hidden" name="id" value="<%= car.getId()%>"></div>

    <div><input type="submit" value="提交更新"></div>
</form>
</body>
</html>
