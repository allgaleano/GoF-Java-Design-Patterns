package chainOfResponsability;

public class Main {
    public static void main (String[] args) {
        OrderRequest req1 = new OrderRequest("user123", true, true);
        OrderRequest req2 = new OrderRequest(null, true, true);
        OrderRequest req3 = new OrderRequest("user123", false, true);
        OrderRequest req4 = new OrderRequest("user123", true, false);

        OrderHandler orderHandler = new AuthenticationHandler();
        orderHandler
                        .setNextHandler(new StockHandler())
                        .setNextHandler(new PaymentHandler());

        OrderService orderService = new OrderService(orderHandler);


        orderService.requestOrder(req1);
        orderService.requestOrder(req2);
        orderService.requestOrder(req3);
        orderService.requestOrder(req4);
    }
}
