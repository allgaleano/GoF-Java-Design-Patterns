package abstractFactory;

public class ApplicationService {
    private final DBConnection conn;
    private final QueryExecutor executor;

    public ApplicationService(DatabaseFactory factory) {
        this.conn = factory.createConnection();
        this.executor = factory.createQueryExecutor();
    }

    public void dbConnect() {
        this.conn.connect();
    }

    public void executeQuery(String sql) {
        this.executor.executeQuery(sql);
    }
}
