package Exit;

import ParkingLot.ParkingLot;
import Vehicle.Vehicle;

public class Exit {
  private int id;
  private ParkingLot parkingLot;

  public Exit(int id) {
    this.id = id;
  }

  public boolean validateTicket(Vehicle vehicle) {
    return parkingLot.removeVehicle(vehicle);
  }
}
