package Task3;

public class CreditCartProcessor implements PaymentProcessor{
    @Override
    public void process(double amount) {
        System.out.println(amount + " was processed CreditCardProcessor");
    }
}
