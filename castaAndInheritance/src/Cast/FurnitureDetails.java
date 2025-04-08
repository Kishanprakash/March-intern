package Cast;

public class FurnitureDetails extends Furniture {
    @Override
    public void assemble() {
        System.out.println("Overridden: assemble in FurnitureDetails");
    }

    @Override
    public void disassemble() {
        System.out.println("Overridden: disassemble in FurnitureDetails");
    }

    @Override
    public void clean() {
        System.out.println("Overridden: clean in FurnitureDetails");
    }

    @Override
    public void move() {
        System.out.println("Overridden: move in FurnitureDetails");
    }

    @Override
    public void polish() {
        System.out.println("Overridden: polish in FurnitureDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in FurnitureDetails");
    }
}
