package command;

public class GenerateReportCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Generating sales report for September");
    }
}
