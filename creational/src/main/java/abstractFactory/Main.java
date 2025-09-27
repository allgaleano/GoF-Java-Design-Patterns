package abstractFactory;

public class Main {
    public static void main (String[] args) {
        ApplicationService mySqlApp = new ApplicationService(
                new MySQLFactory()
        );
        mySqlApp.dbConnect();
        mySqlApp.executeQuery("SELECT * FROM users");

        ApplicationService postgresApp = new ApplicationService(
                new PostgreSQLFactory()
        );
        postgresApp.dbConnect();
        postgresApp.executeQuery("SELECT * FROM users");

        ApplicationService mongoDBApp = new ApplicationService(
                new MongoDBFactory()
        );
        mongoDBApp.dbConnect();
        mongoDBApp.executeQuery("db.users.find()");
    }
}
