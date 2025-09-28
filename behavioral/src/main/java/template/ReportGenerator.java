package template;

import java.util.List;

public abstract class ReportGenerator {

    protected Database database;

    public ReportGenerator(Database database) {
        this.database = database;
    }

    public void generateReport() {
        List<UserScore> scores = fetchData();
        formatData(scores);
    }

    protected List<UserScore> fetchData() {
        return database.fetchData();
    }

    protected abstract void formatData(List<UserScore> userScores);
}
