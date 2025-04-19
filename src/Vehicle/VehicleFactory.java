package Vehicle;


public class VehicleFactory {
  public static Vehicle getVehicle(String vehicleType) {
    if (vehicleType.equals("CAR")) {
      return new Car();
    } else if (vehicleType.equals("MOTORCYCLE")) {
      return new Motorcycle();
    } else if (vehicleType.equals("VAN")) {
      return new Van();
    } else if (vehicleType.equals("TRUCK")) {
      return new Truck();
    }
    return null;
  }
}