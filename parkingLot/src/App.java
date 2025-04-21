import Entrance.Entrance;
import ParkingLot.ParkingLot;
import ParkingTicket.ParkingTicket;
import Payment.Payment;
import Payment.PaymentFactory;
import Vehicle.Vehicle;
import Vehicle.VehicleFactory;

public class App {
    public static void main(String[] args) throws Exception {
        ParkingLot parkingLot = ParkingLot.getInstance();
        Vehicle vehicle = VehicleFactory.getVehicle("CAR");
        Payment payment = PaymentFactory.getPayment("CASH");
        ParkingTicket parkingTicket = new Entrance(1, parkingLot).getTicket(vehicle, payment);
        
    }
}
