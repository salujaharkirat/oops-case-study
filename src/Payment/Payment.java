package Payment;

enum PaymentStatus {
  COMPLETED, 
  FAILED, 
  PENDING, 
  UNPAID, 
  REFUNDED
}


public abstract class Payment {
  private double amount;
  private String timestamp;
  private PaymentStatus status;

  public abstract void makePayment();
}
