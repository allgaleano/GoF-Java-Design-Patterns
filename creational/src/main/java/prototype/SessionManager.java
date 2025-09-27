package prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SessionManager {
    private final Map<String, Prototype<? extends UserSession>> prototypeRegistry = new HashMap<>();

    public SessionManager() {
        UserSession defaultUserSession = new UserSession();
        defaultUserSession.setPreferences(Map.of(
                "theme", "dark",
                "language", "en"
        ));
        defaultUserSession.setCart(new ArrayList<>());
        defaultUserSession.setUserId("");
        this.prototypeRegistry.put("USER", defaultUserSession);
    }

    public void registerPrototype(String role, Prototype<? extends UserSession> prototype) {
        prototypeRegistry.put(role, prototype);
    }

    public UserSession createSession(String role, String userId) {
        Prototype<? extends UserSession> prototype = prototypeRegistry.get(role);
        if (prototype == null) {
            throw new IllegalArgumentException("No prototype registered for role: " + role);
        }
        UserSession session = prototype.clone();
        session.setUserId(userId);
        return session;
    }
}
