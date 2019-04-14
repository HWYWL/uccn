# uccn
一个简洁的官网

[![996.icu](https://img.shields.io/badge/link-996.icu-red.svg)](https://996.icu) [![LICENSE](https://img.shields.io/badge/license-Anti%20996-blue.svg)](https://github.com/996icu/996.ICU/blob/master/LICENSE)

#### 项目介绍
一个简洁的公司官网主页,使用spring boot作为后台框架.

#### 软件架构
- 后台框架:Spring Boot 2.0.3.RELEASE
- 缓存:Redis
- <del>文件系统:FastDFS</del>
- 图床:SM
- 连接池:druid
- 数据库:MySQL
- 数据库操作框架:mybatis


#### 安装教程

<del>FastDFS因为安装比较麻烦所以我使用docker安装,下面是安装教程:</del>

<del>[FastDFS安装](https://hwy.ac.cn/post/c91g3b0dgngp.html)</del>

因为使用FastDFS文件系统过于麻烦，现在改用公共图床，好处就是方便，缺点是现在每张图片不能大于5M，一般也够用了


#### 使用说明

配置详情请修改配置文件,下面看看效果图

预览地址(随时失效,穷没钱续服务器): http://134.175.35.133:8080/
后台管理系统: http://134.175.35.133:8080/login

下面这个是主页
![](https://i.imgur.com/ZI9WOrz.jpg)

下面这个是文章详情,花屏那张图其实是在播放视频,所以截图的时候看起来是花的
![](https://i.imgur.com/P8f9uLI.jpg)


管理系统:
![](https://i.imgur.com/Rw4KD33.jpg)
![](https://i.imgur.com/7BJ3ZuA.jpg)
![](https://i.imgur.com/RgG8EDv.jpg)
![](https://i.imgur.com/HtydCEJ.jpg)
![](https://i.imgur.com/cX2ZAjw.jpg)
![](https://i.imgur.com/OK0oqLP.jpg)

#### 注意
截图看上去很丑,还是pull下来看下一吧,其实长得还可以.

对了,后台的账号密码为--->**账号:admin	密码:123456**

### 问题建议

- 联系我的邮箱：ilovey_hwy@163.com
- 我的博客：https://www.hwy.ac.cn
- GitHub：https://github.com/HWYWL