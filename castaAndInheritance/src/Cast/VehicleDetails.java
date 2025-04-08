package Cast;

public class VehicleDetails extends Vehicle {
    @Override
    public void start() {
        System.out.println("Overridden: start in VehicleDetails");
    }

    @Override
    public void stop() {
        System.out.println("Overridden: stop in VehicleDetails");
    }

    @Override
    public void accelerate() {
        System.out.println("Overridden: accelerate in VehicleDetails");
    }

    @Override
    public void brake() {
        System.out.println("Overridden: brake in VehicleDetails");
    }

    @Override
    public void honk() {
        System.out.println("Overridden: honk in VehicleDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in VehicleDetails");
    }
}
