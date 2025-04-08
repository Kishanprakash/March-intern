package Cast;

public class BeveragesRunner {
    public static void main(String[] args) {

        Beverages beverages1 = new Beverages();
        beverages1.temperature();
        beverages1.volume();
        beverages1.brand();
        beverages1.ingredients();
        beverages1.price();
        System.out.println("----------------------");

        Beverages beverages2 = new BeveragesDetails();
        beverages2.temperature();
        beverages2.volume();
        beverages2.brand();
        beverages2.ingredients();
        beverages2.price();
        System.out.println("----------------------");

        BeveragesDetails beverages3 = new BeveragesDetails();
        beverages3.temperature();
        beverages3.volume();
        beverages3.brand();
        beverages3.ingredients();
        beverages3.price();
        beverages3.extraMethod();
        System.out.println("----------------------");

        BeveragesCast caster = new BeveragesCast();
        caster.cast(beverages2);
    }
}
