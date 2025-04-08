package Cast;

public class VehicleCast {
    public void cast(Vehicle vehicle) {
        System.out.println("Casting Vehicle");
        vehicle.start();
        vehicle.stop();
        vehicle.accelerate();
        vehicle.brake();
        vehicle.honk();
        if(vehicle instanceof VehicleDetails) {
            VehicleDetails ref = (VehicleDetails)vehicle;
            ref.extraMethod();
        }
    }
}
