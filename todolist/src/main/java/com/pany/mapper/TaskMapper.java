package com.pany.mapper;

import com.pany.pojo.Task;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Mapper
public interface TaskMapper {

    @Insert("insert into tasks (userId,title,description,startTime,endTime,isCompleted) " +
            "values (#{userId},#{title},#{description}," +
            "#{startTime},#{endTime},#{isComplete})")
    @Options(useGeneratedKeys=true, keyProperty="taskId", keyColumn="taskId")
    void add(Task task);

    @Select("SELECT * FROM tasks WHERE userId = #{userId} AND isCompleted = #{status}")
    List<Task> findByUserId(Integer userId, Integer status);

    @Select("SELECT COUNT(*) FROM tasks WHERE userId = #{userId} AND isCompleted = #{status}")
    int countByUserId(Integer userId, Integer status);

    @Select("SELECT * FROM tasks WHERE taskId = #{taskId}")
    Task findById(Integer taskId);

    @Update("UPDATE tasks SET isCompleted = #{status} WHERE taskId = #{taskId}")
    void updateTask(Integer taskId, Integer status);

    @Delete("DELETE FROM tasks WHERE taskId = #{taskId}")
    void deleteTask(Integer taskId);
}
