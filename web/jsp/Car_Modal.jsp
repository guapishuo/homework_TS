<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form action="/update" method="post" class="form-horizontal" >
    <!-- 模态框（Modal） -->
    <div class="modal fade" id="myModal" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title" id="myModalLabel">修改车辆信息</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label for="CarId" class="col-sm-2 control-label">ID</label>
                        <div class="col-sm-10">
                            <input type="text" id="CarId" class="form-control" name="id" readonly="readonly">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="CarBrand" class="col-sm-2 control-label">类型</label>
                        <div class="col-sm-10">
                            <input type="number" step="0.001" class="form-control" id="CarBrand" placeholder="类型" name="brand">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="CarName" class="col-sm-2 control-label">车名</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="CarName" placeholder="书名" name="name">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="CarPrice" class="col-sm-2 control-label">价格</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="CarPrice" placeholder="价格" name="price">
                        </div>
                    </div>

                </div>
                <div class="modal-footer">
                    <div><input type="submit" class="btn btn-primary" value="提交更新"></div>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
</form>