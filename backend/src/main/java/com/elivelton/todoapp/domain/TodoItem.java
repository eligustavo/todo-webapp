package com.elivelton.todoapp.domain;

import lombok.Data;

@Data
public class TodoItem {

    private Integer id;
    private String task;
    private Boolean isDone;

}
