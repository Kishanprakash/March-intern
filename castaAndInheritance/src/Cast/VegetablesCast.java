package Cast;

public class VegetablesCast {
    public void cast(Vegetables vegetables) {
        System.out.println("Casting Vegetables");
        vegetables.color();
        vegetables.kg();
        vegetables.size();
        vegetables.origin();
        vegetables.price();
        if(vegetables instanceof VegetablesDetails) {
            VegetablesDetails ref = (VegetablesDetails)vegetables;
            ref.extraMethod();
        }
    }
}
