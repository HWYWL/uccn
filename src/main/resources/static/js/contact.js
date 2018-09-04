layui.use(['form','layer','jquery','laypage'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : parent.layer,
        $ = layui.jquery;

    $.ajax({
        url: "/contact/findLastOneContact",
        type: "GET",
        async : true,
        success: function(data){
            $("input[name='address']").attr("value",data.data[0].address);
            $("input[name='phone']").attr("value",data.data[0].phone);
            $("input[name='email']").attr("value",data.data[0].email);
            $("input[name='qq']").attr("value",data.data[0].qq);
            $("input[name='wx']").attr("value",data.data[0].wx);
            $("input[name='ownership']").attr("value",data.data[0].ownership);

            form.render();
        }

    });
});
