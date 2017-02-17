package com.allstate.repositories;

import com.allstate.entities.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by localadmin on 2/17/17.
 */
public interface ITodoRepository extends CrudRepository<Todo, Integer> {
    public List<Todo> findAll();
}
