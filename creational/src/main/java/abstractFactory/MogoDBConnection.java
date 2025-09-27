package abstractFactory;

public class MogoDBConnection implements DBConnection{
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB connection...");
    }
}
