package prototype;

public class GuestUserSession extends UserSession {

    public GuestUserSession() {
        super();
        this.getPreferences().put("theme", "light");
        this.getPreferences().put("language", "en");
    }

    public GuestUserSession(GuestUserSession other) {
        super(other);
    }

    @Override
    public GuestUserSession clone() {
        return new GuestUserSession(this);
    }
}
