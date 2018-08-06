package self.builder.kfc;

import java.math.BigDecimal;
import java.util.List;

/**
 * 建造者类，负责产生食品，提供公用个性化功能。
 * @author lingliang 2018年08月2018/8/5日 下午5:08
 */
public interface FoodBuilder {

    /**
     * 获取成品
     * @return
     */
    List<BaseFood> getProductSet();

    /**
     * 设置食品价格
     * @param price
     */
    FoodBuilder setPrice(BigDecimal price);

    /**
     * 食物打包方式
     * @param packagingWay
     */
    FoodBuilder setPackagingWay(PackagingWay packagingWay);

    /**
     * 温度
     * @param degree
     */
    FoodBuilder setDegree(Integer degree);

    FoodBuilder put(BaseFood food);

    FoodBuilder addToSet();
}
