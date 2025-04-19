import ParkingLot.ParkingLot;
import Payment.Payment;
import Payment.PaymentFactory;
import Vehicle.Vehicle;
import Vehicle.VehicleFactory;

public class App {
    public static void main(String[] args) throws Exception {
        ParkingLot parkingLot = ParkingLot.getInstance();
        Vehicle vehicle = VehicleFactory.getVehicle("CAR");
        Payment payment = PaymentFactory.getPayment("CASH");
        parkingLot.getParkingTicket(vehicle, payment);
        System.out.println("Hello, World!");
    }
}
