package ParkingTicket;

import java.util.Date;
import java.util.Random;

// import Entrance.Entrance;
// import Exit.Exit;
import Payment.Payment;
import Vehicle.Vehicle;

public class ParkingTicket {
  private int id;
  private Date timestamp;
  private Date exitAt;
  private double amount;

  private Vehicle vehicle;
  private Payment payment;
  // private Entrance entrance;
  // private Exit exit;

  public ParkingTicket(Vehicle vehicle, Payment payment) {
    this.timestamp = new Date();
    this.vehicle = vehicle;
    this.payment = payment;
    this.amount = 0;
    this.exitAt = null;
    this.id = getId();
  }

  private int getId () {
    Random random = new Random();
    int randomId = 100000 + random.nextInt(900000);
    return randomId;
  }

  public ParkingTicket getTicket() {
    return this;
  }
}
