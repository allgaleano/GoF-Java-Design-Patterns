package chainOfResponsability;

public class StockHandler extends OrderHandler{
    @Override
    public boolean handle(OrderRequest request) {
        if (!request.itemInStock) {
            System.out.println("Item out of stock");
            return false;
        }
        return handleNext(request);
    }
}
