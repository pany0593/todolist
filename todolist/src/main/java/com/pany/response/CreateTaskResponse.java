package com.pany.response;

import com.pany.pojo.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateTaskResponse {
    private int taskId;
    private String startTime;

    public CreateTaskResponse(Task task) {
        this.taskId = task.getTaskId();
        this.startTime = task.getStartTime();
    }
}
