package com.stefany.taskmanager.domain;

import org.springframework.util.Assert;

import java.util.Optional;
import java.util.UUID;

public class Task {
    private TaskId id;
    private String title;
    private Optional<String> description; // descricao nao e obrigatoria
    private TaskStatus status;

    public Task(TaskId id, String title, Optional<String> description, TaskStatus status) {
        Assert.notNull(title,"Title must not be null");

        this.id = new TaskId();  // id sera criado pela classe TaskId
        this.title = title;
        this.description = description;
        this.status = TaskStatus.IN_PROGRESS;
    }
}
