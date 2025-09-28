package template;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CSVReportGenerator extends ReportGenerator{

    public CSVReportGenerator(Database database) {
        super(database);
    }

    @Override
    protected void formatData(List<UserScore> userScores) {
        StringBuilder builder = new StringBuilder("Name, Score, Email, Level\n");
        for (UserScore user : userScores) {
            Map<String, Object> data = user.toMap();
            builder.append(String.join(", ", data.values().stream()
                    .map(Object::toString)
                    .toArray(String[]::new)));
            builder.append("\n");
        }
        System.out.println(builder);
    }
}
