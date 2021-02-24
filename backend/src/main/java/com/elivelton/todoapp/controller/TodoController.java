package com.elivelton.todoapp.controller;

import com.elivelton.todoapp.domain.TodoItem;
import com.elivelton.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/api/todoItens")
    public ResponseEntity<?> fetchAllTodoItens() {
        List<TodoItem> todoItems = todoService.fetchAllTodoItems();

        return ResponseEntity.ok(todoItems);
    }
}
