package abstractFactory;

public abstract class DatabaseFactory {
    public abstract DBConnection createConnection();
    public abstract QueryExecutor createQueryExecutor();
}
