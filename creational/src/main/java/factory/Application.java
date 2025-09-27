package factory;

public abstract class Application {

    protected abstract Document createDocument();

    public void newDocument() {
        Document document = createDocument();
        document.open();
    }
}
