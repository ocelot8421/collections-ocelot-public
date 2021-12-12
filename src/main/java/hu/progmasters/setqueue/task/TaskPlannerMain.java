package hu.progmasters.setqueue.task;

public class TaskPlannerMain {
    public static void main(String[] args) {
        TaskPlanner taskPlanner = new TaskPlanner();
        taskPlanner.addTask("kipróbálni a progit", 2);
        taskPlanner.addTask("folyatani a következőt", 3);
        taskPlanner.previewTask();
        taskPlanner.doTask();

    }
}
