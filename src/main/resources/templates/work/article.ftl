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
    <li class="layui-nav-item layui-this"><a href="/article">文章</a></li>
    <li class="layui-nav-item"><a href="/admin/contact">基本</a></li>
    <li class="layui-nav-item"><a href="/user">用户</a></li>
</ul>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <img src="/images/logo.gif" class="img-responsive center-block" alt="Cinque Terre">
            <h3 class="text-center">文章管理</h3>
        </div>
    </div>
</div>

<div class="admin-div">
<#--FastDFS-->
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
        <legend>文章左侧图片或视频</legend>
    </fieldset>

    <div class="layui-upload">
        <div class="layui-upload-list">
            <table class="layui-table">
                <thead>
                <tr><th>文件名</th>
                    <th>大小</th>
                    <th>状态</th>
                    <th>地址</th>
                    <th>操作</th>
                </tr></thead>
                <tbody id="fastdfsFileList"></tbody>
            </table>
        </div>
        <div class="index-button">
            <button type="button" class="layui-btn layui-btn-normal" id="fastdfsArticleSelectList">选择图片或视频</button>
            <button type="button" class="layui-btn" id="fastdfsArticleFileListAction">
                <i class="layui-icon"></i>上传文件</button>
        </div>
    </div><br/>

    <form class="layui-form" action="" lay-filter="example">
        <div class="layui-form-item" style="display: none">
            <div class="layui-input-block">
                <input type="text" id="imgOptions" name="imgOptions" autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">标题</label>
            <div class="layui-input-block">
                <input type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入文章标题" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">文章</label>
            <div class="layui-input-block">
                <textarea id="brief" name="content" placeholder="请输入内容,每个段落包在<p>标签中，例如 <p>此处写文章的每个段落</p>" lay-verify="required" class="layui-textarea"></textarea>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="addArticle">立即提交</button>
            </div>
        </div>
    </form>
</div>

<script src="/layui/layui.js" charset="utf-8"></script>
<script src="/js/fastdfs.js" charset="utf-8"></script>
<script src="/js/article.js" charset="utf-8"></script>
</body>
</html>