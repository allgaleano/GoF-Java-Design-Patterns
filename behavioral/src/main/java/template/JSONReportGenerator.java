package template;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JSONReportGenerator extends ReportGenerator{

    public JSONReportGenerator(Database database) {
        super(database);
    }

    @Override
    protected void formatData(List<UserScore> userScores) {
        StringBuilder builder = new StringBuilder("[\n");
        int i = 0;
        int scoresSize = userScores.size();
        for(UserScore user : userScores) {
            Map<String, Object> data = user.toMap();
            int size = data.size();
            int j = 0;
            builder.append("\t{\n");
            for (Map.Entry<String, Object> entry : data.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Number) {
                    builder.append(String.format("\t\t\"%s\": %s", key, value));
                } else {
                    builder.append(String.format("\t\t\"%s\": \"%s\"", key, value));
                }
                if (++j < size) builder.append(",\n");
                else builder.append("\n");
            }
            if (++i < scoresSize) builder.append("\t},\n");
            else builder.append("\t}\n");
        }
        builder.append("]");
        System.out.println(builder);
    }
}
