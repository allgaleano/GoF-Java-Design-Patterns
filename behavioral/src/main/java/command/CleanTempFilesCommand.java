package command;

public class CleanTempFilesCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Cleaning temp files");
    }
}
