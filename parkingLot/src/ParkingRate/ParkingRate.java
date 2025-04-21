package ParkingRate;

import Constants.Constants;

public class ParkingRate {
  private int hours;

  public ParkingRate(int hours) {
    this.hours = hours;
  }
  
  public double getFare() {
    if (hours <= 0) {
      return 0;
    }

    double baseFare = Constants.BASE_FARE;

    int additionalHours = Math.max(0, hours - 2);
    double additionalFare = additionalHours * 10.0;

    return baseFare + additionalFare;
  }
}
