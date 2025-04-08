package Cast;

public class CitrusFruitsRunner {
    public static void main(String[] args) {

        CitrusFruits citrusFruits1 = new CitrusFruits();
        citrusFruits1.color();
        citrusFruits1.kg();
        citrusFruits1.size();
        citrusFruits1.origin();
        citrusFruits1.price();
        System.out.println("----------------------");

        CitrusFruits citrusFruits2 = new CitrusFruitsDetails();
        citrusFruits2.color();
        citrusFruits2.kg();
        citrusFruits2.size();
        citrusFruits2.origin();
        citrusFruits2.price();
        System.out.println("----------------------");

        CitrusFruitsDetails citrusFruits3 = new CitrusFruitsDetails();
        citrusFruits3.color();
        citrusFruits3.kg();
        citrusFruits3.size();
        citrusFruits3.origin();
        citrusFruits3.price();
        citrusFruits3.extraMethod();
        System.out.println("----------------------");

        CitrusFruitsCast caster = new CitrusFruitsCast();
        caster.cast(citrusFruits2);
    }
}
