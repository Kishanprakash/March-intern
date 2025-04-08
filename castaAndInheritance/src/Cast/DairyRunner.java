package Cast;

public class DairyRunner {
    public static void main(String[] args) {

        Dairy dairy1 = new Dairy();
        dairy1.fatContent();
        dairy1.liters();
        dairy1.expiryDate();
        dairy1.brand();
        dairy1.price();
        System.out.println("----------------------");

        Dairy dairy2 = new DairyDetails();
        dairy2.fatContent();
        dairy2.liters();
        dairy2.expiryDate();
        dairy2.brand();
        dairy2.price();
        System.out.println("----------------------");

        DairyDetails dairy3 = new DairyDetails();
        dairy3.fatContent();
        dairy3.liters();
        dairy3.expiryDate();
        dairy3.brand();
        dairy3.price();
        dairy3.extraMethod();
        System.out.println("----------------------");

        DairyCast caster = new DairyCast();
        caster.cast(dairy2);
    }
}
