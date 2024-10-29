package Task3;

import static Task3.PaymentService.executePayment;

public class Main {
    public static void main(String[] args) {
        PayPalProcessor payPal = new PayPalProcessor();
        CreditCartProcessor creditCard = new CreditCartProcessor();

        executePayment(payPal , 200);
        executePayment(creditCard, 3000);
    }
}
