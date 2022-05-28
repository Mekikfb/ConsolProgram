package com.company;

public class Project  {
    public String name;
    public String description;

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'';
    }
}



