package ru.job4j.search;
import java.util.LinkedList;
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;
        for(Task el : tasks) {
            if (tasks.size() != 0 & task.getPriority() > el.getPriority()){
                index++;
                break;
            }
        }
        tasks.add(index, task);
    }
    public Task take() {
        return tasks.remove(0);
    }
}
