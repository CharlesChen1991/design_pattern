package self.prototype.shape;

import self.prototype.Shape;

/**
 * @author lingliang 2018年08月2018/8/9日 下午9:00
 */
public class Cycle implements Shape {

    public String getDesc() {
        return "this is a cycle";
    }

    @Override
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
