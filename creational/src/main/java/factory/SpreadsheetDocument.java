package factory;

public class SpreadSheetDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening a Spreadsheet document...");
    }
}
