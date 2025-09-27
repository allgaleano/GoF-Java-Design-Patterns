package factory;

public class WordApplication extends Application{
    @Override
    protected Document createDocument() {
        System.out.println("Word Application is creating a new document...");
        return new WordDocument();
    }
}
