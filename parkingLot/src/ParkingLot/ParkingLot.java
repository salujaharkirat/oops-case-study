package ParkingLot;

import java.time.Duration;
import java.util.HashMap;

import Constants.Constants;
import ParkingRate.ParkingRate;
import ParkingTicket.ParkingTicket;
import Payment.Payment;
import Vehicle.Vehicle;

public class ParkingLot {
   private static ParkingLot instance;
   private HashMap<String, ParkingTicket> tickets;
  
  private ParkingLot() {
    this.tickets = new HashMap<String, ParkingTicket>();
  }

  public static ParkingLot getInstance() {
    if (instance == null) {
      instance = new ParkingLot();
    }
    return instance;
  }

  public ParkingTicket parkVehicle(Vehicle vehicle, Payment payment) {
    if (this.isFull()) {
      return null;
    }
    ParkingTicket parkingTicket = new ParkingTicket(
      vehicle,
      payment
    );
    this.tickets.put(vehicle.getLicenseNumber(), parkingTicket);
    return parkingTicket;
  }

  public boolean removeVehicle(Vehicle vehicle, ParkingTicket parkingTicket) {
    if (!this.tickets.containsKey(vehicle.getLicenseNumber())) {
      return false;
    }
    int duration = Duration.between(parkingTicket.getTimeStamp(), parkingTicket.getExitAt()).toHours();
    double price = new ParkingRate(duration).getFare();
    parkingTicket.getPayment().makePayment(price);
    this.tickets.remove(vehicle.getLicenseNumber());
    return true;
  }

  public boolean isFull() {
    if (this.tickets.size() > Constants.MAX_SLOTS) {
      return true;
    }
    return false;
  }
}
