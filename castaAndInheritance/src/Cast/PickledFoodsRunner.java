package Cast;

public class PickledFoodsRunner {
    public static void main(String[] args) {

        PickledFoods pickledFoods1 = new PickledFoods();
        pickledFoods1.color();
        pickledFoods1.kg();
        pickledFoods1.size();
        pickledFoods1.origin();
        pickledFoods1.price();
        System.out.println("----------------------");

        PickledFoods pickledFoods2 = new PickledFoodsDetails();
        pickledFoods2.color();
        pickledFoods2.kg();
        pickledFoods2.size();
        pickledFoods2.origin();
        pickledFoods2.price();
        System.out.println("----------------------");

        PickledFoodsDetails pickledFoods3 = new PickledFoodsDetails();
        pickledFoods3.color();
        pickledFoods3.kg();
        pickledFoods3.size();
        pickledFoods3.origin();
        pickledFoods3.price();
        pickledFoods3.extraMethod();
        System.out.println("----------------------");

        PickledFoodsCast caster = new PickledFoodsCast();
        caster.cast(pickledFoods2);
    }
}
