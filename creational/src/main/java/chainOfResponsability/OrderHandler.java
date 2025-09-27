package chainOfResponsability;

public abstract class OrderHandler {

    private OrderHandler next;

    public OrderHandler setNextHandler(OrderHandler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(OrderRequest request);

    protected boolean handleNext(OrderRequest request) {
        if (next == null) {
            return true;
        }
        return next.handle(request);
    }
}
