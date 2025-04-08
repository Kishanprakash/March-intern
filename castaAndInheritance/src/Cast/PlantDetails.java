package Cast;

public class PlantDetails extends Plant {
    @Override
    public void grow() {
        System.out.println("Overridden: grow in PlantDetails");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Overridden: photosynthesize in PlantDetails");
    }

    @Override
    public void absorbWater() {
        System.out.println("Overridden: absorbWater in PlantDetails");
    }

    @Override
    public void produceOxygen() {
        System.out.println("Overridden: produceOxygen in PlantDetails");
    }

    @Override
    public void bloom() {
        System.out.println("Overridden: bloom in PlantDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in PlantDetails");
    }
}
