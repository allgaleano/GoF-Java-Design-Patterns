package chainOfResponsability;

public class OrderService {

    private final OrderHandler handler;

    public OrderService(OrderHandler handler) {
        this.handler = handler;
    }

    public void requestOrder(OrderRequest request) {
        System.out.println("Requesting " + request);
        if (handler.handle(request)){
            System.out.println("Order placed successfully!");
        }
    }
}
