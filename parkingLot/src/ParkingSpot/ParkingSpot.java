package ParkingSpot;

import Vehicle.Vehicle;

public abstract class ParkingSpot {
  private boolean isFree;
  private Vehicle vehicle;
  private String spotType;

  public ParkingSpot(String spotType) {
    this.vehicle = null;
    this.spotType = spotType;
    this.isFree = true;
  }

  public void assignVehicle(Vehicle vehicle) {
    this.isFree = false;
    this.vehicle = vehicle;
  }

  public void removeVehicle(Vehicle vehicle) {
    this.isFree = true;
    this.vehicle = null;
  }

  public boolean isFree() {
    return this.isFree;
  }
}
