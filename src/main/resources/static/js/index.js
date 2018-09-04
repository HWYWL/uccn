layui.use(['form','layer','jquery','laypage'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : parent.layer,
        $ = layui.jquery;

    $.ajax({
        url: "/open/home",
        type: "POST",
        async : true,
        success: function(data){
            var obj = data.data;

            // banner
            $('#banner1').attr('src', obj.banners[0].imgOptions);
            $('#banner2').attr('src', obj.banners[1].imgOptions);

            // 联系方式
            $('#address').html('<h4>办公地址</h4><p> ' + obj.contacts[0].address + '</p>');
            $('#phoneemail').html('<h4>联系方式</h4> <p> Phone: ' + obj.contacts[0].phone +
                ' <br>Email : <a href=' + obj.contacts[0].email + '> ' + obj.contacts[0].email + ' </a></p>');
            $('#qqwx').html('<h4>社交通讯</h4> <p> QQ: ' + obj.contacts[0].qq + ' <br> 微信 : ' + obj.contacts[0].wx + '</p>');
            $('#ownership').html('<h4>版权信息</h4> <p>© 2018 ' + obj.contacts[0].ownership + ' 保留所有权利</p>');

            // 简介
            $('#titleBrief').html('<h4>'+ obj.presentation.title +'</h4> <p>' + obj.presentation.brief + '</p>');
            $('#trademark').html('<h5>'+ obj.presentation.trademark +'</h5> ' +
                '<ul> ' +
                    '<li><span >' + obj.presentation.trademarkSmallLabel1 + '</span></li><br/> ' +
                    '<li><span >' + obj.presentation.trademarkSmallLabel2 + '</span></li><br/> ' +
                    '<li><span >' + obj.presentation.trademarkSmallLabel3 + '</span></li><br/> ' +
                    '<li><span >' + obj.presentation.trademarkSmallLabel4 + '</span></li><br/> ' +
                '</ul>'
            );
            $('#marketing').html('<h5>'+ obj.presentation.marketing +'</h5> ' +
                '<ul> ' +
                    '<li><span >' + obj.presentation.marketingSmallLabel1 + '</span></li><br/> ' +
                    '<li><span >' + obj.presentation.marketingSmallLabel2 + '</span></li><br/> ' +
                    '<li><span >' + obj.presentation.marketingSmallLabel3 + '</span></li><br/> ' +
                    '<li><span >' + obj.presentation.marketingSmallLabel4 + '</span></li><br/> ' +
                '</ul>'
            );

            var article = obj.article;
            var articleHtml = '';
            for (var i = 0;i < article.length;i++) {
                var imgOptions = article[i].imgOptions;
                var imgOption;
                if (imgOptions != null){
                    var option = imgOptions.split(",");
                    for (var k = 0; k < option.length;k++) {
                        var extStart = option[k].lastIndexOf('.');
                        var ext = option[k].substring(extStart, option[k].length).toUpperCase();
                        if (ext == '.PNG' || ext == '.JPG' || ext == '.JPEG' || ext == '.GIF') {
                            imgOption = option[k];
                            break;
                        }
                    }
                }

                articleHtml +='<div class="col-sm-6 portfolio-item"> <a href=/details?id='+ article[i].id +' class="portfolio-link">' +
                    '                <div class="caption">' +
                    '                <div class="caption-content">' +
                    '                <h3>'+ article[i].title +'</h3>' +
                    '            </div>' +
                    '            </div>' +
                    '            <img src='+ imgOption +' class="img-responsive" alt=""> </a> </div>';
            }

            $('#article').html(articleHtml);

            form.render();
        }
    });
});
