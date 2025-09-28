package command;

public class Main {
    public static void main (String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.scheduleTask(new SendEmailCommand());
        scheduler.scheduleTask(new GenerateReportCommand());
        scheduler.scheduleTask(new CleanTempFilesCommand());

        scheduler.runTasks();
    }
}
