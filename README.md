## 项目简介

spring-boot-doc是一款针对IT团队开发的简单好用的文档管理系统。

spring-boot-doc的前身是[MinDoc](https://git.oschina.net/longfei6671/godoc)，MinDoc 的前身是 SmartWiki 文档系统。SmartWiki 是基于 PHP 框架 laravel 开发的一款文档管理系统。因 PHP 的部署对普通用户来说太复杂，所以原作者改用 Golang 开发。然而对于一个JAVA开发者来说，对于GO语言，出现问题自身又不能解决，所以使用spring-boot重写了MinDoc，可以方便JAVA用户部署和使用，目前只完善了部分功能，持续更新中。

## 项目结构
 
```
     
├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─itstyle
│  │  │          └─doc
│  │  │              │  Application.java --启动类
│  │  │              │  
│  │  │              ├─common  --公用包
│  │  │              │  ├─constans
│  │  │              │  │      
│  │  │              │  ├─interceptor
│  │  │              │  │      
│  │  │              │  └─utils
│  │  │              │          
│  │  │              ├─model  --实体类
│  │  │              │      
│  │  │              ├─repository --数据访问层
│  │  │              │      
│  │  │              └─web  -- 控制访问层
│  │  │                      
│  │  ├─resources  -- 系统配置 
│  │  │  │  application-dev.properties
│  │  │  │  application-prod.properties
│  │  │  │  application-test.properties
│  │  │  │  application.yml
│  │  │  │  kaptcha.xml
│  │  │  │  logback-spring.xml
│  │  │  │  
│  │  │  ├─sql -- 数据库文件
│  │  │  │      
│  │  │  ├─static -- 前端插件
│  │  │  │          
│  │  │  ├─templates -- 页面访问模版
│  │  │  │          
│  │  │  └─uploads -- 上传目录
│  │  │              
│  │  └─webapp
│  │      │  index.jsp
│  │      │  
│  │      └─WEB-INF
│  │              web.xml
│  │                                       

```                             



## 安装与使用

作为一个AJAV开发者，首先你的电脑必备JDK，其次你要有个开发工具(Eclipse或者IDEA)，最后你要熟悉spring-boot这个简单易用的快速开发框架。

下载项目以后，自行配置数据库，导致sql中的doc.sql，会自动创建表，同时初始化一个超级管理员用户：admin 密码：111111，请登录后重新设置密码。

## 使用的技术

- spring-boot 1.52
- spring-data-jpa  1.11.1
- thymeleaf 2.1.5 
- kaptcha 2.3.2
- mysql 5.6
- editor.md
- bootstrap 3.2
- vuejs 2.2.6
- jquery 库
- layer 弹出层框架
- webuploader 文件上传框架
- Nprogress 库
- jstree 树状结构库
- font awesome 字体库
- cropper 图片剪裁库
- layer 弹出层框架
- highlight 代码高亮库
- to-markdown HTML转Markdown库
- wangEditor 富文本编辑器

## 主要功能

- 项目管理，可以对项目进行编辑更改，成员添加等。
- 文档管理，添加和删除文档等。
- 评论管理，可以管理文档评论和自己发布的评论。
- 用户管理，添加和禁用用户，个人资料更改等。
- 用户权限管理 ， 实现用户角色的变更。
- 项目加密，可以设置项目公开状态，私有项目需要通过Token访问。
- 站点配置，可开启匿名访问、验证码等。
- 不定期 push 新功能
## 友情提示




