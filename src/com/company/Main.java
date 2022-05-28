package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Project> project = new ArrayList<>();
        List<Task> task = new ArrayList<>();
        for (; ; ) {
            System.out.println(" ENTER COMMAND: ");
            Scanner console = new Scanner(System.in);
            String enterCommand = console.nextLine();

            switch (enterCommand) {
                case "create_project":
                    System.out.println("ENTER PROJECT NAME:");
                    String name = console.nextLine();
                    System.out.println("ENTER PROJECT DESCRIPTION:");
                    String description = console.nextLine();
                    Project project1 = new Project(name, description);
                    project.add(project1);
                    //  System.out.println(project.get(0)+"}");
                    break;
                case "create_task":
                    System.out.println("ENTER TASK NAME:");
                    String taskName = console.nextLine();
                    System.out.println("ENTER TASK DESCRIPTION:");
                    String taskDes = console.nextLine();
                    Task task1 = new Task(taskName, taskDes);
                    task.add(task1);
                    break;
                case "list_project":
                    if (project.size() > 0) {
                        for (int i = 0; i < project.size(); i++) {
                            System.out.println("PROJECT[id:" + (i + 1) + project.get(i) + "}");
                        }
                    } else {
                        System.out.println("not available");
                    }
                    break;
                case "list_tasks":
                    if (task.size() > 0) {
                        for (int i = 0; i < task.size(); i++) {
                            System.out.println("TASK[id:" + (i + 1) + task.get(i) + "}");
                        }
                    } else {
                        System.out.println("not available");
                    }
                    break;
                case "delete_project":
                    System.out.println("ENTER TASK ID:");
                    int id1 = console.nextInt();
                    System.out.println("PROJECT [id:" + id1 + project.get(id1 - 1) + "] DELETED");
                    project.remove(id1 - 1);
                    break;
                case "delete_task":
                    System.out.println("ENTER TASK ID:");
                    int id = console.nextInt();
                    System.out.println("TASK [id:" + id + task.get(id - 1) + "] DELETED");
                    task.remove(id - 1);
                    break;
                case "list all":
                    if (task.size() > 0) {
                        for (int i = 0; i < task.size() || i < project.size(); i++) {
                            System.out.println(("TASK[id:" + (i + 1) + task.get(i) + "}"));
                        }
                    } else {
                        System.out.println("not available");
                    }
                    if (project.size() > 0) {
                        for (int i = 0; i < task.size() || i < project.size(); i++) {
                            System.out.println(("PROJECT[id:" + (i + 1) + project.get(i) + "}"));
                        }
                    } else {
                        System.out.println("not available");
                    }
                    break;
                case "add_task_to_project":
                    System.out.println("ENTER TASK ID:");
                    int TaskId = console.nextInt() - 1;
                    System.out.println("ENTER PROJECT ID:");
                    int ProjectId = console.nextInt() - 1;
                    for (int i = 0; i < task.size(); i += 2) {
                        project.set(i, task.get(TaskId) + project.get(ProjectId));

                        //for (int i = ProjectId; i < project.size() && i < task.size(); i += project.size()) {
                        // project.set(i,task.get(i));
                        // task.remove(TaskId);
                        // project.set(ProjectId,project.get(ProjectId)+task.get(TaskId));
                        break;
                    }
                case "exit":
                    System.exit(Integer.parseInt("exit"));
                    break;
                default:
                    System.out.println("UNKNOWN COMMAND");
            }
        }
    }
}







