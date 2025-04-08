package Cast;

public class CannedGoodsDetails extends CannedGoods {
    @Override
    public void color() {
        System.out.println("Overridden: color in CannedGoodsDetails");
    }

    @Override
    public void kg() {
        System.out.println("Overridden: kg in CannedGoodsDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in CannedGoodsDetails");
    }

    @Override
    public void origin() {
        System.out.println("Overridden: origin in CannedGoodsDetails");
    }

    @Override
    public void price() {
        System.out.println("Overridden: price in CannedGoodsDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in CannedGoodsDetails");
    }
}
