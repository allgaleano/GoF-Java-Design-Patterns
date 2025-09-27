package singleton;

public class Logger {
    private static Logger instance;

    private Logger() {
        try {
            Thread.sleep(100); // 100ms delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String text) {
        System.out.println("[LOG]:" + text);
    }
}
