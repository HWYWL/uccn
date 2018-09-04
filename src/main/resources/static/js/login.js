layui.config({
	base : "js/"
}).use(['form','layer'],function(){
	var form = layui.form,
		layer = parent.layer === undefined ? layui.layer : parent.layer,
		$ = layui.jquery;
	//video背景
	$(window).resize(function(){
		if($(".audio-player").width() > $(window).width()){
			$(".audio-player").css({"height":$(window).height(),"width":"auto","left":-($(".audio-player").width()-$(window).width())/2});
		}else{
			$(".audio-player").css({"width":$(window).width(),"height":"auto","left":-($(".audio-player").width()-$(window).width())/2});
		}
	}).resize();
	
	//登录按钮事件
	form.on("submit(login)",function(data){
        var user = JSON.stringify(data.field);
        $.ajax({
            url:"/user/login",
            type:"POST",
            data:user,
            async : false,
            dataType : "json",
            contentType: "application/json",
            success:function(result){
                layer.msg(result.msg,{icon:4});
                if (result.code == 0){
                    window.location.href = "/admin/index";
				}
            }
        });

		return false;
	});
});
