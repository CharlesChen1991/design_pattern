package self.builder.kfc.impl;

import self.builder.kfc.BaseFood;
import self.builder.kfc.FoodBuilder;
import self.builder.kfc.PackagingWay;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lingliang 2018年08月2018/8/5日 下午9:34
 */
public class FoodBuilderImpl implements FoodBuilder {

    private List<BaseFood> foodSet = new ArrayList<BaseFood>();

    private BaseFood currentFood = null;

    private boolean done = false;

    public List<BaseFood> getProductSet() {
        if(done){
            return foodSet;
        }else{
            throw new RuntimeException("未完成套餐");
        }
    }

    public FoodBuilder setPrice(BigDecimal price) {
        currentFood.setPrice(price);
        return this;
    }

    public FoodBuilder setPackagingWay(PackagingWay packagingWay) {
        currentFood.setPackagingWay(packagingWay);
        return this;
    }

    public FoodBuilder setDegree(Integer degree) {
        currentFood.setDegree(degree);
        return this;
    }

    public FoodBuilder put(BaseFood food){
        if(food == null){
            throw new RuntimeException("未知食物");
        }
        this.done = false;
        currentFood = food;
        return this;
    }

    public FoodBuilder addToSet(){
        foodSet.add(currentFood);
        this.done = true;
        return this;
    }
}
