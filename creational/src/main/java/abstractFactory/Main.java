package abstractFactory;

public class Main {
    public static void main (String[] args) {
        DatabaseFactory mySQL = new MySQLFactory();
        mySQL.createConnection();
        mySQL.createQueryExecutor("SELECT * FROM users");

        DatabaseFactory postgreSQL = new PostgreSQLFactory();
        postgreSQL.createConnection();
        postgreSQL.createQueryExecutor("SELECT * FROM users");
    }
}
