package abstractFactory;

public class PostgreSQLQueryExecutor implements QueryExecutor{
    @Override
    public void executeQuery(String sql) {
        System.out.println("Executing PostgreSQL query: " + sql);
    }
}
