<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<title>UCCN</title>
	<meta name="renderer" content="webkit" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
	<meta name="apple-mobile-web-app-status-bar-style" content="black" />
	<meta name="apple-mobile-web-app-capable" content="yes" />
	<meta name="format-detection" content="telephone=no" />
	<link rel="stylesheet" href="/layui/css/layui.css" media="all">
	<link rel="stylesheet" href="/css/login.css" media="all">
</head>
<body>
	<video class="video-player" preload="auto" autoplay="autoplay" loop="loop" data-height="1080" data-width="1920" height="1080" width="1920">
	    <source src="/audio/login.mp4" type="video/mp4">
	<</video>
	<div class="video_mask"></div>
	<div class="login">
	    <h1>UCCN后台管理</h1>
	    <form class="layui-form">
	    	<div class="layui-form-item">
				<input class="layui-input" name="name" placeholder="用户名" lay-verify="required" type="text" autocomplete="off">
		    </div>
		    <div class="layui-form-item">
				<input class="layui-input" name="password" placeholder="密码" lay-verify="required" type="password" autocomplete="off">
		    </div>
			<button class="layui-btn login_btn" lay-submit="" lay-filter="login">登录</button>
		</form>
	</div>
	<script src="/layui/layui.js" charset="utf-8"></script>
	<script src="/js/login.js"></script>
</body>
</html>