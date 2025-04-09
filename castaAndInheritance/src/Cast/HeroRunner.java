package Cast;

public class HeroRunner {
    public static void main(String[] args) {
        Herocycle herocycle=new Herocycle();


        HeroSubclass heroSubclass=new HeroSubclass();

        HeroCast heroCast=new HeroCast();
        heroCast.origin(herocycle);
        heroCast.origin(heroSubclass);




    }
}
