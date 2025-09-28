package template;

public class Main {
    public static void main(String[] args) {
        UserScore aliceScore = new UserScore("Alice", 90, "alice@email.com", "MARK");
        UserScore bobScore = new UserScore("Bob", 85, "bod@email.com", "MANG");

        Database db = new Database();
        db.addUserScore(aliceScore);
        db.addUserScore(bobScore);

        ReportGenerator csvRp = new CSVReportGenerator(db);
        ReportGenerator jsonRp = new JSONReportGenerator(db);
        csvRp.generateReport();
        jsonRp.generateReport();
    }
}
