package factory;

public class PresentationApplication extends Application{
    @Override
    protected Document createDocument() {
        System.out.println("Presentation Application is creating a new document...");
        return new PresentationDocument();
    }
}
