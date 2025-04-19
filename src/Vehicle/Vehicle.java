package Vehicle;

import ParkingTicket.ParkingTicket;

public abstract class Vehicle {
  private String licenseNumber;
  public abstract void assignTicket(ParkingTicket ticket);

  public String getLicenseNumber () {
    return this.licenseNumber;
  }
}
