<%@ page import="entity.Car" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<body>
<% Car car = (Car) request.getAttribute("car"); %>

<div style="padding: 100px 100px 10px;">

<form class="bs-example bs-example-form" role="form" action="/update" method="post">
    <div class="input-group">
        <input class="form-control" type="text" name="brand" placeholder="brand" value="<%= car.getBrand()%>"></div></br>
    <div class="input-group">
        <input class="form-control" type="text" name="name" placeholder="name" value="<%= car.getName()%>"></div></br>
    <div class="input-group">
        <input class="form-control" type="number" name="price" placeholder="price" value="<%= car.getPrice()%>"></div></br>
    <div class="input-group">
        <input class="form-control" type="hidden" name="id" value="<%= car.getId()%>"></div></br>

    <div class="input-group">
        <input type="submit"class="btn btn-primary" value="提交更新"></div>
</form>

</div>
</body>
</html>
