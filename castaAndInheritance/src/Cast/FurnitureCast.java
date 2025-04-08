package Cast;

public class FurnitureCast {
    public void cast(Furniture furniture) {
        System.out.println("Casting Furniture");
        furniture.assemble();
        furniture.disassemble();
        furniture.clean();
        furniture.move();
        furniture.polish();
        if(furniture instanceof FurnitureDetails) {
            FurnitureDetails ref = (FurnitureDetails)furniture;
            ref.extraMethod();
        }
    }
}
