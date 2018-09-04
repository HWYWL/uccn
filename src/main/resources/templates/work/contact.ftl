<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>防御网关管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css"  media="all">
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/script.css">
</head>
<body>
<ul class="layui-nav layui-bg-cyan" lay-filter="demo">
    <li class="layui-nav-item"><a href="/admin/index">banner</a></li>
    <li class="layui-nav-item"><a href="/presentation">简介</a></li>
    <li class="layui-nav-item"><a href="/article">文章</a></li>
    <li class="layui-nav-item layui-this"><a href="/admin/contact">基本</a></li>
    <li class="layui-nav-item"><a href="/user">用户</a></li>
</ul>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <img src="/images/logo.gif" class="img-responsive center-block" alt="Cinque Terre">
            <h3 class="text-center">联系方式管理</h3>
        </div>
    </div>
</div>

<div class="admin-div">
    <form class="layui-form" action="" lay-filter="example">
        <div class="layui-form-item">
            <label class="layui-form-label">地址</label>
            <div class="layui-input-block">
                <input type="text" name="address" lay-verify="title" autocomplete="off" placeholder="请输入办公地址" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">号码</label>
            <div class="layui-input-block">
                <input type="text" name="phone" lay-verify="title" autocomplete="off" placeholder="请输入联系电话号码" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">邮箱</label>
            <div class="layui-input-block">
                <input type="text" name="email" lay-verify="email" autocomplete="off" placeholder="请输入邮箱" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">QQ</label>
            <div class="layui-input-block">
                <input type="text" name="qq" lay-verify="title" autocomplete="off" placeholder="请输入QQ" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">微信</label>
            <div class="layui-input-block">
                <input type="text" name="wx" lay-verify="title" autocomplete="off" placeholder="请输入微信" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">公司</label>
            <div class="layui-input-block">
                <input type="text" name="ownership" lay-verify="title" autocomplete="off" placeholder="请输入公司名称" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="addContact">立即提交</button>
            </div>
        </div>
    </form>
</div>

<script src="/layui/layui.js" charset="utf-8"></script>
<script src="/js/admin.js" charset="utf-8"></script>
<script src="/js/contact.js" charset="utf-8"></script>
</body>
</html>