package self.prototype;

/**
 * @author lingliang 2018年08月2018/8/9日 下午8:58
 */
public interface Shape extends Cloneable{

    /**
     * 获取形状描述
     * @return
     */
    String getDesc();

    /**
     * clone
     * @return
     */
    Object clone();

}
