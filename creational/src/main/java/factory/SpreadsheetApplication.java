package factory;

public class SpreadSheetApplication extends Application{
    @Override
    protected Document createDocument() {
        System.out.println("SpreadSheet Application is creating a new document...");
        return new SpreadSheetDocument();
    }
}
