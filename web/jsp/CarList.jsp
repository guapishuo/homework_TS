<%@ page import="java.util.List" %>
<%@ page import="entity.Car" %>
<%@ page import="util.WebUtil" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>车城</title>
</head>
<link rel="stylesheet" href="/assets/css/bootstrap.css">
<link rel="stylesheet" href="/assets/css/car_css2.css">
<link rel="stylesheet" href="/assets/css/car_css1.css">
<body>
<%@include file="/layout/Car_Head.jsp"%>
<%@include file="/layout/CarBody.jsp"%>

    <%=WebUtil.popSessionMsg(request)%>
<form action="/del" method="post">
       <table class="table table-striped">
        <tr>
            <th>编号</th>
            <th>类型</th>
            <th>名称</th>
            <th>价格</th>
            <th>操作</th>
        </tr>
        <% List<Car>cars = (List<Car>) request.getAttribute("cars");
            for (Car car : cars){
        %>
        <tr>
            <td><%=car.getId() %></td>
            <td><%=car.getBrand()%></td>
            <td><a href="/detail?id=<%=car.getId()%>"><%=car.getName() %></a></td>
            <td><%=car.getPrice()%></td>
            <td>
                <a  href="<c:url value="/add" />">添加</a>
                <a href="/update?id=<%=car.getId() %>">更新</a>
                <a href="/del?id=<%=car.getId() %>">删除</a>
            </td>

        </tr>
        <%
            }
        %>
       </table>
    </form>
<script src="/assets/js/bootstrap.js"  crossorigin="anonymous"></script>
<script src="/assets/js/car_js.js"  crossorigin="anonymous"></script>
<script src="/assets/js/car_js1.js"  crossorigin="anonymous"></script>
<script src="/assets/js/jquery-1.11.3.min.js"  crossorigin="anonymous"></script>
</body>
</html>
