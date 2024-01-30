package com.pany.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
@Data
@JsonPropertyOrder({ "taskId","userId", "title", "description", "start_time", "end_time" , "status"})
public class Task {
    private int taskId;
    private int userId;
    private String title;
    @JsonProperty("content")
    private String description;
    private String startTime;
    private String endTime;
    @JsonProperty("status")
    private int isComplete;

    public Task(Integer userId, String title, String description, String endTime,Integer isComplete) {
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.endTime = endTime;
        this.isComplete = isComplete;
    }
}
