package self.prototype.shape;

import self.prototype.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lingliang 2018年08月2018/8/9日 下午9:01
 */
public class Factory {

    private Map<String,Shape> protoType = new HashMap<String, Shape>(){{
        put("rectangle",new Rectangle());
        put("cycle",new Cycle());
    }};

    public Shape getShape(String shape){
        Shape shapeObj= protoType.get(shape);
        if(shapeObj == null){
            return null;
        }
        return (Shape) shapeObj.clone();
    }

}
