package template;

import java.util.LinkedHashMap;
import java.util.Map;

public class UserScore {
    private final String name;
    private final int score;
    private final String email;
    private final String level;

    public UserScore(String name, int score, String email, String level) {
        this.name = name;
        this.score = score;
        this.email = email;
        this.level = level;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> data = new LinkedHashMap<>();
        data.put("name", name);
        data.put("score", score);
        data.put("email", email);
        data.put("level", level);
        return data;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getEmail() {
        return email;
    }

    public String getLevel() {
        return level;
    }
}
