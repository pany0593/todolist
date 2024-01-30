package com.pany.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class User {
    private int userId;
    private String name;
    private String email;
    @JsonIgnore
    private String pwd;
}
