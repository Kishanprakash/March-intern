public class Maggi {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.ads(new Display());

        Theater theater = new Theater();
        theater.show(new Poster());

        Cricket cricket = new Cricket();
        cricket.details(new Rcb());

        Space space = new Space();
        space.travel(new Galaxy());

        Rocket rocket = new Rocket();
        rocket.launch(new Engine());

        Dolo650 dolo = new Dolo650();
        dolo.use(new Fever());

        Barber barber = new Barber();
        barber.cut(new Haircut());

        Camera camera = new Camera();
        camera.capture(new Lens());

        Mango mango = new Mango();
        mango.grow(new Tree());

        Pillow pillow = new Pillow();
        pillow.use(new Sleep());
}

}
