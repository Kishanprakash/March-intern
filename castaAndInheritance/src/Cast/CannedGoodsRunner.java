package Cast;

public class CannedGoodsRunner {
    public static void main(String[] args) {

        CannedGoods cannedGoods1 = new CannedGoods();
        cannedGoods1.color();
        cannedGoods1.kg();
        cannedGoods1.size();
        cannedGoods1.origin();
        cannedGoods1.price();
        System.out.println("----------------------");

        CannedGoods cannedGoods2 = new CannedGoodsDetails();
        cannedGoods2.color();
        cannedGoods2.kg();
        cannedGoods2.size();
        cannedGoods2.origin();
        cannedGoods2.price();
        System.out.println("----------------------");

        CannedGoodsDetails cannedGoods3 = new CannedGoodsDetails();
        cannedGoods3.color();
        cannedGoods3.kg();
        cannedGoods3.size();
        cannedGoods3.origin();
        cannedGoods3.price();
        cannedGoods3.extraMethod();
        System.out.println("----------------------");

        CannedGoodsCast caster = new CannedGoodsCast();
        caster.cast(cannedGoods2);
    }
}
