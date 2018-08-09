package self.prototype;

import self.prototype.shape.Factory;

/**
 * @author lingliang 2018年08月2018/8/9日 下午8:57
 */
public class Application {

    public static void main(String[] args) {
        Factory factory = new Factory();
        System.out.println(factory.getShape("rectangle").getDesc());
        System.out.println(factory.getShape("cycle").getDesc());
    }

}
