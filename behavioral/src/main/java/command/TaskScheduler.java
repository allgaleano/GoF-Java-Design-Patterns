package command;

import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduler {
    private Queue<Command> tasks;

    public TaskScheduler() {
        this.tasks = new LinkedList<>();
    }

    public void scheduleTask(Command command) {
        this.tasks.add(command);
        System.out.println("Task scheduled: " + command.getClass().getSimpleName());
    }

    public void runTasks() {
        System.out.println("Executing tasks...");
        while (!tasks.isEmpty()) {
            tasks.poll().execute();
        }
    }


}
