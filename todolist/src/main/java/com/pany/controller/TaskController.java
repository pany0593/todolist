package com.pany.controller;

import com.pany.pojo.Result;
import com.pany.pojo.Task;
import com.pany.pojo.User;
import com.pany.response.CreateTaskResponse;
import com.pany.response.GetTaskResponse;
import com.pany.service.TaskService;
import com.pany.service.UserService;
import com.pany.utils.ContentValidatedUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;
    @Autowired
    private UserService userService;

    //参数判空

    @DeleteMapping("/{taskId}")
    public Result deleteTask(@PathVariable Integer taskId,Integer userId){
        User user = userService.findById(userId);
        if (user == null) {
            return Result.error("用户不存在");
        }
        if (!taskService.findById(taskId,userId)) {
            return Result.error("任务不存在");
        }
        taskService.deleteTask(taskId);//delete失败判断
        return Result.success();
    }

    @PutMapping("/{taskId}")
    public Result updateTask(@PathVariable Integer taskId, Integer userId, Integer status) {
        if(!status.equals(0) && !status.equals(1)){
            return Result.error("状态不符合规定");
        }
        User user = userService.findById(userId);
        if (user == null) {
            return Result.error("用户不存在");
        }
        if (!taskService.findById(taskId,userId)) {
            return Result.error("任务不存在");
        }
        taskService.updateTask(taskId, status);//update失败判断
        return Result.success();
    }

    @GetMapping
    public Result<GetTaskResponse> getTask(Integer userId,Integer status) {
        if(!status.equals(0) && !status.equals(1)){
            return Result.error("状态不符合规定");
        }
        User user = userService.findById(userId);
        if (user == null) {
            return Result.error("用户不存在");
        }
        List<Task> tasks = taskService.findByUserId(userId, status);
        int total = taskService.countByUserId(userId, status);
        if (total == 0) {
            return Result.error("查询为空");
        } else {
            return Result.success(new GetTaskResponse(tasks, total));
        }
    }

    @PostMapping
    public Result createTask(Integer userId, String title, String content, String endTime, Integer status) {
        Task task = new Task(userId, title, content, endTime, status);
        if (ContentValidatedUtil.contentValidated(task)) {//validated没做
            task = taskService.add(task);
            return Result.success(new CreateTaskResponse(task));
        } else {
            return Result.error("内容不符合规定");//改变validated返回值实现更多不合规判定
        }
    }
}
