package template;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<UserScore> userScores = new ArrayList<>();

    public List<UserScore> fetchData() {
        return userScores;
    }

    public void addUserScore(UserScore userScore) {
        this.userScores.add(userScore);
    }
}
