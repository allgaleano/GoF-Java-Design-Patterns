package chainOfResponsability;

public class OrderRequest {
    String userId;
    boolean itemInStock;
    boolean paymentValid;

    public OrderRequest(String userId, boolean itemInStock, boolean paymentValid) {
        this.userId = userId;
        this.itemInStock = itemInStock;
        this.paymentValid = paymentValid;
    }

    @Override
    public String toString() {
        return "Order:{userId=" + userId + ", itemInStock=" + itemInStock + ", paymentValid=" + paymentValid + "}";
    }
}
