package com.allstate.services;


import com.allstate.entities.Todo;
import com.allstate.repositories.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private ITodoRepository todoRepository;

    @Autowired
    public void setTodoRepository(ITodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findAll() {
        return this.todoRepository.findAll();
    }

}
