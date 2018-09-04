layui.use(['form','layer','jquery','laypage'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : parent.layer,
        $ = layui.jquery;

    var id = $(" #articleId ").val();

    $.ajax({
        url: "/open/findArticle",
        type: "GET",
        data:{'id': id},
        async : true,
        success: function(data) {
            if (data.code == 0) {
                $('#titleContent').html('<h4>' + data.data.title + '</h4>' + data.data.content);

                var imgOptions = data.data.imgOptions;
                var imgOption = '';
                if (imgOptions != null){
                    var option = imgOptions.split(",");
                    for (var k = option.length - 1; k >= 0;k--) {
                        var extStart = option[k].lastIndexOf('.');
                        var ext = option[k].substring(extStart, option[k].length).toUpperCase();
                        if (ext == '.PNG' || ext == '.JPG' || ext == '.JPEG' || ext == '.GIF') {
                            imgOption += '<p> <img src='+ option[k] +'></p>';
                        }else {
                            imgOption += '<p> ' +
                                '<video class="video-player" preload="auto" autoplay="autoplay" loop="loop" width="1100"> ' +
                                '<source src='+ option[k] +'>' +
                                '</video></p>';
                        }
                    }
                }
                $('#imgVideo').html(imgOption);
            }else {
                layer.msg("文章读取异常！", {icon: 4});
            }

            form.render();
        }

    });

});