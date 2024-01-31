# 项目结构

```
src
 └─main
    ├─java
    │  └─com
    │      └─pany
    │          ├─controller                         控制层
    │          │      TaskController.java           任务控制类
    │          │      UserController.java           用户控制类
    │          │
    │          ├─mapper                             映射层
    │          │      TaskMapper.java               任务映射类
    │          │      UserMapper.java               用户映射类
    │          │
    │          ├─pojo                               实体层
    │          │      Result.java                   返回结果实体类
    │          │      Task.java                     任务实体类
    │          │      User.java                     用户实体类
    │          │
    │          ├─response                           json返回类
    │          │      CreateTaskResponse.java       创建任务返回响应类
    │          │      GetTaskResponse.java          获取任务返回响应类
    │          │
    │          ├─service                            服务层
    │          │  │  TaskService.java               任务服务层接口
    │          │  │  UserService.java               用户服务层接口
    │          │  │
    │          │  └─impl
    │          │          TaskServiceImpl.java      任务服务层实现类
    │          │          UserServiceImpl.java      用户服务层实现类
    │          │
    │          ├─utils
    │          │       ContentValidatedUtil.java    数据验证工具类
    │          │
    │          └─TodolistApplication.java           app入口
    │
    └─resources
        │  application-docker.properties            docker配置
        │  application.yml                          mysql配置
        │
        └─static                                    vue项目
```

# 数据库结构

1. **用户表 (user)**
   - userId (自增主键)
   - 用户名 (name)
   - 邮箱 (email)
   - 密码 (pwd)
2. **任务表 (tasks)**
   - taskId (自增主键)
   - 用户Id (userId)
   - 任务标题 (title)
   - 任务描述 (description)
   - 创建日期 (startTime)
   - 截止日期 (endTime)
   - 是否已完成 (isCompleted)

- **用户表 (users):** 存储应用的用户信息。
- **任务表 (tasks):** 存储用户创建的任务，包括任务标题、描述、截止日期和任务完成状态。

# API[接口文档](https://apifox.com/apidoc/shared-e8f7411e-e06a-45ff-af1e-938fdb621779)

# 不足

- 注册用户没有对数据进行过滤
- 密码没用token，明文储存、传输
- 任务控制层没有对删除、更新任务是否成功判断
- 数据验证类没做
- **没完成云服务器docker部署，只有用宿主机开内网穿透进行测试**