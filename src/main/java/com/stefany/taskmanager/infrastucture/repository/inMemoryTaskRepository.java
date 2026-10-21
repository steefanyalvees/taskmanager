package com.stefany.taskmanager.infrastucture.repository;

import com.stefany.taskmanager.domain.Task;
import com.stefany.taskmanager.domain.TaskId;
import com.stefany.taskmanager.domain.TaskRepository;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
// implementacao task repository
public class inMemoryTaskRepository implements TaskRepository {
    private final Map<TaskId, Task> storage = new HashMap<>();

    @Override
    public Task save(Task task) {
        storage.put(task.getId(),task);
        return null;
    }

    @Override
    public List<Task> findAll() {
        return new ArrayList<>(storage.values());
    }
    @Override
    public Optional<Task> findById(TaskId id) {

        return Optional.ofNullable(storage.get(id));
    }
    @Override
    public void delete(Task id) {
        storage.remove(id);
    }
}
