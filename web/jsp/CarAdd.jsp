<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/add" method="post">
    <div class="form-group">
        <label for="id">编号</label>
        <input type="number" class="form-control" id="id" name="id" placeholder="id">
    </div>
    <div class="form-group">
        <label for="brand">类型</label>
        <input type="text" class="form-control" id="brand" name="brand" placeholder="brand">
    </div>
    <div class="form-group">
        <label for="name">名称</label>
        <input type="text" class="form-control" id="name" name="name" placeholder="name">
    </div>
    <div class="form-group">
        <label for="price">价格</label>
        <input type="number" class="form-control" id="price" name="price" placeholder="price">
    </div>
    <div><input type="submit" class="form-control"></div>
</form>


</body>
</html>
