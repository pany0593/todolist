# 数据库结构

1. **用户表 (users)**
   - userID (自增主键)
   - 用户名 (name)
   - 密码 (pwd)
2. **任务表 (tasks)**
   - taskID (自增主键)
   - 用户ID (外键，关联到用户表的userID)
   - 任务标题 (title)
   - 任务描述 (description)
   - 创建日期 (startTime)
   - 截止日期 (endTime)
   - 是否已完成 (isCompleted)

- **用户表 (users):** 存储应用的用户信息。
- **任务表 (tasks):** 存储用户创建的任务，包括任务标题、描述、截止日期和任务完成状态。