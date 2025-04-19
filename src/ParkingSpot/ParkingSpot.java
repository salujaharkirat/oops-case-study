package ParkingSpot;

import Vehicle.Vehicle;

public abstract class ParkingSpot {
  private String id;
  private boolean isFree;
  private Vehicle vehicle;



  public abstract boolean getIsFree();
}
