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
    <li class="layui-nav-item layui-this"><a href="/presentation">简介</a></li>
    <li class="layui-nav-item"><a href="/article">文章</a></li>
    <li class="layui-nav-item"><a href="/admin/contact">基本</a></li>
    <li class="layui-nav-item"><a href="/user">用户</a></li>
</ul>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <img src="/images/logo.gif" class="img-responsive center-block" alt="Cinque Terre">
            <h3 class="text-center">简介</h3>
        </div>
    </div>
</div>

<form class="layui-form" action="">
    <div class="layui-form-item">
        <label class="layui-form-label">标题</label>
        <div class="layui-input-block">
            <input type="text" name="title" lay-verify="required" autocomplete="off" placeholder="请输入标题" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">品牌</label>
        <div class="layui-input-block">
            <input name="trademark" type="text" lay-verify="title" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">标签</label>
            <div class="layui-input-inline">
                <input type="tel" name="trademarkSmallLabel1" lay-verify="title" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">标签</label>
            <div class="layui-input-inline">
                <input type="text" name="trademarkSmallLabel2" lay-verify="title" autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-inline">
            <label class="layui-form-label">标签</label>
            <div class="layui-input-inline">
                <input type="tel" name="trademarkSmallLabel3" lay-verify="title" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">标签</label>
            <div class="layui-input-inline">
                <input type="text" name="trademarkSmallLabel4" lay-verify="title" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">营销</label>
        <div class="layui-input-block">
            <input name="marketing" type="text" lay-verify="title" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">标签</label>
            <div class="layui-input-inline">
                <input type="tel" name="marketingSmallLabel1" lay-verify="title" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">标签</label>
            <div class="layui-input-inline">
                <input type="text" name="marketingSmallLabel2" lay-verify="title" autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-inline">
            <label class="layui-form-label">标签</label>
            <div class="layui-input-inline">
                <input type="tel" name="marketingSmallLabel3" lay-verify="title" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">标签</label>
            <div class="layui-input-inline">
                <input type="text" name="marketingSmallLabel4" lay-verify="title" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>

    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">简介</label>
        <div class="layui-input-block">
            <textarea id="brief" name="brief" placeholder="请输入内容" lay-verify="required" class="layui-textarea"></textarea>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="addPresentation">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

<script src="/layui/layui.js" charset="utf-8"></script>
<script src="/js/presentation.js"></script>
</body>
</html>