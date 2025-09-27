package prototype;

public class Main {
    public static void main (String[] args) {
        SessionManager sessionManager = new SessionManager();

        sessionManager.registerPrototype("guest", new GuestUserSession());
        sessionManager.registerPrototype("premium", new PremiumUserSession());

        UserSession aliceSession = sessionManager.createSession("premium","Alice");
        aliceSession.getCart().add("Book");

        UserSession bobSession = sessionManager.createSession("guest","Bob");

        System.out.println(aliceSession);

        System.out.println(bobSession);
    }
}
