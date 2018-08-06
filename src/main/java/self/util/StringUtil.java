package self.util;

/**
 * @author lingliang 2018年08月2018/8/5日 下午9:14
 */
public class StringUtil {

    public static boolean isBlank(String str) {
        if (str == null) {
            return true;
        }
        return str.length() <= 0;
    }

}
