package Cast;

public class HeroSubclass extends  Herocycle{

//    public HeroSubclass()
//    {
//        System.out.println("no arg const in Hero Subclass");
//    }

    @Override
    public  void pedal()
    {
        System.out.println("pedal is running in Hero sub");
    }

    public void tire()
    {
        System.out.println("tire");
    }

}
