package chainOfResponsability;

public class AuthenticationHandler extends OrderHandler{
    @Override
    public boolean handle(OrderRequest request) {
        if (request.userId == null) {
            System.out.println("Authentication failed");
            return false;
        }
        return handleNext(request);
    }
}
