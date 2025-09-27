package chainOfResponsability;

public class PaymentHandler extends OrderHandler{
    @Override
    public boolean handle(OrderRequest request) {
        if (!request.paymentValid) {
            System.out.println("Payment declined");
            return false;
        }
        return handleNext(request);
    }
}
