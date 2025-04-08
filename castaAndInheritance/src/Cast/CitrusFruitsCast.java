package Cast;

public class CitrusFruitsCast {
    public void cast(CitrusFruits citrusFruits) {
        System.out.println("Casting CitrusFruits");
        citrusFruits.color();
        citrusFruits.kg();
        citrusFruits.size();
        citrusFruits.origin();
        citrusFruits.price();
        if(citrusFruits instanceof CitrusFruitsDetails) {
            CitrusFruitsDetails ref = (CitrusFruitsDetails)citrusFruits;
            ref.extraMethod();
        }
    }
}
