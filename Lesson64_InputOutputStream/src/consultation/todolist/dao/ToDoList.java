package consultation.todolist.dao;

import consultation.todolist.model.Task;

import java.util.List;

public interface ToDoList {
    // add Task
    boolean addTask(Task task);

    // remove Task
    Task removeTask(int taskNumber);

    // print list of Tasks
    void viewTasks();

   List<Task> getAllTasks();

    // quantity of tasks
    int quantity();

}
