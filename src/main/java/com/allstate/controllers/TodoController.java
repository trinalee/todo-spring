package com.allstate.controllers;

import com.allstate.entities.Todo;
import com.allstate.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {
    private TodoService todoService;

    @Autowired
    public void setTodoService(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value="/todos", method= RequestMethod.GET)
    public List<Todo> findAll() {
        return this.todoService.findAll();
    }
}
