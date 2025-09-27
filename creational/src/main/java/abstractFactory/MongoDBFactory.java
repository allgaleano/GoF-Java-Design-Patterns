package abstractFactory;

public class MongoDBFactory extends DatabaseFactory{
    @Override
    public DBConnection createConnection() {
        return new MogoDBConnection();
    }

    @Override
    public QueryExecutor createQueryExecutor() {
        return new MongoDBQueryExecutor();
    }
}
