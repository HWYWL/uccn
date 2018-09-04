layui.use(['form','layer','jquery','laypage', 'layedit'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : parent.layer,
        $ = layui.jquery;

    $.ajax({
        url: "/presentation/find",
        type: "GET",
        async : true,
        success: function(data){
            $("input[name='title']").attr("value",data.data.title);
            $("input[name='trademark']").attr("value",data.data.trademark);
            $("input[name='trademarkSmallLabel1']").attr("value",data.data.trademarkSmallLabel1);
            $("input[name='trademarkSmallLabel2']").attr("value",data.data.trademarkSmallLabel2);
            $("input[name='trademarkSmallLabel3']").attr("value",data.data.trademarkSmallLabel3);
            $("input[name='trademarkSmallLabel4']").attr("value",data.data.trademarkSmallLabel4);
            $("input[name='marketing']").attr("value",data.data.marketing);
            $("input[name='marketingSmallLabel1']").attr("value",data.data.marketingSmallLabel1);
            $("input[name='marketingSmallLabel2']").attr("value",data.data.marketingSmallLabel2);
            $("input[name='marketingSmallLabel3']").attr("value",data.data.marketingSmallLabel3);
            $("input[name='marketingSmallLabel4']").attr("value",data.data.marketingSmallLabel4);
            $("input[name='brief']").attr("innerHTML",data.data.brief);

            form.render();
        }

    });

    //监听提交
    form.on('submit(addPresentation)', function(data){
        var presentation = JSON.stringify(data.field);

        layer.confirm('确定提交?', {icon: 3, title:'提交'}, function(index){
            layer.close(index);
            var load = layer.load(1);
            $.ajax({
                type:"post",
                url:"/presentation/save",
                data:presentation,
                async : false,
                dataType : "json",
                contentType: "application/json",
                success:function(result){
                    if(result.code == 0){
                        layer.close(index);
                        layer.close(load);
                        layer.msg("执行成功", {icon: 6});
                    }else{
                        layer.close(index);
                        layer.close(load);
                        layer.msg(data.msg, {icon: 4});
                    }

                    setTimeout(function(){
                        parent.layer.close(index);
                        window.parent.location.reload();
                    },3000);
                }
            });
        });

        return false;
    });
});
