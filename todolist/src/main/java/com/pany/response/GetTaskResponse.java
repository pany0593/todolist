package com.pany.response;

import com.pany.pojo.Task;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class GetTaskResponse {
    private List<Task> item;
    private int total;
}
