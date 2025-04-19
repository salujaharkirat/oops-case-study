package ParkingLot;

import java.util.HashMap;

import Constants.Constants;
import ParkingTicket.ParkingTicket;
import Payment.Payment;
import Vehicle.Vehicle;

public class ParkingLot {
   private static ParkingLot instance;
   private int numberOfOccupiedSlots;
   private HashMap<String, ParkingTicket> tickets;
  
  private ParkingLot() {
    this.numberOfOccupiedSlots = 0;
    this.tickets = new HashMap<String, ParkingTicket>();
  }

  public static ParkingLot getInstance() {
    if (instance == null) {
      instance = new ParkingLot();
    }
    return instance;
  }

  public ParkingTicket getParkingTicket(Vehicle vehicle, Payment payment) {
    ParkingTicket parkingTicket = new ParkingTicket(
      vehicle,
      payment
    );
    this.tickets.put(vehicle.getLicenseNumber(), parkingTicket);
    return parkingTicket;
  }

  public boolean isFull() {
    if (this.tickets.size() > Constants.MAX_SLOTS) {
      return true;
    }
    return false;
  }
}
