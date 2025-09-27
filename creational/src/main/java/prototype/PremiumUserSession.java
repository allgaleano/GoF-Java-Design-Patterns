package prototype;

public class PremiumUserSession extends UserSession {

    public PremiumUserSession() {
        super();
        this.getPreferences().put("theme", "light");
        this.getPreferences().put("language", "en");
        this.getPreferences().put("ads", "disabled");
    }

    public PremiumUserSession(PremiumUserSession other) {
        super(other);
    }

    @Override
    public PremiumUserSession clone() {
        return new PremiumUserSession(this);
    }
}
