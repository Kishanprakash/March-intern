package Cast;

public class PlantRunner {
    public static void main(String[] args) {

        Plant plant1 = new Plant();
        plant1.grow();
        plant1.photosynthesize();
        plant1.absorbWater();
        plant1.produceOxygen();
        plant1.bloom();
        System.out.println("----------------------");

        Plant plant2 = new PlantDetails();
        plant2.grow();
        plant2.photosynthesize();
        plant2.absorbWater();
        plant2.produceOxygen();
        plant2.bloom();
        System.out.println("----------------------");

        PlantDetails plant3 = new PlantDetails();
        plant3.grow();
        plant3.photosynthesize();
        plant3.absorbWater();
        plant3.produceOxygen();
        plant3.bloom();
        plant3.extraMethod();
        System.out.println("----------------------");

        PlantCast caster = new PlantCast();
        caster.cast(plant2);
    }
}
