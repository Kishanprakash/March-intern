package Cast;

public class PickledFoodsCast {
    public void cast(PickledFoods pickledFoods) {
        System.out.println("Casting PickledFoods");
        pickledFoods.color();
        pickledFoods.kg();
        pickledFoods.size();
        pickledFoods.origin();
        pickledFoods.price();
        if(pickledFoods instanceof PickledFoodsDetails) {
            PickledFoodsDetails ref = (PickledFoodsDetails)pickledFoods;
            ref.extraMethod();
        }
    }
}
