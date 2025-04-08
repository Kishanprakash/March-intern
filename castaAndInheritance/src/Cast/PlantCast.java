package Cast;

public class PlantCast {
    public void cast(Plant plant) {
        System.out.println("Casting Plant");
        plant.grow();
        plant.photosynthesize();
        plant.absorbWater();
        plant.produceOxygen();
        plant.bloom();
        if(plant instanceof PlantDetails) {
            PlantDetails ref = (PlantDetails)plant;
            ref.extraMethod();
        }
    }
}
