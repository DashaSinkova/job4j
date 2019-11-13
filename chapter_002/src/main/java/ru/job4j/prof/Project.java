package ru.job4j.prof;
/**
 * Курс Стажер 002ООП.2.3
 */
public class Project {
    private String name, deadline, tasks;
    private boolean isComplete;
    public Project(String name, String deadline, String tasks, boolean isComplete) {
        this.name = name;
        this.deadline = deadline;
        this.tasks = tasks;
        this.isComplete = isComplete;
    }
    public void setProject(Project ob) {
        this.name = ob.name;
        this.tasks = ob.tasks;
        this.deadline = ob.deadline;
        this.isComplete = ob.isComplete;
    }
    public String getName() {
        return name;
    }
    public String getDeadline() {
        return deadline;
    }
    public String getTasks() {
        return tasks;
    }
    public boolean getStatus() {
        return isComplete;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    public void setTasks(String tasks) {
        this.tasks = tasks;
    }
    public void setStatus(boolean isComplete) {
        this.isComplete = isComplete;
    }

}
