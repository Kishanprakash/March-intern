package Cast;

public class CannedGoodsCast {
    public void cast(CannedGoods cannedGoods) {
        System.out.println("Casting CannedGoods");
        cannedGoods.color();
        cannedGoods.kg();
        cannedGoods.size();
        cannedGoods.origin();
        cannedGoods.price();
        if(cannedGoods instanceof CannedGoodsDetails) {
            CannedGoodsDetails ref = (CannedGoodsDetails)cannedGoods;
            ref.extraMethod();
        }
    }
}
