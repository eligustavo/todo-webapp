package com.elivelton.todoapp.service;

import com.elivelton.todoapp.domain.TodoItem;
import com.elivelton.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepo;

    public List<TodoItem> fetchAllTodoItems() {
        return todoRepo.fetchAllTodoItems();
    }

}
