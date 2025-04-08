package Cast;

public class ComputerDetails extends Computer {
    @Override
    public void boot() {
        System.out.println("Overridden: boot in ComputerDetails");
    }

    @Override
    public void shutdown() {
        System.out.println("Overridden: shutdown in ComputerDetails");
    }

    @Override
    public void process() {
        System.out.println("Overridden: process in ComputerDetails");
    }

    @Override
    public void connect() {
        System.out.println("Overridden: connect in ComputerDetails");
    }

    @Override
    public void update() {
        System.out.println("Overridden: update in ComputerDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ComputerDetails");
    }
}
