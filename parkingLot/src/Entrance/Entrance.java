package Entrance;

import ParkingLot.ParkingLot;
import ParkingTicket.ParkingTicket;
import Payment.Payment;
import Vehicle.Vehicle;

public class Entrance {
  private int id;
  private ParkingLot parkingLot;

  public Entrance(int id, ParkingLot parkingLot) {
    this.id = id;
    this.parkingLot = parkingLot;
  }

  public ParkingTicket getTicket(Vehicle vehicle, Payment payment) {
    return parkingLot.parkVehicle(vehicle, payment);
  }  
}
