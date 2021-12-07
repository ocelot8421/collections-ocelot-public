package hu.progmasters.setqueue.task;

import java.util.ArrayDeque;
import java.util.Queue;

public class Task {
    private String description;
    private int time;

    public Task(String description, int time) {
        this.description = description;
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public int getTime() {
        return time;
    }
}
