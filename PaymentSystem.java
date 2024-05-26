public class PaymentSystem {
    public boolean makePayment(String paymentType, double amount) {
    boolean isPaid = false;
    if (paymentType.equals("CreditCard")) {
    System.out.println("making payment using credit ");
    isPaid = paymentUsingCreditCard(amount);
    }
    else if (paymentType.equals("PayPal")) {
    System.out.println("making payment using PayPal ");
    isPaid = paymentUsingPayPal(amount);
    }
    else if (paymentType.equals("Bank")) {
    System.out.println("making payment using Bank ");
    isPaid = paymentUsingBank(amount);
    }
    return isPaid;
    }
    private boolean paymentUsingCreditCard(double amount) {
    // do something
    return true;
    }
    private boolean paymentUsingPayPal(double amount) {
    // do something
    return true;
    }
    private boolean paymentUsingBank(double amount) {
    // do something
    return true;
    }
    private boolean paymentUsingBkash(double amount) {
    // do something
    return true;
    }
    public static void main(String[] args) {
    PaymentSystem paymentSystem = new PaymentSystem();
    paymentSystem.makePayment("Bank", 200);
    paymentSystem.makePayment("Bkash", 500);
    paymentSystem.makePayment("CreditCard", 5500);
    }
    }