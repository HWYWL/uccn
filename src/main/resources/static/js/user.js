layui.use(['table','form'], function() {
    $ = layui.jquery;
    table = layui.table;
    tableIns = initTable();
});

function initTable() {
    layui.use('table', function () {
        var table = layui.table, form = layui.form;

        table.render({
            elem: '#scriptTable'
            , url: '/user/fidnAll'
            , cellMinWidth: 20 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            , cols: [[
                {field: 'id', title: 'id'}
                , {field: 'name', title: '用户名'}
                , {field: 'type', title: '角色'} //width 支持：数字、百分比和不填写。你还可以通过 minWidth 参数局部定义当前单元格的最小宽度，layui 2.2.1 新增
                , {field: 'email', title: '邮箱'}
                , {field: 'status', title: '状态'}
                , {field: 'cratedate', title: '创建时间'}
            ]]
            ,done: function (res, curr, count) {
                //分类显示中文名称
                $("[data-field='type']").children().each(function(){
                    if($(this).text()=='1'){
                        $(this).text("管理员")
                    }else if($(this).text()=='2'){
                        $(this).text("编辑")
                    }
                });

                $("[data-field='status']").children().each(function(){
                    if($(this).text()=='1'){
                        $(this).text("有效")
                    }else if($(this).text()=='2'){
                        $(this).text("禁用")
                    }
                });
            }
        });
    });
}