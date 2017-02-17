package com.allstate.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name="todos")
@Data
public class Todo {

    @Id
    @GeneratedValue
    private int id;

    @Size(min=5)
    @NotNull
    private String value;

    @NotNull
    private Boolean completed;

    @Version
    private int version;

    @CreationTimestamp
    private Date created;

    @UpdateTimestamp
    private Date modified;
}
