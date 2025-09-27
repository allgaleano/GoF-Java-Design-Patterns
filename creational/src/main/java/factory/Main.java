package factory;

public class Main {
    public static void main(String[] args) {
        Application wordApp = new WordApplication();
        Application spreadsheetApp = new SpreadsheetApplication();
        Application presentationApp = new PresentationApplication();

        wordApp.newDocument();
        spreadsheetApp.newDocument();
        presentationApp.newDocument();
    }
}
