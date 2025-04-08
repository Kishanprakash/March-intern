package Cast;

public class BeveragesCast {
    public void cast(Beverages beverages) {
        System.out.println("Casting Beverages");
        beverages.temperature();
        beverages.volume();
        beverages.brand();
        beverages.ingredients();
        beverages.price();
        if(beverages instanceof BeveragesDetails) {
            BeveragesDetails ref = (BeveragesDetails)beverages;
            ref.extraMethod();
        }
    }
}
