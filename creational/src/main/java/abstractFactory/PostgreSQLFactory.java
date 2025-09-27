package abstractFactory;

public class PostgreSQLFactory extends DatabaseFactory{
    @Override
    public DBConnection createConnection() {
        return new PostgreSQLConnection();
    }

    @Override
    public QueryExecutor createQueryExecutor() {
        return new PostgreSQLQueryExecutor();
    }
}
