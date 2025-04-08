package Cast;

public class VehicleRunner {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        vehicle1.start();
        vehicle1.stop();
        vehicle1.accelerate();
        vehicle1.brake();
        vehicle1.honk();
        System.out.println("----------------------");

        Vehicle vehicle2 = new VehicleDetails();
        vehicle2.start();
        vehicle2.stop();
        vehicle2.accelerate();
        vehicle2.brake();
        vehicle2.honk();
        System.out.println("----------------------");

        VehicleDetails vehicle3 = new VehicleDetails();
        vehicle3.start();
        vehicle3.stop();
        vehicle3.accelerate();
        vehicle3.brake();
        vehicle3.honk();
        vehicle3.extraMethod();
        System.out.println("----------------------");

        VehicleCast caster = new VehicleCast();
        caster.cast(vehicle2);
    }
}
