package Cast;

public class GameMeatCast {
    public void cast(GameMeat gameMeat) {
        System.out.println("Casting GameMeat");
        gameMeat.color();
        gameMeat.kg();
        gameMeat.size();
        gameMeat.origin();
        gameMeat.price();
        if(gameMeat instanceof GameMeatDetails) {
            GameMeatDetails ref = (GameMeatDetails)gameMeat;
            ref.extraMethod();
        }
    }
}
