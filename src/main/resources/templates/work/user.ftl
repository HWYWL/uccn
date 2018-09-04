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
    <li class="layui-nav-item"><a href="/admin/contact">基本</a></li>
    <li class="layui-nav-item layui-this"><a href="/user">用户</a></li>
</ul>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <img src="/images/logo.gif" class="img-responsive center-block" alt="Cinque Terre">
            <h3 class="text-center">用户管理</h3>
        </div>
    </div>
</div>

<div class="admin-div">
    <script type="text/html" id="titleTpl"></script>

<#--表单-->
    <table class="layui-hide" id="scriptTable" lay-filter="useruv"></table>

</div>

<script src="/layui/layui.js" charset="utf-8"></script>
<script src="/js/user.js"></script>
</body>
</html>