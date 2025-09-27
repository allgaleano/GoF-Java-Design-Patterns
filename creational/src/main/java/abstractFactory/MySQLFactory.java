package abstractFactory;

public class MySQLFactory extends DatabaseFactory{
    @Override
    public DBConnection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public QueryExecutor createQueryExecutor() {
        return new MySQLQueryExecutor();
    }
}
