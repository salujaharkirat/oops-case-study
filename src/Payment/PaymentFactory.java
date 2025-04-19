package Payment;


public class PaymentFactory {
    public static Payment getPayment(String paymentType) {
    if (paymentType.equals("CASH")) {
      return new Cash();
    } else if (paymentType.equals("DEBIT_CARD")) {
      return new DebitCard();
    } else if (paymentType.equals("CREDIT_CARD")) {
      return new CreditCard();
    } 
    return null;
  }
}
