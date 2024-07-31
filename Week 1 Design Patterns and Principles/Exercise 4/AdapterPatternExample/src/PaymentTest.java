public class PaymentTest {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        Stripe stripe = new Stripe();

        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);

        payPalAdapter.processPayment(100.0);
        stripeAdapter.processPayment(200.0);
    }
}
