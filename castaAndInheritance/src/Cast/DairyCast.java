package Cast;

public class DairyCast {
    public void cast(Dairy dairy) {
        System.out.println("Casting Dairy");
        dairy.fatContent();
        dairy.liters();
        dairy.expiryDate();
        dairy.brand();
        dairy.price();
        if(dairy instanceof DairyDetails) {
            DairyDetails ref = (DairyDetails)dairy;
            ref.extraMethod();
        }
    }
}
