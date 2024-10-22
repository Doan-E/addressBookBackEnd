# 项目介绍
    本项目是针对一个通讯录文件后端所建立的。
 
    设置了通讯录所需要的对应的接口，能够满足通讯录基础的增删改查功能，并通过内置的H2数据库容纳前端所传输的通讯录数据。
 
# 环境依赖
    需要安装 JDK 21.0.1 及以上版本，并配置环境变量。
    需要安装 Maven 3.8.1 及以上版本，并配置环境变量。
    需要引入 Spring Boot Starter Web 依赖。
    需要引入 H2 Database 依赖。

 
# 目录结构描述
    |-832202218_concacts_backend
        |- src
            |- ...
            |- controller
                |- ContactController.java|- 
            |- ....other files
    |- README.md
    |- pom.xml

# 使用说明
安装VS CODE，打开项目文件夹，双击打开文件夹，点击运行，在浏览器中打开http://localhost:8081/api/contacts ，即可看到后端数据库中存储的通讯录数据。
————————————————
