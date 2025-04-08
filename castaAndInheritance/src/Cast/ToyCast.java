package Cast;

public class ToyCast {
    public void cast(Toy toy) {
        System.out.println("Casting Toy");
        toy.playWith();
        toy.putAway();
        toy.clean();
        toy.assemble();
        toy.giftWrap();
        if(toy instanceof ToyDetails) {
            ToyDetails ref = (ToyDetails)toy;
            ref.extraMethod();
        }
    }
}
