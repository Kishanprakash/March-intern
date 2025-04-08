package Cast;

public class ComputerRunner {
    public static void main(String[] args) {

        Computer computer1 = new Computer();
        computer1.boot();
        computer1.shutdown();
        computer1.process();
        computer1.connect();
        computer1.update();
        System.out.println("----------------------");

        Computer computer2 = new ComputerDetails();
        computer2.boot();
        computer2.shutdown();
        computer2.process();
        computer2.connect();
        computer2.update();
        System.out.println("----------------------");

        ComputerDetails computer3 = new ComputerDetails();
        computer3.boot();
        computer3.shutdown();
        computer3.process();
        computer3.connect();
        computer3.update();
        computer3.extraMethod();
        System.out.println("----------------------");

        ComputerCast caster = new ComputerCast();
        caster.cast(computer2);
    }
}
