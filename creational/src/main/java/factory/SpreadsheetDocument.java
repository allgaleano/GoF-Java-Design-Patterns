package factory;

public class SpreadsheetDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening a Spreadsheet document...");
    }
}
