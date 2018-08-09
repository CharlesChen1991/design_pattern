package self.builder.kfc;

import self.builder.kfc.impl.ChickenBerger;
import self.builder.kfc.impl.Cola;
import self.builder.kfc.impl.FoodBuilderImpl;

import java.math.BigDecimal;
import java.util.List;

/**
 * 这个类没有用传入builder的形式去做。因为只有一个builder
 * @author lingliang 2018年08月2018/8/5日 下午9:56
 */
public class FoodSetDirector {

    public List<BaseFood> getCheapFoodSet(){
        FoodBuilder foodBuilder = new FoodBuilderImpl();
        foodBuilder.put(new ChickenBerger())
                   .setPrice(new BigDecimal(30))
                   .setDegree(0)
                   .setPackagingWay(PackagingWay.EASY_PACKAGING)
                   .addToSet();
        return foodBuilder.getProductSet();
    }

    public List<BaseFood> getExpensiveFoodSet(){
        FoodBuilder foodBuilder = new FoodBuilderImpl();
        foodBuilder.put(new ChickenBerger())
                   .setPrice(new BigDecimal(30))
                   .setDegree(0)
                   .setPackagingWay(PackagingWay.COMPLEX_PACKAGING)
                   .addToSet()
                   .put(new ChickenBerger())
                   .setPrice(new BigDecimal(30))
                   .setDegree(0)
                   .setPackagingWay(PackagingWay.COMPLEX_PACKAGING)
                   .addToSet()
                   .put(new Cola())
                   .setPrice(new BigDecimal(10))
                   .setDegree(0)
                   .setPackagingWay(PackagingWay.COMPLEX_PACKAGING)
                   .addToSet();
        return foodBuilder.getProductSet();
    }

}
