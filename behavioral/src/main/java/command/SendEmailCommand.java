package command;

public class SendEmailCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Sending email to user@example.com");
    }
}
