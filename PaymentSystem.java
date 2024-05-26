interface PaymentStrategy 
{
    boolean pay(double amount);
}

class CreditCardPayment implements PaymentStrategy 
{
    @Override
    public boolean pay(double amount) 
    {
        System.out.println("Making payment using credit card");
        return true;
    }
}

class PayPalPayment implements PaymentStrategy 
{
    @Override
    public boolean pay(double amount) 
    {
        System.out.println("Making payment using PayPal");
        return true;
    }
}

class BankPayment implements PaymentStrategy 
{
    @Override
    public boolean pay(double amount) 
    {
        System.out.println("Making payment using bank");
        return true;
    }
}

class BkashPayment implements PaymentStrategy 
{
    @Override
    public boolean pay(double amount) 
    {
        System.out.println("Making payment using Bkash");
        return true;
    }
}


public class PaymentSystem 
{
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) 
    {
        this.paymentStrategy = paymentStrategy;
    }


    public boolean makePayment(double amount) 
    {
        if (paymentStrategy == null) 
        {
            throw new IllegalStateException("Payment strategy not set");
        }
        return paymentStrategy.pay(amount);
    }

    public static void main(String[] args) 
    {
        PaymentSystem paymentSystem = new PaymentSystem();

        paymentSystem.setPaymentStrategy(new BankPayment());
        paymentSystem.makePayment(200);

        paymentSystem.setPaymentStrategy(new PayPalPayment());
        paymentSystem.makePayment(500);

        paymentSystem.setPaymentStrategy(new CreditCardPayment());
        paymentSystem.makePayment(5500);
    }
}
