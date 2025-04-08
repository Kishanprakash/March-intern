package Cast;

public class FurnitureRunner {
    public static void main(String[] args) {

        Furniture furniture1 = new Furniture();
        furniture1.assemble();
        furniture1.disassemble();
        furniture1.clean();
        furniture1.move();
        furniture1.polish();
        System.out.println("----------------------");

        Furniture furniture2 = new FurnitureDetails();
        furniture2.assemble();
        furniture2.disassemble();
        furniture2.clean();
        furniture2.move();
        furniture2.polish();
        System.out.println("----------------------");

        FurnitureDetails furniture3 = new FurnitureDetails();
        furniture3.assemble();
        furniture3.disassemble();
        furniture3.clean();
        furniture3.move();
        furniture3.polish();
        furniture3.extraMethod();
        System.out.println("----------------------");

        FurnitureCast caster = new FurnitureCast();
        caster.cast(furniture2);
    }
}
