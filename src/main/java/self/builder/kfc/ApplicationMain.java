package self.builder.kfc;

/**
 * @author lingliang 2018年08月2018/8/5日 下午5:06
 */
public class ApplicationMain {

    public static void main(String[] args) {
        FoodSetDirector director = new FoodSetDirector();
        System.out.println(director.getCheapFoodSet());
        System.out.println(director.getExpensiveFoodSet());
    }

}
