package com.pany.service.impl;

import com.pany.mapper.TaskMapper;
import com.pany.pojo.Task;
import com.pany.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskMapper taskMapper;
    @Override
    public Task add(Task task) {
        String startTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        task.setStartTime(startTime);
        taskMapper.add(task);
        return task;
    }
    @Override
    public List<Task> findByUserId(Integer userId, Integer status) {
        return taskMapper.findByUserId(userId,status);
    }

    @Override
    public int countByUserId(Integer userId, Integer status) {
        return taskMapper.countByUserId(userId,status);
    }

    @Override
    public Boolean findById(Integer taskId,Integer userId) {
        Task task=taskMapper.findById(taskId);
        if(task==null){
            return false;
        }
        return taskMapper.findById(taskId).getUserId() == userId;
    }

    @Override
    public void updateTask(Integer taskId, Integer status) {
        taskMapper.updateTask(taskId,status);
    }

    @Override
    public void deleteTask(Integer taskId) {
        taskMapper.deleteTask(taskId);
    }
}
