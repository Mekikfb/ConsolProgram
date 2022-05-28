package com.company;

public class Task extends Project {
    public Task(String name, String description) {
        super(name, description);
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'';
    }
}
