package prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserSession implements Prototype<UserSession> {

    private String userId;
    private List<String> cart;
    private Map<String, String> preferences;

    public UserSession() {
        this.cart = new ArrayList<>();
        this.preferences = new HashMap<>();
    }

    public UserSession(UserSession userSession) {
        this.userId = userSession.userId;
        this.cart = new ArrayList<>(userSession.cart);
        this.preferences = new HashMap<>(userSession.preferences);
    }

    @Override
    public UserSession clone() {
        return new UserSession(this);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getCart() {
        return cart;
    }

    public void setCart(List<String> cart) {
        this.cart = cart;
    }

    public Map<String, String> getPreferences() {
        return preferences;
    }

    public void setPreferences(Map<String, String> preferences) {
        this.preferences = preferences;
    }

    @Override
    public String toString() {
        return "userId=" + userId + ", cart=" + cart.toString() + ", preferences=" + preferences.toString();
    }
}
