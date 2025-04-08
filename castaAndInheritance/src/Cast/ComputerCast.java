package Cast;

public class ComputerCast {
    public void cast(Computer computer) {
        System.out.println("Casting Computer");
        computer.boot();
        computer.shutdown();
        computer.process();
        computer.connect();
        computer.update();
        if(computer instanceof ComputerDetails) {
            ComputerDetails ref = (ComputerDetails)computer;
            ref.extraMethod();
        }
    }
}
