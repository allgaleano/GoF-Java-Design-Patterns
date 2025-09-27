package factory;

public class PresentationDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening Presentation document...");
    }
}
