package abstractFactory;

public class MySQLQueryExecutor implements QueryExecutor{
    @Override
    public void executeQuery(String sql) {
        System.out.println("Executing MySQL query: " + sql);
    }
}
