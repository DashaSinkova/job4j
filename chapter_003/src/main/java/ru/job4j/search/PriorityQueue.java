package ru.job4j.search;
import java.util.LinkedList;
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        var index = 0;
        for (var el : tasks) {
            if (task.getPriority() > el.getPriority()) {
                index++;
            } else {
                break;
            }
        }
        tasks.add(index, task);
    }
    public Task take() {
        return tasks.remove(0);
    }
}
