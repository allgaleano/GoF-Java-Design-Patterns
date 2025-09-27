package factory;

public class SpreadsheetApplication extends Application{
    @Override
    protected Document createDocument() {
        System.out.println("SpreadSheet Application is creating a new document...");
        return new SpreadsheetDocument();
    }
}
