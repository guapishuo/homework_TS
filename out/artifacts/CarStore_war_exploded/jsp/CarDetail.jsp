<%@ page import="entity.Car" %>
<%@ page import="util.WebUtil" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Car car= (Car) request.getAttribute("car");
%>

<%= WebUtil.popSessionMsg(request) %>

<h1>详情</h1>
<ul class="list-group">
    <li class="list-group-item"><%=car.getBrand()%></li>
    <li class="list-group-item"><%=car.getName()%></li>
    <li class="list-group-item"><%=car.getPrice()%></li>
</ul>
<a href="/index">返回主页面</a>
</body>
</html>
