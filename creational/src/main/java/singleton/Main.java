package singleton;

public class Main {
    public static void main(String[] args) {

        Runnable task = () -> {
            long start = System.currentTimeMillis();
            Logger logger = Logger.getInstance();
            long end = System.currentTimeMillis();
            logger.log(Thread.currentThread().getName() + ": Logger hash: " + logger.hashCode() + " Created in " + (end - start) + " ms");
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();

//        Logger logger1 = Logger.getInstance();
//        Logger logger2 = Logger.getInstance();
//
//        logger1.log("Application started");
//        logger2.log("User logged in");
//
//        System.out.println(logger1 == logger2);
    }
}
