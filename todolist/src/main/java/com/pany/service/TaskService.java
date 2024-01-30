package com.pany.service;

import com.pany.pojo.Task;

import java.util.List;

public interface TaskService {
    Task add(Task task);

    List<Task> findByUserId(Integer userId, Integer status);

    int countByUserId(Integer userId, Integer status);

    Boolean findById(Integer taskId,Integer userId);

    void updateTask(Integer taskId, Integer status);

    void deleteTask(Integer taskId);
}
