package Cast;

public class GameMeatRunner {
    public static void main(String[] args) {

        GameMeat gameMeat1 = new GameMeat();
        gameMeat1.color();
        gameMeat1.kg();
        gameMeat1.size();
        gameMeat1.origin();
        gameMeat1.price();
        System.out.println("----------------------");

        GameMeat gameMeat2 = new GameMeatDetails();
        gameMeat2.color();
        gameMeat2.kg();
        gameMeat2.size();
        gameMeat2.origin();
        gameMeat2.price();
        System.out.println("----------------------");

        GameMeatDetails gameMeat3 = new GameMeatDetails();
        gameMeat3.color();
        gameMeat3.kg();
        gameMeat3.size();
        gameMeat3.origin();
        gameMeat3.price();
        gameMeat3.extraMethod();
        System.out.println("----------------------");

        GameMeatCast caster = new GameMeatCast();
        caster.cast(gameMeat2);
    }
}
