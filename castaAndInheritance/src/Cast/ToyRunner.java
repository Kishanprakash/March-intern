package Cast;

public class ToyRunner {
    public static void main(String[] args) {

        Toy toy1 = new Toy();
        toy1.playWith();
        toy1.putAway();
        toy1.clean();
        toy1.assemble();
        toy1.giftWrap();
        System.out.println("----------------------");

        Toy toy2 = new ToyDetails();
        toy2.playWith();
        toy2.putAway();
        toy2.clean();
        toy2.assemble();
        toy2.giftWrap();
        System.out.println("----------------------");

        ToyDetails toy3 = new ToyDetails();
        toy3.playWith();
        toy3.putAway();
        toy3.clean();
        toy3.assemble();
        toy3.giftWrap();
        toy3.extraMethod();
        System.out.println("----------------------");

        ToyCast caster = new ToyCast();
        caster.cast(toy2);
    }
}
